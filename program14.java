package week2;

//coded by KaranSinghJoshi 
//12012781

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class program14 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/users/dell/Downloads/pokemon.csv");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        ArrayList<String> pokemons = new ArrayList<String>();
        while (line != null) {
            System.out.println(line);
            pokemons.add(line);
        }
        System.out.println("Toal pokemons " + pokemons.size());
        ArrayList<String> pokemonTitles = new ArrayList<String>();

        for (String pok : pokemons) {
            String title = pok.split(",")[0];
            pokemonTitles.add(title);
        }
        System.out.println(pokemonTitles);
        br.close();
        fr.close();
    }
}
