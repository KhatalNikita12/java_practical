import java.io.*;

public class apendfile {
    public static void main(String[] args) {
      

        try {
            String inputFilename = args[0];
            String outputFilename = args[1];

            FileInputStream fis = new FileInputStream(inputFilename);
            FileOutputStream fos = new FileOutputStream(outputFilename, true); // true for append mode

            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }

            fis.close();
            fos.close();
            
            System.out.println("Content from " + inputFilename + " has been appended to " + outputFilename);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
