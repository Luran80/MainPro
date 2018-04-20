package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainStream {
    public static void main(String[] args) throws IOException {
        String fileName;
        String directoryName;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя файла");
        fileName = br.readLine();

        System.out.println("Введите название директории в которой искать файл: " + fileName);
        directoryName = br.readLine();

        FileSearch fileSearch = new FileSearch(fileName, directoryName);
        fileSearch.search();
    }
}