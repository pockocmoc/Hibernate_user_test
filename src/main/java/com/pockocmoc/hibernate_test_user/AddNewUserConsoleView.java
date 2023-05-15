/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.hibernate_test_user;

import com.pockocmoc.hibernate_test_user.entity.User;
import java.util.Scanner;

/**
 *
 * @author marat
 */
public class AddNewUserConsoleView {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user nick name: ");
        String userName = scanner.nextLine();
        
        System.out.print("Enter user password: ");
        String password = scanner.nextLine();
        
        System.out.print("Enter user email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter user nick first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter user nick last name: ");
        String lastName = scanner.nextLine();

        User user = new User(userName, password, email, firstName, lastName);
        
        AddNewUser addNewUser = new AddNewUser();
        addNewUser.addUser(user);

    }
}
