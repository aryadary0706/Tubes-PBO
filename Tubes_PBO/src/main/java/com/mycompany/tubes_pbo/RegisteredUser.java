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

class RegisteredUser extends User {
    private List<Content> favorites;
    private List<Content> watchlist;
    private List<Content> recommendations;

    public RegisteredUser(String username, String email, String password) {
        super(username, email, password);
        this.favorites = new ArrayList<>();
        this.watchlist = new ArrayList<>();
        this.recommendations = new ArrayList<>();
    }

    public void addToFavorites(Content content) {
        favorites.add(content);
    }

    public void removeFromFavorites(Content content) {
        favorites.remove(content);
    }

    public List<Content> getFavorites() {
        return favorites;
    }

    public List<Content> getWatchlist() {
        return watchlist;
    }

    public List<Content> getRecommendations() {
        return recommendations;
    }
    
    

    @Override
    public void logout() {
        System.out.println("Registered User Logged Out.");
    }
}
