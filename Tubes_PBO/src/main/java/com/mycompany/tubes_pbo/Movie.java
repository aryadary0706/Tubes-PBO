/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

class Movie extends Content {
    private int duration;

    public Movie(int id, String title, Date releaseDate, int duration) {
        super(id, title, releaseDate);
        this.duration = duration;
    }

    @Override
    public void info() {
        System.out.println("Movie: " + title + " | Duration: " + duration + " mins");
    }
}
