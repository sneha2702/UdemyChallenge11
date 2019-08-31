/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonalstar;


public class DiagonalStar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printSquareStar(5);
    }
    public static void printSquareStar(int number)
    {
        if(number<5)
        {
            System.out.println("Invalid Value");
        }
        else
        {
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=number;j++)
            {
                if(i==1 || i==number)
                {
                System.out.print("*");   
                }
                else if(j==1 || j==number)
                {
                    System.out.print("*");
                }
                else if(i==j)
                {
                    System.out.print("*");
                }
                else if(j==(number-i)+1)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");

        }
    }
    }
    
}
