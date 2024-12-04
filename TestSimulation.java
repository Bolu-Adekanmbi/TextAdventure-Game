import GameEntities.*;

import GameEntities.Character;


public class TestSimulation {
    public static void main(String[] args) {
        Character player = new Character("player1");
        player.setStrength(10);
        player.setHealth(200);

        Enemy enemy = new Enemy("enemy1", 100);
        enemy.setHealth(100);

        System.out.println("Before Attack");
        System.out.println(player);
        System.out.println(enemy);

        player.attack(enemy);

        System.out.println("After Attack");

        System.out.println(player);
        System.out.println(enemy);

        /**
         * FIX THIS NOWWWWW!!!!!!!!!!!
         * 
         */
        
    }
}
