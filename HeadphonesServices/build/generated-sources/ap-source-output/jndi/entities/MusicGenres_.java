package jndi.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jndi.entities.GenreCategory;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-11T13:55:00")
@StaticMetamodel(MusicGenres.class)
public class MusicGenres_ { 

    public static volatile SingularAttribute<MusicGenres, String> name;
    public static volatile CollectionAttribute<MusicGenres, GenreCategory> genreCategoryCollection;
    public static volatile SingularAttribute<MusicGenres, Integer> id;

}