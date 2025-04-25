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
class Series extends Content implements Contentable{
    private int episodes;
    private int season;

    public Series(int id, String title, Date releaseDate, int episodes, int season) {
        super(id, title, releaseDate);
        this.episodes = episodes;
        this.season = season;
    }

    public int getEpisodes() {
        return episodes;
    }

    public int getSeason() {
        return season;
    }
    
    @Override
    public void info() {
        System.out.println("Movie: " + title + " | Episodes: " + episodes + " | season: " + season);
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
