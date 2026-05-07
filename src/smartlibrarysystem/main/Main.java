/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smartlibrarysystem.main;

/**
 *
 * @author PC
 */
public class Main {

  // File: Book.java
public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " berhasil dipinjam.");
        } else {
            System.out.println(title + " sedang tidak tersedia.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println(title + " sudah dikembalikan.");
    }
}

    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
