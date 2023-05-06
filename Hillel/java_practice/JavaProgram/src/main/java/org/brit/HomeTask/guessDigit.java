package org.brit.HomeTask;

public class guessDigit {
    public static void main(String[] args)
    {

        int[] lottery = new int[6];
        int randomNum;

        for (int i = 0; i < 6; i++)
        {
            randomNum = (int) (Math.random() * 36);
            for (int j = 0; j < i; j++)
            {
                if (lottery[i] == randomNum)
                {
                    randomNum = (int) (Math.random() * 36);
                }

            }
            lottery[i] = randomNum;
        }

        for (int i = 0; i < lottery.length; i++)
            System.out.print(lottery[i] + " ");

    }


}
