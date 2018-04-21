import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FileSearch {
    private File directoryName;
    private static String fileName;
    private boolean isFound = false;
    private ArrayList<File> fileList = new ArrayList<File>();

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
                    System.out.println("Такой папки не существует");
                    ;
                }
            }


        } else {

            if (isFoundFile(directoryName)) return;
        }
    }

    private boolean isFoundFile(File f) {
        if (f.getName().equals(fileName)) {
            fileList.add(new File(f.getAbsolutePath()));
            isFound = true;
            return true;
        }
        return false;
    }

    public void viewFiles() {
        for(int i = 0; i < fileList.size(); i++) {
            System.out.println("Файл " + fileName + " обнаружен в директории: " + fileList.get(i));
        }

    }
}