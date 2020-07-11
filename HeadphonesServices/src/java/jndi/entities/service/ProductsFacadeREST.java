/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jndi.entities.service;

import dtos.ProductDetailsDto;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import jndi.entities.MusicGenres;
import jndi.entities.Products;

/**
 *
 * @author Hoang Pham
 */
@Stateless
@Path("jndi.entities.products")
public class ProductsFacadeREST extends AbstractFacade<Products> {

    @PersistenceContext(unitName = "HeadphonesServicesPU")
    private EntityManager em;

    public ProductsFacadeREST() {
        super(Products.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Products entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Products entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Products find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Products> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Products> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     * =======================================================================
     * NATIVE QUERIES
     *
     */
//    GET products recommendations
    //    Service implementation
    private List<Products> getRecommendationsImpl(int genreId, int typeId) {
        List<Products> result = new ArrayList<>();
        if (typeId == 1 || typeId == 2) {
            result = getEntityManager()
                    .createNativeQuery("select products.*\n"
                            + "from products\n"
                            + "inner join genre_category on products.category_id = genre_category.category_id and products.type_id = " + typeId + "\n"
                            + "inner join music_genres on genre_category.genre_id = music_genres.id and music_genres.id = " + genreId + " order by products.price asc",
                            Products.class)
                    .getResultList();
        } else if (typeId == 0) {
            result = getEntityManager()
                    .createNativeQuery("select products.*\n"
                            + "from products\n"
                            + "inner join genre_category on products.category_id = genre_category.category_id\n"
                            + "inner join music_genres on genre_category.genre_id = music_genres.id and music_genres.id = " + genreId + " order by products.price asc",
                             Products.class)
                    .getResultList();
        }

        return result;
    }

    //    Controller
    @GET
    @Path("recommend")
    @Produces(MediaType.APPLICATION_XML)
    public List<Products> getRecommendations(@QueryParam("genre") Integer genreId, @QueryParam("type") Integer typeId) {
        return getRecommendationsImpl(genreId, typeId);
    }

//    GET products details
    //  Service implementaion
    private ProductDetailsDto getDetailsImpl(Long productId) {
        Products product = (Products) getEntityManager()
                .createNativeQuery("Select *"
                        + " from products"
                        + " where products.id = " + String.valueOf(productId), Products.class)
                .getSingleResult();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(product.getName());
        ProductDetailsDto dto = new ProductDetailsDto();
        dto.setCategoryName(product.getCategoryId().getName());
        dto.setCategoryDesc(product.getCategoryId().getDescription());
        dto.setDescription(product.getDescription());
        dto.setId(product.getId());
        dto.setImgUrl(product.getImgUrl());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setSignature(product.getSignature());
        dto.setTypeName(product.getTypeId().getName());
        System.out.println(">>>>>>>>>>>>>>>");
        System.out.println(dto.getName());
        List<MusicGenres> genreList = getEntityManager()
                .createNativeQuery("Select music_genres.*\n"
                        + "from products\n"
                        + "inner join genre_category on products.category_id = genre_category.category_id and products.id = " + dto.getId() + "\n"
                        + "inner join music_genres on genre_category.genre_id = music_genres.id", MusicGenres.class)
                .getResultList();
        for (MusicGenres musicGenres : genreList) {
            System.out.println(musicGenres.getName());
        }
        String tmp = "";
        for (int i = 0; i < genreList.size(); i++) {
            if (i != (genreList.size() - 1)) {
                tmp += genreList.get(i).getName() + ", ";
            } else {
                tmp += genreList.get(i).getName();

            }
        }
        dto.setGenreList(tmp);
        return dto;
    }

    //  Controller
    @GET
    @Path("details/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public ProductDetailsDto getProductsDetails(@PathParam("id") Long id) {
        return getDetailsImpl(id);
    }
//    =======================================================================
}
