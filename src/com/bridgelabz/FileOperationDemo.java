package com.bridgelabz;

import java.io.File;
import java.io.IOException;

public class FileOperationDemo{
    public static void main(String[] args) {
        // Check if a file exists
        File file = new File("example.txt");
        boolean fileExists = file.exists();
        System.out.println("File exists: " + fileExists);

        // Delete the file and check if it no longer exists
        boolean fileDeleted = file.delete();
        System.out.println("File deleted: " + fileDeleted);
        System.out.println("File exists after deletion: " + file.exists());

        // Create a directory
        File directory = new File("my_directory");
        boolean directoryCreated = directory.mkdir();
        System.out.println("Directory created: " + directoryCreated);

        // Create an empty file
        File emptyFile = new File("my_directory/empty.txt");
        try {
            boolean fileCreated = emptyFile.createNewFile();
            System.out.println("Empty file created: " + fileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // List files and directories in a directory
        File directoryToScan = new File("my_directory");
        System.out.println("Files and directories in " + directoryToScan.getAbsolutePath() + ":");
        File[] files = directoryToScan.listFiles();
        if (files != null) {
            for (File fileOrDir : files) {
                if (fileOrDir.isFile()) {
                    System.out.println("File: " + fileOrDir.getName());
                } else if (fileOrDir.isDirectory()) {
                    System.out.println("Directory: " + fileOrDir.getName());
                }
            }
        }

        // List files with a specific extension
        String extension = ".txt";
        System.out.println("Files with extension " + extension + ":");
        if (files != null) {
            for (File fileWithExt : files) {
                if (fileWithExt.isFile() && fileWithExt.getName().endsWith(extension)) {
                    System.out.println("File: " + fileWithExt.getName());
                }
            }
        }
    }
}
