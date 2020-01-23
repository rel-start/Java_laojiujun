package a08_javaOO.book;

/**
 * BookTest
 */
public class BookTest {

  public static void main(String[] args) {
    Book book = new Book("你不知道的JavaScript", "123-345", 12.3, 5);
    BookBiz bookBiz = new BookBiz();
    bookBiz.sellBook(book);

    System.out.println(book.getCount());
  }
}