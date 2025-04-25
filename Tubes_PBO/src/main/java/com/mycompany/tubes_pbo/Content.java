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

import java.util.ArrayList;
public abstract class Content {
    protected int id;
    protected String title;
    protected List<String> synopsis;
    protected List<String> genres;
    protected List<String> actors;
    protected Date releaseDate;
    protected List<Review> reviews;

    public Content(int id, String title, Date releaseDate) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.genres = new ArrayList<>();
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.synopsis = new ArrayList<>();
    }

    public abstract void info();
}

