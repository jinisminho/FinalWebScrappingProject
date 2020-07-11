/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Hoang Pham
 */
public class MusicGenres implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Collection<GenreCategory> genreCategoryCollection;

    public MusicGenres() {
    }

    public MusicGenres(Integer id) {
        this.id = id;
    }

    public MusicGenres(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<GenreCategory> getGenreCategoryCollection() {
        return genreCategoryCollection;
    }

    public void setGenreCategoryCollection(Collection<GenreCategory> genreCategoryCollection) {
        this.genreCategoryCollection = genreCategoryCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MusicGenres)) {
            return false;
        }
        MusicGenres other = (MusicGenres) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jndi.entities.MusicGenres[ id=" + id + " ]";
    }

}
