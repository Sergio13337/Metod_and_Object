import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surname;
    private Integer id;

    public Author(String name, String surname, Integer id) {
        this.nameAuthor = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                nameAuthor + " " + surname;


    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author nameAuthor = (Author) other;
        return id.equals(nameAuthor.id);
    }
    @Override
     public int hashCode () {
        return java.util.Objects.hash(id);
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurname() {
        return this.surname;
    }
}