import java.util.Scanner;
import java.util.*;

class Library {
  String[] books;
  String[] issuebooks;
  int no_of_books;
  int no_of_books2;

  Library() {
    this.books = new String[100];
    this.issuebooks = new String[100];
    no_of_books = 0;
    no_of_books2 = 0;

  }

  public void addBook(String adname) {
    if (no_of_books == this.books.length - 1) {
      System.out.println("The space is not available for add book ");
    }

    else {
      this.books[no_of_books] = adname;
      no_of_books++;
    }
    System.out.println(adname + " book added in Library");

  }

  public void issueBook(String isname) {
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].equals(isname)) {
        System.out.println(isname + " book issued Successfully");
        this.books[i] = null;

        issuebooks[no_of_books2] = isname;
        no_of_books2++;
        return;

      }
      // System.out.println("* " + isname);
    }
    System.out.println("This book is not exist ");
  }

  public void returnBook(String book) {
    for (int i = 0; i < this.issuebooks.length; i++) {
      if (this.issuebooks[i].equals(book)) {
        System.out.println(book + " return in the Library successfully ");
        this.issuebooks[i] = null;
        this.books[no_of_books] = book;
        no_of_books++;
        return;
      }
    }
    System.out.println(book + " book is not this Library ");
  }

  public void showAvailableBook() {
    System.out.println("The available books are ...");
    for (String avbook : books) {
      if (avbook == null) {
        continue;

      }
      System.out.println(avbook);

    }
  }

  public void showissuebooks() {
    System.out.println("The issued books are ...");
    for (String isbook : issuebooks) {
      if (isbook == null) {
        continue;

      }
      System.out.println(isbook);

    }
  }

}

public class LibraryClasses {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Library ms = new Library();
    ms.addBook("Computer Networks");
    ms.addBook("Java Programming ");
    ms.addBook("Physic");
    ms.addBook("Math");
    ms.addBook("C++ with OPPs");
    ms.addBook("Python language");
    ms.issueBook("Math");
    ms.issueBook("Physic");
    ms.showissuebooks();
    ms.showAvailableBook();
    ms.returnBook("Math");
    ms.showAvailableBook();
    ms.showissuebooks();

    boolean bul = true;
    while (bul) {
      System.out.print(
          "Enter 1. Add Book \n 2. Show Available \n 3. Issue Book \n  4. Show Issue Book \n 5. Return Book \n  6.exit()\n");
      int num = sc.nextInt();
      switch (num) {
        case 1:
          System.out.println("How Many book you want to add in Library Enter ");
          int adnum = sc.nextInt();
          for (int i = 0; i < adnum; i++) {
            int j = 1;
            System.out.println("Enter the books " + j);
            String book1 = sc.next();
            ms.addBook(book1);
            j++;
          }
          break;
        case 2:
          ms.showAvailableBook();
          break;
        case 3:
          System.out.println("How many book you want issue enter ");
          int adnum1 = sc.nextInt();
          for (int i = 0; i < adnum1; i++) {
            int j = 1;
            System.out.println("Enter the book " + j);
            String book2 = sc.next();
            ms.issueBook(book2);
            j++;
          }
          break;
        case 4:
          ms.showissuebooks();
          break;
        case 5:
          System.out.println("How many book you want to return enter ");
          int adnum2 = sc.nextInt();
          for (int i = 0; i < adnum2; i++) {
            int j = 1;
            System.out.println("Enter the book " + j);
            String book3 = sc.next();
            ms.returnBook(book3);
            j++;
          }
          break;

        case 6:
          bul = false;
          break;

        default:
          System.out.println("Please Enter Right Number ");
          break;
      }
    }
  }
}
