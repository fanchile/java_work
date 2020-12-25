package eighth;

import java.awt.List;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestListMap
{
    public static void main(String[] args)
    {
        Book b1 = new Book(1000, "b1", 30.5, "jklxt");
        Book b1_1 = new Book(1000, "b1", 30, "jklxt");
        Book b2 = new Book(1000, "b2", 50, "jklxt");
        Book b3 = new Book(1001, "b3", 30.5, "jklxt");
        Book b4 = new Book(1002, "b4", 30.5, "jklxt");
        Book b5 = new Book(1003, "b5", 50, "jklxt1");

        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(b1);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b1_1);
        System.out.println("hashset");
        System.out.println(bookList.size());
        for (Book book : bookList)
        {
            System.out.println(book.toString());
        }

        Map<Integer, Book> bookMap = new HashMap<Integer, Book>();
        bookMap.put(b1.getId(), b1);
        bookMap.put(b1.getId(), b1);
        bookMap.put(b2.getId(), b2);
        bookMap.put(b3.getId(), b3);
        bookMap.put(b4.getId(), b4);
        bookMap.put(b5.getId(), b5);
        bookMap.put(b1_1.getId(), b1_1);
        System.out.println("treeset");
        for (java.util.Map.Entry<Integer, Book> entry : bookMap.entrySet())
        {
            System.out.println(entry.getKey() + "----------->" + entry.getValue());
        }
    }
}
