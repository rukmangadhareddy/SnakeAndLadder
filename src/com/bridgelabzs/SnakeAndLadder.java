package com.bridgelabzs;

public class SnakeAndLadder {
    /**
     * @return
     * calculate and snake and ladder game use Math class
     */
    public static int playerOne(){
        /**
         * playerOne method to play game use Math class random static method
         * find random values to return number of times roll dice
         */
        int playerPosition = 1;
        int sumOfRollDice=0;

        while (playerPosition <=100) {

            int randomDice = (int) ((Math.random() * 10) % 6 + 1);
            //snake
            if (sumOfRollDice==20 || sumOfRollDice==35 || sumOfRollDice==50 || sumOfRollDice==65 || sumOfRollDice==80 ){
                sumOfRollDice-=15;
            }
            //ladder
            if (sumOfRollDice==15 || sumOfRollDice==30 || sumOfRollDice==45 || sumOfRollDice==60 || sumOfRollDice==75 ){
                sumOfRollDice+=15;
            }
            if (sumOfRollDice >=94){
                break;
            }


            sumOfRollDice += randomDice;
            System.out.println("Player number of roll die - "+playerPosition+" and position - "+sumOfRollDice);
            playerPosition++;
        }
        playerPosition+=1;
        int difference = 100-sumOfRollDice;
        while (playerPosition <=100){
            int randomDice = (int) ((Math.random() * 10) % 6 + 1);
            if (randomDice == difference){
                break;
            }

            playerPosition++;
        }

        int totalSumOfRollDies = difference+sumOfRollDice;
        System.out.println("Player number of roll die - "+playerPosition+" and position - "+totalSumOfRollDies);

        return playerPosition;
    }


    public static void main(String[] args) {
        System.out.println("First player report  number of dices played");
        int playerOne = playerOne();
        System.out.println("Second Player report  number of dices played");
        int playerTwo = playerOne();
        System.out.println("***************************************************");
        System.out.println("First Player played number of roll dices : "+playerOne);
        System.out.println("Second Player played number of roll dices : "+playerTwo);
        System.out.println("***************************************************");

        if (playerOne>playerTwo){
            System.out.println("Second player won the game");
        }
        else {
            System.out.println("First player won the game ");
        }
    }
}