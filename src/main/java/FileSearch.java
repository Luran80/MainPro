package main.java;

import java.io.File;
import java.io.FileReader;

public class FileSearch {
    private FileReader fr;
    private File directoryName;
    private String fileName;
    private FileThread fileThread;

    FileSearch(String fName, String dName) {
        fileName = fName;
        directoryName = new File(dName);

    }

    public void search() {

        if (directoryName.isDirectory()) {
            for (File item : directoryName.listFiles()) {
                if(item.isHidden()) continue;
                if (item.isFile()) {
                    if(isFoundFile(item)) break;
                    else break;
                } else {
                    directoryName = new File(item.getAbsolutePath());
                    fileThread = new FileThread();
                    fileThread.run();
                }
            }
        } else {
            if (isFoundFile(directoryName)) return;
        }
    }

    private boolean isFoundFile(File f) {
        if (f.getName().equals(fileName)) {
            System.out.println("Файл " + fileName + " обнаружен в директории: " + directoryName.getAbsolutePath());
            return true;
        }
        return false;
    }


    private class FileThread implements Runnable{


        public void run() {
            search();
        }
    }
}