/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Hoang Pham
 */
public enum PathEnum {
//    root
    ROOT("http://localhost:8080/HeadphonesServices/webresources/"),
//    Products
    PRODUCTS("jndi.entities.products/"),
    GET_ALL_PRODUCTS(""),
    GET_RECOMMEND_PRODUCTS("recommend?genre="),
    ;

    private String path;

    PathEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
