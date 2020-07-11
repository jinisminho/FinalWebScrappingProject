/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jndi.entities.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Hoang Pham
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(jndi.entities.service.CategoriesFacadeREST.class);
        resources.add(jndi.entities.service.GenreCategoryFacadeREST.class);
        resources.add(jndi.entities.service.MusicGenresFacadeREST.class);
        resources.add(jndi.entities.service.ProductTypesFacadeREST.class);
        resources.add(jndi.entities.service.ProductsFacadeREST.class);
    }
    
}
