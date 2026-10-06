package prac1_2;


public class BookTest {
    public static void main(String[] args) {

        Book book = new Book("А. С. Пушкин", "Евгений Онегин", 1833, 224);
        System.out.println(book);

        book.setYear(1837);
        book.setPages(250);
        System.out.println("после изменения: " + book);

        // BookShelf
        BookShelf shelf = new BookShelf(10);
        shelf.addBook("Л. Н. Толстой", "Война и мир", 1869, 1225);
        shelf.addBook("Ф. М. Достоевский", "Преступление и наказание", 1866, 672);
        shelf.addBook("М. А. Булгаков", "Мастер и Маргарита", 1967, 480);

        shelf.printAll();
        System.out.println();
        System.out.println("самая ранняя книга: " + shelf.getOldestBook());
        System.out.println("самая поздняя книга: " + shelf.getNewestBook());
        shelf.sortByYear();
        System.out.println("сортировка по возрастанию года:");
        shelf.printAll();
    }
}
