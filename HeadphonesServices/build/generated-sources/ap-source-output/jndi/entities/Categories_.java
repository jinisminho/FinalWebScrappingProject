package jndi.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jndi.entities.GenreCategory;
import jndi.entities.Products;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-13T21:58:24")
@StaticMetamodel(Categories.class)
public class Categories_ { 

    public static volatile CollectionAttribute<Categories, Products> productsCollection;
    public static volatile SingularAttribute<Categories, String> name;
    public static volatile CollectionAttribute<Categories, GenreCategory> genreCategoryCollection;
    public static volatile SingularAttribute<Categories, String> description;
    public static volatile SingularAttribute<Categories, Integer> id;

}