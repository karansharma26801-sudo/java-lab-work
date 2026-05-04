import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class p5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        try {
        FileReader file = new FileReader("src/1.txt");
            br = new BufferedReader(file);
            String line;
            while ((line = br.readLine()) != null) // Read line by line
            {
                System.out.println(line); }
        }catch (FileNotFoundException e){
                System.out.println("Error: File not found!");
            } finally {
            System.out.println("File closed successfully");

        } try {
            if (br != null) {
                br.close();
            }
        } catch (IOException a) {
            System.out.println("error closing file");
        }

    }
}