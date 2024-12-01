package GameEntities;

import java.util.*;


public class CharacterCreation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Player1 Name: ");
        String name = input.nextLine();


        Character player = new Character(name);

        input.close();

    }


}