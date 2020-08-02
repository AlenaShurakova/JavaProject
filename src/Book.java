public class Book {
    String name;
    Author author;
    Genre genre;
    double rating;

    public Book(String name, Author author, Genre genre, double rating) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }
}
