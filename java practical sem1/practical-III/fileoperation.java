
import java.io.*;
import java.util.Scanner;

public class fileoperation {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String fname = args[0];
        int i, flag = 0, cnt = 0;
        File obj = new File(fname);

        if (obj.exists()) {
            if (obj.isFile()) {
                System.out.println(fname + " is a file");
                 System.out.println(fname.length());
                 
            } else if (obj.isDirectory()) {
                System.out.println(fname + " is a directory");
                String str[] = obj.list();

                for (i = 0; i < str.length; i++) {
                    File obj1 = new File(fname + "/" + str[i]);

                    if (str[i].endsWith(".txt")) {
                        System.out.println("Do you want to delete the file " + str[i] + "? (1/0): ");
                        int c = input.nextInt();
                        if (c == 1) {
                            if (obj1.delete()) {
                                flag = 1;
                                cnt++;
                            }
                        }
                    }
                }

                if (flag == 1) {
                    System.out.println("Files are deleted");
                    System.out.println("Number of files deleted: " + cnt);
                }
            }
        }
    }
}
