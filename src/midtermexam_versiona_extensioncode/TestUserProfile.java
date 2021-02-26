/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author Hoang Vu <vuhoan@sheridancollege.ca> <andrewvu270@gmail.com>
 */
public class TestUserProfile {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello! Please enter username: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your favourite genre (Choose from Comedy, Drama, Action, Mystery) ");
        String genre = scanner.nextLine();
        UserProfile newUser = new UserProfile(name, genre);
        System.out.println("New user created\nUsername: " + newUser.getUserID() + "\nGenre: " + newUser.getGenre());
    }
}
