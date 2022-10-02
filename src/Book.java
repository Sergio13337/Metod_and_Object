class Book {
    private String nameBook;
    private int publicationYear;
    private Integer id;


    //private String author;
    private final Author author;


    public Book(String namebook, int publicationYear, Author author, Integer id) {
        this.nameBook = namebook;
        this.publicationYear = publicationYear;
        this.author = author;
        this.id = id;
    }
    @Override
    public String toString() {
        return
                nameBook + " " + publicationYear;


    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
       Book author = (Book) other;
        return id.equals(author.id);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
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

