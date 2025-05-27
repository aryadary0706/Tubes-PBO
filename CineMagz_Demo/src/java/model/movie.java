/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class movie extends Content implements ContentPage{
    private int duration;

    public movie(int duration, int id, String title, Date releaseDate, String sinopsis, List<String> aktor, List<String> genre) {
        super(id, title, releaseDate, sinopsis, aktor, genre);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public Review DisplayReview() {
        List<Review> reviews = getReviews();
        if (reviews.isEmpty()) {
            System.out.println("Belum ada ulasan untuk film ini.");
            return null;
        }
        for (Review review : reviews) {
            System.out.println("[" + review.getNameUser() + "] - " + review.getReviewText());
            System.out.println("Rating: " + review.getRating().getAverageRate());
        }
        return reviews.get(0); // Mengembalikan ulasan pertama
    }

    @Override
    public double getTotalRating() {
        List<Review> reviews = getReviews();
        if (reviews.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Review review : reviews) {
            total += review.getRating().getAverageRate(); 
        }
        return total;
    }

    @Override
    public void addReview(RegisteredUser user, String reviewText, Rating rating) {
        if (user == null || reviewText == null || rating == null) {
            throw new IllegalArgumentException("User, teks ulasan, atau rating tidak boleh null");
        }
        Review newReview = new Review(user.getUsername(), this, reviewText, rating);
        getReviews().add(newReview);
        System.out.println("Ulasan ditambahkan oleh " + user.getUsername() + " untuk film: " + getTitle());
    }
}
