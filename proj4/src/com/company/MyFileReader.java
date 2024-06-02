package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

    static void FileReader_(String path) throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void readFile(String path) throws IOException {
        // FileReader reads text files in the default encoding.
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }
        }
        finally {
            // Always close the file after you're done reading it
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
