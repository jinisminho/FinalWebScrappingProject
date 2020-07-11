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
public enum GenreEnum {
    ROCK(1),
    POP(2),
    KPOP(3),
    CLASSICAL(4),
    JAZZ(5),
    HIPHOP_RAP(6),
    INSTRUMENTAL(7),
    VOCALS(8),
    EDM(9),
    RNB(10);

    private int genreId;

    GenreEnum(int genreId) {
        this.genreId = genreId;
    }

    public int getGenreId() {
        return genreId;
    }
}
