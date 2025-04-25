/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author user
 */
class Review {
    private RegisteredUser user;
    private String text;
    private Rating rating;

    public Review(RegisteredUser user, String text, Rating rating) {
        this.user = user;
        this.text = text;
        this.rating = rating;
    }

    public Rating getRating() {
        return rating;
    }
}
