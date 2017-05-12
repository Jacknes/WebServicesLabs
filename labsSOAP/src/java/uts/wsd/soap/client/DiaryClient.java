/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap.client;

import java.util.Scanner;

/**
 *
 * @author 12545404
 */
public class DiaryClient {
    public static void main(String[] args) 
    {
        DiaryApp diaryApp = new DiaryApp();
        DiarySOAP diarySOAP = diaryApp.getDiarySOAPPort();
        String email;
        User user;
        boolean found = true;
        do {
            email = readEmail();
            user = diarySOAP.fetchUser(email);
            if (user != null){
                System.out.println("Found " + user.getName());
            } else {
                found = false;
                System.out.println("No such user found.");
            }  
         
        } while(found == true);
        
        
    }
    
    
    public static String readEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email address: ");
        return scanner.nextLine();
        
    }
    
}
