package hw.files_searching;

import java.io.File;
import java.util.Scanner;

public class FindFile {

    private static int filesChecked = 0;
    private static int directoriesChecked = 0;
    private static int filesFound = 0;

    public static void searchFile(File directory, String fileName, int depth) {
        try {
            directoriesChecked++;
            File[] files = directory.listFiles();

            if (files == null) return;

            for (File file : files) {
                if (file.isDirectory()) {
                    searchFile(file, fileName, depth + 1);
                } else {
                    filesChecked++;

                    if (file.getName().equalsIgnoreCase(fileName)) {
                        System.out.println(file.getAbsolutePath());
                        filesFound++;
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File currentDir = new File(System.getProperty("user.dir"));
        File[] currentFiles = currentDir.listFiles();

        System.out.print("\nEnter filename to search: ");
        String fileName = scanner.nextLine().trim();

        if (fileName.isEmpty()) {
            System.out.println("Error: Filename cannot be empty!");
            scanner.close();
            return;
        }

        System.out.print("\nSearch entire system? (y/n, 'n' for current folder only): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("y") || choice.equals("yes")) {
            // Search all drives
            File[] roots = File.listRoots();
            System.out.println("System drives found:");
            for (File root : roots) {
                System.out.println("  - " + root.getAbsolutePath());
            }
            System.out.println();

            for (File root : roots) {
                System.out.println("Searching drive: " + root.getAbsolutePath());
                searchFile(root, fileName, 0);
            }
        } else {
            System.out.println("Location: " + currentDir.getAbsolutePath());
            searchFile(currentDir, fileName, 0);
        }
        scanner.close();
    }
//    You can search directly via command line by using javac and java.
//    Here is tutorial from Coding with Johns: https://www.youtube.com/watch?v=uA4eQbC3JgA
}