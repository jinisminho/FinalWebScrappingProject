package jndi.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jndi.entities.Categories;
import jndi.entities.MusicGenres;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-11T13:55:00")
@StaticMetamodel(GenreCategory.class)
public class GenreCategory_ { 

    public static volatile SingularAttribute<GenreCategory, MusicGenres> genreId;
    public static volatile SingularAttribute<GenreCategory, Integer> id;
    public static volatile SingularAttribute<GenreCategory, Categories> categoryId;

}