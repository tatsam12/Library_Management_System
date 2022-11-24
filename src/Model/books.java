package Model;

public class books {

    String name;
    String author;

    public String getName() {
        return name;
    }

    public books(String name, String author, int ISBN, int published_year) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.published_year = published_year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }

    int ISBN;
    int published_year;



public void books(){
    System.out.println("name "+this.name);
    System.out.println("author "+this.author);
    System.out.println("ISBN "+this.ISBN);
    System.out.println("published_year "+this.published_year);
}


}
