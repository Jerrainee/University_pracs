package prac1_2;

/**
 * Тестирование классов Book и BookShelf.
 */
public class BookTest {
    public static void main(String[] args) {
        // --- Тест класса Book ---
        System.out.println("=== Проверка класса Book ===");
        Book book = new Book("А. С. Пушкин", "Евгений Онегин", 1833, 224);
        System.out.println(book);

        book.setYear(1837);
        book.setPages(250);
        System.out.println("После изменения: " + book);
        System.out.println("Автор: " + book.getAuthor() + ", название: " + book.getTitle());

        // --- Тест класса BookShelf ---
        System.out.println("\n=== Проверка класса BookShelf ===");
        BookShelf shelf = new BookShelf(10);
        shelf.addBook("Л. Н. Толстой", "Война и мир", 1869, 1225);
        shelf.addBook("Ф. М. Достоевский", "Преступление и наказание", 1866, 672);
        shelf.addBook("М. А. Булгаков", "Мастер и Маргарита", 1967, 480);
        shelf.addBook("А. С. Пушкин", "Капитанская дочка", 1836, 180);
        shelf.addBook("Н. В. Гоголь", "Мёртвые души", 1842, 352);

        System.out.println("\nДо сортировки:");
        shelf.printAll();

        System.out.println("\nСамая ранняя книга: " + shelf.getOldestBook());
        System.out.println("Самая поздняя книга: " + shelf.getNewestBook());

        shelf.sortByYear();
        System.out.println("\nПосле сортировки по возрастанию года:");
        shelf.printAll();
    }
}
