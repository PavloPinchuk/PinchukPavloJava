package com.univ;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void run(String filename) throws IOException {
        String content = Files.lines(Paths.get(filename)).reduce("", String::concat);
        String s = content.replaceAll("^ +| +$|( )+", "$1");
        String[] words = s.split(" ");
        List<Book> books = new ArrayList<>();
        for(int i = 0; i < words.length; i+=3)
        {
            books.add(new Book(words[i], words[i+1], Integer.parseInt(words[i+2])));
        }

        for (Book book: books
             ) {
            if(book.getYear() >= 1960 && book.getAvtor().equals("Smith"))
                System.out.println(book.getAvtor() + " " + book.getName() + " " + book.getYear());
        }

        for (Book book: books
        ) {
            if(book.getName().equals("Vesna"))
                System.out.println(book.getAvtor() + " " + book.getName() + " " + book.getYear());
        }
    }

    public static void main(String[] args) {
        try{
            run("src/com/univ/filename.txt");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
