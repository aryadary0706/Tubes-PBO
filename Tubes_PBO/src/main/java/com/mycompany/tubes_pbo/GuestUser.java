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

class GuestUser extends User {
    public GuestUser(String username, String email, String password) {
        super(username, email, password);
    }

    public void login(String username, String email, String password) {
        System.out.println("Login as Guest: " + username);
    }

    @Override
    public void logout() {
        System.out.println("Guest User Logged Out.");
    }
}
