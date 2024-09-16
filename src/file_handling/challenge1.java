package file_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
* Write a program to read a filename from the user and display
* its content. The program should handle the situation where the
* file does not exist.
*
* */
public class challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the file you wish : ");
        String filename = input.next();
        try(FileReader reader = new FileReader(filename)){
            int read;
            while((read = reader.read())!=-1) System.out.print((char) read);
        }
        catch (FileNotFoundException e){
            System.out.println(filename+" not found exception");
        }
        catch(IOException e){
            System.out.printf("Exception occurred %s",e.getMessage());
        }
    }
}
