import java.util.*;
class Library
{
    String acc,title,author;
    Double day,fine;
    void input()
    {
        Scanner a= new Scanner(System.in);
        System.out.println("account number is: ");
        acc = a.nextLine();
        System.out.println("title of the book: ");
        title = a.nextLine();
        System.out.println("author of the book: ");
        author = a.nextLine();
    }
    void fine()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("fine in returing the book");
        day = s.nextDouble();
        fine=day*2.50;
    }
    void show()
    {
        System.out.println("accountnumber\t\ttitle\t\tauthor\t\tfine\n");
        System.out.println(acc+"\t\t\t"+title+"\t\t"+author+"\t\t"+fine);
    }
}
class Book

{
    public static void main(String args[])
    {
        Library b = new Library();
        b.input();
        b.fine();
        b.show();

    }

}