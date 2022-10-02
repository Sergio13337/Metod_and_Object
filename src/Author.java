import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surname;


    public Author(String name, String surname) {
        this.nameAuthor = name;
        this.surname = surname;

    }

    @Override
    public String toString() {
        return
                nameAuthor + " " + surname;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameAuthor.equals(author.nameAuthor) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surname);
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurname() {
        return this.surname;
    }
}