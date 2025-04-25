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

class Movie extends Content implements Contentable{
    private int duration;

    public Movie(int id, String title, Date releaseDate, int duration) {
        super(id, title, releaseDate);
        this.duration = duration;
    }

    public int getDuration(){
        return this.duration;
    }
    
    @Override
    public void info() {
        System.out.println("Movie: " + title + " | Duration: " + duration + " mins");
    }

    @Override
    public float getAverageRating() {
        if (reviews.isEmpty()) return 0f;
        float total = 0f;
        for (Review r : reviews) {
            total += r.getRating().getAvgRate();
        }
        return total / reviews.size();
    }

    @Override
    public int getReviewCount() {
        return reviews.size();
    }

    @Override
    public List<String> getGenres() {
        return genres;
    }

}
