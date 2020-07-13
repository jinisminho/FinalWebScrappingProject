package jndi.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jndi.entities.Categories;
import jndi.entities.ProductTypes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-13T21:58:24")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, String> imgUrl;
    public static volatile SingularAttribute<Products, String> signature;
    public static volatile SingularAttribute<Products, Double> price;
    public static volatile SingularAttribute<Products, String> name;
    public static volatile SingularAttribute<Products, String> description;
    public static volatile SingularAttribute<Products, ProductTypes> typeId;
    public static volatile SingularAttribute<Products, Long> id;
    public static volatile SingularAttribute<Products, Categories> categoryId;

}