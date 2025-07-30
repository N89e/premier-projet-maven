package dev;
import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("_______________________________________");
        System.out.println("----------------TP1--------------------");
        String asciiArtTitle = FigletFont.convertOneLine("Mon Titre");
        System.out.println(asciiArtTitle);
        System.out.println("_______________________________________");
        System.out.println("----------------TP2--------------------");
        String titre = ResourceBundle.getBundle("app").getString("titre");
        String asciiArt = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt);
        System.out.println("_______________________________________");
        System.out.println("-------------TP3-et-TP4----------------");
        String environnement = ResourceBundle.getBundle("app").getString("environment");
        System.out.println("Environnement : " + environnement);
        System.out.println("_______________________________________");
    }
}

