package week2;

//coded by KaranSinghJoshi 
//12012781

import java.io.FileWriter;
import java.io.IOException;

public class program10 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/users/dell/Desktop/TestFile.txt");
        fw.write("I am the Earth\n");
        fw.write("I am the forest green\n");
        fw.write("I am the four winds blowing \n");
        fw.write("I am the Earth");

        fw.flush();// closing the connection with file
        System.out.println("file prepared successfully");
    }
}