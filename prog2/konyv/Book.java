import java.util.Objects;

public class Book implements Comparable{
    private String title;
    private String author;
    private int pages;
    private static int count = 0;

    public Book() {
        this.title = "";
        this.author = "";
        this.pages = 0;
        Book.count++;
    }

    public Book(String title, String author, int pages) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPages(pages);
        Book.count++;
    }

    public Book(String title, int pages) {
        this.setTitle(title);
        this.author = "unknown";
        this.setPages(pages);
        Book.count++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages < 500){
            this.pages = pages;
        }
        else {
            this.pages = 500;
        }
    }

    public static int getCount(){
        return Book.count;
    }

    @Override
    public String toString() {
        return "Book:{title: "+this.title+" author: "+this.author+" pages: "+this.pages+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                this.title == book.title &&
                this.author == book.author;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pages);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        Book book = (Book) o;
        if (this.pages == book.pages) return 0;
        if (this.pages > book.pages) return 1;
        else return -1;
    }
}
