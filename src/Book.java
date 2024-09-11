import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// задача 5
class Book{
    String title;
    String author;
    int year;

    public String getAuthor()
    {
        return this.author;
    }

    public int getYear(int year)
    {
        return this.year;
    }
}

class Library{
    List<Book> books = new ArrayList<Book>();
    public void addBook(Book book)
    {
        books.add(book);
    }

    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(b -> Boolean.parseBoolean(b.getAuthor()))
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByYear(int year) {
        return books.stream()
                .filter(y -> Boolean.parseBoolean(String.valueOf(y.getYear(year))))
                .collect(Collectors.toList());
    }
}