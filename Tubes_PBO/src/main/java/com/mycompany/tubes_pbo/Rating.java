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

    public Rating(int story, int acting, int visual, int directing, int expectation) {
        this.storyRate = story;
        this.actingRate = acting;
        this.visualRate = visual;
        this.directingRate = directing;
        this.expectationScore = expectation;
        this.avgRate = countAvg();
    }

    private float countAvg() {
        return (storyRate + actingRate + visualRate + directingRate + expectationScore) / 5.0f;
    }

    public float getAvgRate() {
        return avgRate;
    }
}
