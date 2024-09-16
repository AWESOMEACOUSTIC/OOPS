package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class file_writer {
    public static void main(String[] args) {
        String filename = "example.txt";

        try(FileWriter writer = new FileWriter(filename)){

            writer.write("Hello, Wazzsup, Sasriyakal");
            for(int i = 1; i<10;i++){
                writer.write("FIEN\n");
            }
            writer.flush();
            System.out.println("Successfully written to the file");
        }catch(IOException e) {
            System.out.printf("An error occurred %s\n", e.getMessage());
            e.printStackTrace();
        }

    }
}

// ** try with resource ->

/*
* FileWriter(String fileNme) : Creates a FileWriter object given the name of the file to write to
* FileWriter(File file) = Creates a FileWriter object given a File object
* Common Method:
* write(int c) : writes a single character
* write(char[] cbuf) : writes an array of characters
* write(String str) : writes a string
* flush() : flushes the stream, ensuring all data is written out
* close() : closes the stream, releasing any associated system resources.
* */