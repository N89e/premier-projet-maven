package dev;
import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        String asciiArtTitle = FigletFont.convertOneLine("Mon Titre");
        System.out.println(asciiArtTitle);
    }
}

