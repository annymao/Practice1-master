package ss.labs.pokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TODO declare and initiate a Scanner
        Scanner scanner=new Scanner(System.in);
        //TODO declare and initiate pokedex as an ArrayList to store pokemon data
        ArrayList<PokemonData> pokedex= new ArrayList();

        //TODO declare and initiate typeCountMap as a HashMap to count the number of each types of pokemon
        HashMap<String,Integer> typeCountMap = new HashMap<>();
        System.out.println("Enter the Number of pokemon in the pokedex:");
        //TODO 0: scan the number of the testData from user input
        int numOfPokemons = scanner.nextInt();
        //TODO use a loop to read several input data
        for(int i=0;i<numOfPokemons;i++)
        {
            System.out.println("Enter pokemon name:");
            //TODO 1-1:scan pokemon name and save to a variable from user input
            String nameOfPokemon = scanner.next();
            System.out.println("Enter pokemon type:");
            //TODO 1-2:scan pokemon type and save to a variable
            String typeOfPokemon = scanner.next();
            System.out.println("Enter pokemon's move name:");
            //TODO 1-3:scan pokemon move's name
            String moveName = scanner.next();
            //TODO 2-1:create a new pokemon data from the above variables
            PokemonData newPokemon = new PokemonData(nameOfPokemon,typeOfPokemon,moveName);
            //TODO 2-2:add the pokemon data into pokedex
            pokedex.add(newPokemon);
            //TODO 4: Tricky part!! get the value from the type counting map , add 1 and put it back (multiple line
            boolean isContain = typeCountMap.containsKey(typeOfPokemon);
            if(isContain)
            {
                int num = typeCountMap.get(typeOfPokemon) + 1;
                typeCountMap.put(typeOfPokemon, num);
            }
            else
            {
                typeCountMap.put(typeOfPokemon, 1);
            }
        }

        //TODO 5 print out the created pokemon information (multiple lines
        for(PokemonData pokemon : pokedex)
        {
            System.out.printf("name: %s, type: %s, move's name: %s\n",pokemon.name,pokemon.type,pokemon.move);
        }
        //TODO 6 print out how many type of pokemons in the pokedex
        System.out.printf("number of types of pokemons: %d",typeCountMap.size());
    }
}
