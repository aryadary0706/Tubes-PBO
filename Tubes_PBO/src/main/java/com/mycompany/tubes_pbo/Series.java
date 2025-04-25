/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author user
 */
import java.util.*;
class Series extends Content {
    private int episodes;

    public Series(int id, String title, Date releaseDate, int episodes) {
        super(id, title, releaseDate);
        this.episodes = episodes;
    }

    @Override
    public void info() {
        System.out.println("Series: " + title + " | Episodes: " + episodes);
    }
}
