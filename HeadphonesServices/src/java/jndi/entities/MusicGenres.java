/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jndi.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Hoang Pham
 */
@Entity
@Table(name = "music_genres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MusicGenres.findAll", query = "SELECT m FROM MusicGenres m")
    , @NamedQuery(name = "MusicGenres.findById", query = "SELECT m FROM MusicGenres m WHERE m.id = :id")
    , @NamedQuery(name = "MusicGenres.findByName", query = "SELECT m FROM MusicGenres m WHERE m.name = :name")})
public class MusicGenres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "genreId")
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

    @XmlTransient
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
