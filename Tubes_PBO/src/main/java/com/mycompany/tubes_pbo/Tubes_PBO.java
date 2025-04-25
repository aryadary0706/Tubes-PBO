/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tubes_pbo;

/**
 *
 * @author user
 */
import java.util.*;

public class Tubes_PBO {
    public static void main(String[] args) {
        // Membuat ContentService untuk mengelola konten
        ContentService contentService = new ContentService();

        // Menambahkan beberapa contoh konten
        Movie movie1 = new Movie(1, "Inception", new Date(), 148);
        movie1.genres.add("Sci-Fi");
        movie1.genres.add("Thriller");

        Series series1 = new Series(2, "Breaking Bad", new Date(), 62, 2);
        series1.genres.add("Crime");
        series1.genres.add("Drama");

        contentService.addContent(movie1);
        contentService.addContent(series1);

        // Membuat pengguna terdaftar
        RegisteredUser user1 = new RegisteredUser("Arya", "arya@email.com", "password123");

        // Menambahkan film ke daftar favorit
        user1.addToFavorites(movie1);
        user1.addToFavorites(series1);

        // Menampilkan daftar favorit pengguna
        System.out.println("\n--- Daftar Favorit " + user1.getUsername() + " ---");
        for (Content content : user1.getFavorites()) {
            content.info();
        }

        // Melakukan pencarian konten berdasarkan kata kunci
        System.out.println("\n--- Hasil Pencarian: 'Breaking' ---");
        List<Content> searchResults = contentService.searchContent("Breaking");
        for (Content content : searchResults) {
            content.info();
        }

        // Logout pengguna
        user1.logout();
    }
}

