package file_handling;

import java.io.FileReader;
import java.io.IOException;

public class file_reader {
    public static void main(String[] args) {
        String filename = "example.txt";
        try(FileReader reader = new FileReader(filename)){
            int read = 0;
            do{
                read = reader.read();
                System.out.print((char)read);
            } while(read != -1);
        }catch(IOException e){
            System.out.printf("Exception has occurred %s",e.getMessage());
        }
    }
}
