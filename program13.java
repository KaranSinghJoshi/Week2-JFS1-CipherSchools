package week2;

//coded by KaranSinghJoshi 
//12012781

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program13 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/dell/Desktop/rhyme.txt");
        try (BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
            }
        }
    }
}
