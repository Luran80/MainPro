import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileSearch {
    private File directoryName;
    private static String fileName;
    private FileThread fileThread;
    private boolean isFound = false;

    FileSearch(String fName) {
        fileName = fName;

    }

    public void search(String dName) {
        directoryName = new File(dName);
        String tempPath;

        if (directoryName.isDirectory()) {
            for (File item : directoryName.listFiles()) {
                try {
                    if (item.isDirectory()) {
                        tempPath = item.getAbsolutePath();
                        search(tempPath);
                    } else {
                        if (isFoundFile(item.getAbsoluteFile())) break;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Такой папки не существует");;
                }
            }


        } else {
            if (isFoundFile(directoryName)) return;
        }
    }

    private boolean isFoundFile(File f) {
        if (f.getName().equals(fileName)) {
            System.out.println("Файл " + fileName + " обнаружен в директории: " + directoryName.getAbsolutePath());
            isFound = true;
            return true;
        }
        return false;
    }


    private class FileThread {
        private String path;

        ExecutorService es;

        FileThread(int amountThread) {
            es = Executors.newFixedThreadPool(amountThread);
        }


        Runnable task01 = new Runnable() {
            @Override
            public void run() {

            }

        };


    }
}