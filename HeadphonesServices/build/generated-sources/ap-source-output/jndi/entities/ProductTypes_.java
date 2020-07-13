package jndi.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jndi.entities.Products;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-13T21:58:24")
@StaticMetamodel(ProductTypes.class)
public class ProductTypes_ { 

    public static volatile CollectionAttribute<ProductTypes, Products> productsCollection;
    public static volatile SingularAttribute<ProductTypes, String> name;
    public static volatile SingularAttribute<ProductTypes, Integer> id;

}