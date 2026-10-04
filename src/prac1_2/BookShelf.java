package prac1_2;

/**
 * Класс "Книжная полка".
 * Реализует композицию: полка сама создаёт объекты Book внутри себя
 * (метод addBook) и владеет ими, книги не существуют отдельно от полки.
 * Поля: массив книг и количество книг на полке.
 */
public class BookShelf {
    private Book[] books;
    private int count; // сколько книг реально стоит на полке

    public BookShelf(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // Полка сама создаёт книгу и ставит её на себя
    public boolean addBook(String author, String title, int year, int pages) {
        if (count >= books.length) {
            System.out.println("Полка заполнена, книгу добавить нельзя.");
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

    // Книга с самым ранним годом издания (null, если полка пуста)
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

    // Книга с самым поздним годом издания (null, если полка пуста)
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

    // Расставить книги по возрастанию года выпуска (сортировка выбором)
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
