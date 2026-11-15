package block4.prac21.task4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Практическая работа № 21. Задание 4.
 * Сохранение содержимого каталога в список и вывод первых 5 элементов.
 */
public class DirectoryLister {

    public static List<String> listDirectoryAndPrintFirst5(String directoryPath) {
        if (directoryPath == null || directoryPath.trim().isEmpty()) {
            throw new IllegalArgumentException("пустой путь");
        }

        File folder = new File(directoryPath);

        if (!folder.exists() || !folder.isDirectory()) {
            throw new IllegalArgumentException("каталог не найден");
        }

        File[] files = folder.listFiles();
        List<String> resultList = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                resultList.add(file.getName().toLowerCase());
            }
        }

        int limit = Math.min(5, resultList.size());
        for (int i = 0; i < limit; i++) {
            System.out.println(resultList.get(i));
        }

        return resultList;
    }
}
