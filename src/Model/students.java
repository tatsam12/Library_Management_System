package Model;

public class students {

    String name;

    int classes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public int getBooks_borrowed() {
        return books_borrowed;
    }

    public void setBooks_borrowed(int books_borrowed) {
        this.books_borrowed = books_borrowed;
    }

    public students(String name, int classes, int books_borrowed) {
        this.name = name;
        this.classes = classes;
        this.books_borrowed = books_borrowed;
    }

    int books_borrowed;

    public void students(){
        System.out.println("The student is" +this.getName()+ "of class"+ this.getClasses()+ "and has"+ this.getBooks_borrowed()+ "books borrowed");
    }

}
