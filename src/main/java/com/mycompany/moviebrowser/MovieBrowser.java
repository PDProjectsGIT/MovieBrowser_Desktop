package com.mycompany.moviebrowser;

import pl.polsl.controler.Controller;

/**
 * Main class of the Movie Browser application. This program is used for browsing a movie database.
 * 
 * @author Pawel Drzazga
 * @version 3.0
 */
public class MovieBrowser {
   
    /**
     * Main method of the "Movie Browser" application.
     * The application will open login window in graphical mode.
     * The administrator account has already been created. The login is 'admin' and the password is 'Password'.
     * 
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
       
        // Initialization of a controller class
        Controller controller = new Controller();
        
        // START APK
        controller.login();
    
    }
}
