package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static Player newPlayer = new Player();

    public static void main(String[] args) {
        //statsRollD6();
        //mainMenu();

    }

    public static void mainMenu() {
        boolean quit = false;
        int choice = 0;
        printMainInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printMainInstructions();
                    break;
                case 1:
                    rollDiceMenu();
                    break;
                case 2:
                    createCharacterMenu();
                    break;
//                case 3:
//                    removeMyContact();
//                    break;
//                case 4:
//                    findMyContact();
//                    break;
//                case 5:
//                    printMyContact();
//                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printMainInstructions() {
        System.out.println("MENU: ");
        System.out.println("=========================");
        System.out.println("O - Print Instructions\n" +
                "1 - Roll Dices\n" +
                "2 - Create Character\n" +
                "3 - Remove Contact\n" +
                "4 - Find Contact\n" +
                "5 - Print Contact List\n" +
                "6 - Quit Menu");
        System.out.println("=========================");
    }

    public static void rollDiceMenu() {
        boolean quit = false;
        int choice = 0;
        printRollInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printCharacterInstructions();
                    break;
                case 1:
                    System.out.println("ROLLING D4....");
                    System.out.println("You've rolled: " + rollD4());
                    System.out.println("=========================");
                    break;
                case 2:
                    System.out.println("ROLLING D6....");
                    System.out.println("You've rolled: " + rollD6());
                    System.out.println("=========================");
                    break;
                case 3:
                    System.out.println("ROLLING D8....");
                    System.out.println("You've rolled: " + rollD8());
                    System.out.println("=========================");
                    break;
                case 4:
                    System.out.println("ROLLING D10....");
                    System.out.println("You've rolled: " + rollD10());
                    System.out.println("=========================");
                    break;
                case 5:
                    System.out.println("ROLLING PERCENT....");
                    System.out.println("You've rolled: " + rollPercent());
                    System.out.println("=========================");
                    break;
                case 6:
                    System.out.println("ROLLING D12....");
                    System.out.println("You've rolled: " + rollD12());
                    System.out.println("=========================");
                    break;
                case 7:
                    System.out.println("ROLLING D20....");
                    System.out.println("You've rolled: " + rollD20());
                    System.out.println("=========================");
                    break;
                case 8:
                    mainMenu();
                    break;
            }
        }
    }

    public static void printRollInstructions() {
        System.out.println("ROLL DICE MENU: ");
        System.out.println("=========================");
        System.out.println("O - Print Roll Dice Instructions\n" +
                "1 - Roll D4\n" +
                "2 - Roll D6\n" +
                "3 - Roll D8\n" +
                "4 - Roll D10\n" +
                "5 - Roll Percent\n" +
                "6 - Roll D12\n" +
                "7 - Roll D20\n" +
                "8 - Go back to main menu");
        System.out.println("=========================");
    }

    public static void createCharacterMenu() {
        boolean quit = false;
        int choice = 0;
        System.out.println("Enter character name: ");
        String name = scanner.nextLine();
        newPlayer.setName(name);
        printCharacterInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printCharacterInstructions();
                    break;
                case 1:
                    System.out.println("ROLLING STATS: ");
                    newPlayer.setStr(statsRollD6());
                    newPlayer.setDex(statsRollD6());
                    newPlayer.setCons(statsRollD6());
                    newPlayer.setIntel(statsRollD6());
                    newPlayer.setWisd(statsRollD6());
                    newPlayer.setCha(statsRollD6());
                    System.out.println("STRENGTH: " + newPlayer.getStr());
                    System.out.println("DEXTERITY: " + newPlayer.getDex());
                    System.out.println("CONSTITUTION: " + newPlayer.getCons());
                    System.out.println("INTELLIGENCE: " + newPlayer.getIntel());
                    System.out.println("WISDOM: " + newPlayer.getWisd());
                    System.out.println("CHARISMA: " + newPlayer.getCha());
                    break;
                case 2:
                    System.out.println("ROLLING D6....");
                    System.out.println("You've rolled: " + rollD6());
                    break;
                case 3:
                    System.out.println("ROLLING D8....");
                    System.out.println("You've rolled: " + rollD8());
                    break;
                case 4:
                    System.out.println("ROLLING D10....");
                    System.out.println("You've rolled: " + rollD10());
                    break;
                case 5:
                    System.out.println("ROLLING PERCENT....");
                    System.out.println("You've rolled: " + rollPercent());
                    break;
                case 6:
                    System.out.println("ROLLING D12....");
                    System.out.println("You've rolled: " + rollD12());
                    break;
                case 7:
                    System.out.println("ROLLING D20....");
                    System.out.println("You've rolled: " + rollD20());
                    break;
                case 8:
                    mainMenu();
                    break;
            }
        }
    }

    public static void printCharacterInstructions() {
        System.out.println("CHARACTER MENU: ");
        System.out.println("=========================");
        System.out.println("O - Print Character Instructions\n" +
                "1 - Automatic roll all stats\n" +
                "2 - Manual roll\n" +
                "3 - Print character stats\n" +
                "4 - Roll D10\n" +
                "5 - Roll Percent\n" +
                "6 - Roll D12\n" +
                "7 - Roll D20\n" +
                "8 - Go back to main menu");
    }

    public static void createCharacter() {
        System.out.println("Enter your choice: ");
        String name = scanner.nextLine();

    }

    public static int rollD4() {
        return random.nextInt(4) + 1;
    }

    public static int rollD6() {
        return random.nextInt(6) + 1;
    }

    public static int rollD8() {
        return random.nextInt(8) + 1;
    }

    public static int rollD10() {
        return random.nextInt(10) + 1;
    }

    public static int rollPercent() {
        return random.nextInt(10) * 10;
    }

    public static int rollD12() {
        return random.nextInt(12) + 1;
    }

    public static int rollD20() {
        return random.nextInt(20) + 1;
    }

    public static int statsRollD6() {
        int [] rolls = new int[4];
        int temp;
        for (int i=0; i<rolls.length; i++) {
            rolls[i] = rollD6();
            //System.out.println(rolls[i]); //ISPIS KOCKICE
        }
        for (int j =0; j<rolls.length; j++) {
            for (int k=0; k<rolls.length-1; k++) {
                if (rolls[k] > rolls[k+1]) {
                    temp = rolls[k];
                    rolls[k] = rolls[k+1];
                    rolls[k+1] = temp;
                }
            }
        }
        //System.out.println(Arrays.toString(rolls)); //ISPIS NIZA
        //System.out.println(rolls[1]+rolls[2]+rolls[3]); // ISPIS ZBIRA NAJVECA 3
        return rolls[1]+rolls[2]+rolls[3];
    }
}
