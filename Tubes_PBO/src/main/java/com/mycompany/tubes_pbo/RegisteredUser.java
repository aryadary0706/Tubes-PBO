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

class RegisteredUser extends User {

    private String username;
    private String email;
    private String password;
    private List<Content> favorites;
    private List<Content> watchlist;
    private List<Content> recommendations;
    private List<Content> contentHistory;

    private static int nextId = 111111;

    public RegisteredUser(String username, String email, String password) {
        super(nextId, "Registered");
        nextId++;
        this.username = username;
        this.email = email;
        this.password = password;
        this.favorites = new ArrayList<>();
        this.watchlist = new ArrayList<>();
        this.recommendations = new ArrayList<>();
        this.contentHistory = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Content> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Content> favorites) {
        this.favorites = favorites;
    }

    // Menambahkan konten ke favorit
    public void addToFavorites(Content content) {
        if (!favorites.contains(content)) {
            favorites.add(content);
            System.out.println(content.getTitle() + " ditambahkan ke favorit.");
        } else {
            System.out.println(content.getTitle() + " sudah ada di favorit.");
        }
    }

// Menghapus konten dari favorit
    public void removeFromFavorites(Content content) {
        if (favorites.remove(content)) {
            System.out.println(content.getTitle() + " dihapus dari favorit.");
        } else {
            System.out.println(content.getTitle() + " tidak ditemukan di favorit.");
        }
    }

// Menampilkan semua konten favorit
    public void displayFavorites() {
        if (favorites.isEmpty()) {
            System.out.println("Belum ada konten di favorit.");
        } else {
            System.out.println("Daftar Favorit:");
            for (Content c : favorites) {
                System.out.println("- " + c.getTitle());
            }
        }
    }

    public List<Content> getWatchlist() {
        return watchlist;
    }

    public void setWatchlist(List<Content> watchlist) {
        this.watchlist = watchlist;
    }

    // Menambahkan konten ke watchlist
    public void addToWatchlist(Content content) {
        if (!watchlist.contains(content)) {
            watchlist.add(content);
            System.out.println(content.getTitle() + " ditambahkan ke watchlist.");
        } else {
            System.out.println(content.getTitle() + " sudah ada di watchlist.");
        }
    }

// Menghapus konten dari watchlist
    public void removeFromWatchlist(Content content) {
        if (watchlist.remove(content)) {
            System.out.println(content.getTitle() + " dihapus dari watchlist.");
        } else {
            System.out.println(content.getTitle() + " tidak ditemukan di watchlist.");
        }
    }

// Menampilkan semua konten dalam watchlist
    public void displayWatchlist() {
        if (watchlist.isEmpty()) {
            System.out.println("Belum ada konten di watchlist.");
        } else {
            System.out.println("Daftar Watchlist:");
            for (Content c : watchlist) {
                System.out.println("- " + c.getTitle());
            }
        }
    }

    // Menambahkan rekomendasi konten
    public void addRecommendation(Content content) {
        recommendations.add(content);
        System.out.println("Rekomendasi ditambahkan: " + content.getTitle());
    }

// Menghapus rekomendasi konten
    public void removeRecommendation(Content content) {
        if (recommendations.remove(content)) {
            System.out.println("Rekomendasi dihapus: " + content.getTitle());
        } else {
            System.out.println("Rekomendasi tidak ditemukan: " + content.getTitle());
        }
    }

// Menampilkan semua rekomendasi
    public void displayRecommendations() {
        if (recommendations.isEmpty()) {
            System.out.println("Tidak ada rekomendasi saat ini.");
        } else {
            System.out.println("Daftar Rekomendasi:");
            for (Content c : recommendations) {
                System.out.println("- " + c.getTitle());
            }
        }
    }

    // Menambahkan konten ke riwayat tontonan
    public void addToHistory(Content content) {
        contentHistory.add(content);
        System.out.println("Menonton: " + content.getTitle());
    }

// Menampilkan seluruh riwayat tontonan
    public void displayHistory() {
        if (contentHistory.isEmpty()) {
            System.out.println("Belum ada riwayat tontonan.");
        } else {
            System.out.println("Riwayat Tontonan:");
            for (Content c : contentHistory) {
                System.out.println("- " + c.getTitle() + " (" + c.getReleaseDate() + ")");
            }
        }
    }

    public GuestUser logout() {
        System.out.println("Logout berhasil. Anda sekarang adalah Guest.");
        this.setStatus("Guest");

        // Mengembalikan objek GuestUser
        return new GuestUser();
    }

    @Override
    public void TampilkanAkun() {
        System.out.println("informasi akun:");
        System.out.println("Nama: " + getUsername());
        System.out.println("Email: " + getEmail());
    }
}
