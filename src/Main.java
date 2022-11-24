import Model.students;
import Model.books;
import Model.borrowing;


public class Main {
    public static void main(String[] args) {

        students stud1= new students("Tatsam",11,9);
        students stud2 = new students("Pranjal",12,10);
        students stud3= new students("Aaditya",9,5);
        books book1= new books("Giver","Paulo Coelho",12345,1999);
        books book2 = new books("Her majesty","William smith",25367,1890);
        books book3 = new books("Someone decides to die","Victor frankl",363784,2003);
        borrowing borrow1= new borrowing(12637,23098,2,60);
        borrowing borrow2 = new borrowing(26372,23047,1,30);
        borrowing borrow3 = new borrowing(237283,23012,7,210);

        stud1.students();
        book1.books();
        borrow2.borrow();
}
}