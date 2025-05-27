/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
import java.util.List;

public class Series implements ContentPage {
    private int id;
    private String title;
    private String genre;
    private String sinopsis;
    private String releaseDate;
    private List<Review> reviews;

    public Series(int id, String title, String genre, String sinopsis, String releaseDate, List<Review> reviews) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.sinopsis = sinopsis;
        this.releaseDate = releaseDate;
        this.reviews = reviews;
    }

    public double getAverageRating() {
    if (reviews == null || reviews.isEmpty()) return 0.0;
    
    // Calculate the average rating from the reviews
    return reviews.stream().mapToInt(Review::getRating).average().orElse(0.0);
}


    @Override
    public void showPage() {
        System.out.println("Menampilkan halaman untuk: " + title);
    }

    @Override
    public void showTopRated() {
        System.out.println("Series dengan rating tinggi: " + title + " (" + getAverageRating() + ")");
    }

    @Override
    public void showMostReviewed() {
        System.out.println("Jumlah review: " + (reviews != null ? reviews.size() : 0));
    }

    @Override
    public void showByGenre() {
        System.out.println("Genre: " + genre);
    }

    // Getter & Setter bisa ditambahkan sesuai kebutuhan
}