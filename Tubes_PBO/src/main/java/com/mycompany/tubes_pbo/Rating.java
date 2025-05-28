/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author user
 */
class Rating {
    private int storyRate;
    private int actingRate;
    private int visualRate;
    private int directingRate;
    private int expectationScore;
    private float avgRate;
    /*tambah*/
    private String nama;
    private String reviewText;
    private int score;

    public Rating(int story, int acting, int visual, int directing, int expectation, String nama, String reviewText, int score) {
        this.storyRate = story;
        this.actingRate = acting;
        this.visualRate = visual;
        this.directingRate = directing;
        this.expectationScore = expectation;
        this.avgRate = countAvg();
        /*tambah*/
        this.nama = nama;
        this.reviewText = reviewText;
        this.score = score;
    }

    private float countAvg() {
        return (storyRate + actingRate + visualRate + directingRate + expectationScore) / 5.0f;
    }

    public float getAvgRate() {
        return avgRate;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getReviewText() {
        return reviewText;
    }

    public int getScore() {
        return score;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
}
