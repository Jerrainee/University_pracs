package prac1_2;

public class BookShelf {
    private Book[] books;
    private int count;

    public BookShelf(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public boolean addBook(String author, String title, int year, int pages) {
        if (count >= books.length) {
            System.out.println("полка заполнена, книгу добавить нельзя.");
            return false;
        }
        books[count] = new Book(author, title, year, pages);
        count++;
        return true;
    }

    public Book getBook(int index) {
        if (index < 0 || index >= count) {
            return null;
        }
        return books[index];
    }

    public int getCount() {
        return count;
    }

    public Book getOldestBook() {
        if (count == 0) {
            return null;
        }
        Book oldest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < oldest.getYear()) {
                oldest = books[i];
            }
        }
        return oldest;
    }

    public Book getNewestBook() {
        if (count == 0) {
            return null;
        }
        Book newest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > newest.getYear()) {
                newest = books[i];
            }
        }
        return newest;
    }

    public void sortByYear() {
        for (int i = 0; i < count - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (books[j].getYear() < books[minIndex].getYear()) {
                    minIndex = j;
                }
            }
            Book temp = books[i];
            books[i] = books[minIndex];
            books[minIndex] = temp;
        }
    }

    public void printAll() {
        System.out.println("Книг на полке: " + count);
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ") " + books[i]);
        }
    }
}
