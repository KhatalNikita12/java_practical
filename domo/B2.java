import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class MyThread extends Thread {
    private String searchString;
    private String filename;

    public MyThread(String searchString, String filename) {
        this.searchString = searchString;
        this.filename = filename;
    }

    public void run() {
        try {
            File file = new File(filename);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchString)) {
                    System.out.println("String found in file: " + filename + " at line: " + lineNumber);
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class B2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Search string :");
        String searchString = sc.nextLine();

        // Your folder name 
        String dirname = "demo";
        File folder = new File(dirname);
        if (folder.isDirectory()) {
            String[] fileList = folder.list();
            for (String fileName : fileList) {
                File file = new File(dirname + "/" + fileName);
                if (file.isFile() && fileName.endsWith(".txt")) {
                    MyThread thread = new MyThread(searchString, dirname + "/" + fileName);
                    thread.start();
                }
            }
        }
        sc.close();
    }
}
