package hw.files_searching;

import java.io.File;
import java.util.Scanner;

public class FindFile {

    public static void searchFile(File directory, String fileName, int depth) {
        File[] files = directory.listFiles();

        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                searchFile(file, fileName, depth + 1);
            } else {

                if (file.getName().equalsIgnoreCase(fileName)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File currentDir = new File(System.getProperty("user.dir"));
        File[] currentFiles = currentDir.listFiles();
        System.out.print("\nEnter filename to search: ");
        String fileName = scanner.nextLine().trim();
        System.out.println("Location: " + currentDir.getAbsolutePath());
        searchFile(currentDir, fileName, 0);
        scanner.close();
    }
//    You can search directly via command line by using javac and java.
//    Here is tutorial from Coding with Johns: https://www.youtube.com/watch?v=uA4eQbC3JgA
}