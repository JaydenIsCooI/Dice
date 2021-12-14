package com.company;
public class Main {

    public static void main(String[] args) {

        // Declare two 6 sided dice called d1 and d2
        //	Roll the dice 10 times and print out the dice values
        //	If the dice add up to 2, immediately print out “Snake Eyes”
        //	If the dice add up to 7, immediately print out “Lucky Seven”
        //	If the dice add up to 12, immediately print out “Box Cars”

        Dice d1 = new Dice();
        Dice d2 = new Dice();
        d1.sides(6);
        d2.sides(6);

        for (int i = 0; i < 10; i++)
        {
            d1.roll();
            System.out.println("Dice 1 :: " + d1.LastRoll());
            d2.roll();
            System.out.println("Dice 2 :: " + d2.LastRoll());

            if (d1.LastRoll() + d2.LastRoll() == 2)
            {
                System.out.println("Snake Eyes");
            }
            if (d1.LastRoll() + d2.LastRoll() == 7)
            {
                System.out.println("Lucky Seven");
            }
            if (d1.LastRoll() + d2.LastRoll() == 12)
            {
                System.out.println("Box Cars");
            }
            System.out.println("");
        }
    }
}
