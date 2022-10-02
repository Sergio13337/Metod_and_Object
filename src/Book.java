import java.util.Objects;

class Book {
    private String nameBook;
    private int publicationYear;



    //private String author;
    private final Author author;


    public Book(String namebook, int publicationYear, Author author) {
        this.nameBook = namebook;
        this.publicationYear = publicationYear;
        this.author = author;

    }
    @Override
    public String toString() {
        return
                nameBook + " " + publicationYear;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && nameBook.equals(book.nameBook)  && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, publicationYear, author);
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

}

