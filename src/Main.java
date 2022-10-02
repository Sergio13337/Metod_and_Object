public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Author author = new Author("Bob", "Kovalski", 1);
        Book anorLondo = new Book("Anor Londo", 2022, author, 1);
        System.out.println("anorLondo.nameBook = " + anorLondo.getNameBook());
        System.out.println("anorLondo.publicationYear = " + anorLondo.getPublicationYear());
        System.out.println("anorLondo.author = " + anorLondo.getAuthor());
        anorLondo.setPublicationYear(2023);
        System.out.println("anorLondo.getPublicationYear() = " + anorLondo.getPublicationYear());


        Author nameSurname = new Author("Bob", "Kovalski", 1);
        System.out.println("nameSurname.nameAuthor = " + nameSurname.getNameAuthor());
        System.out.println("nameSurname.surname = " + nameSurname.getSurname());


    }
}