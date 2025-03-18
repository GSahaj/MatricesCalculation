import CramersRule.TwoDimensionalCramerRule;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("x1: ");
        int X1 = input.nextInt();

        System.out.println("y1: ");
        int Y1 = input.nextInt();

        System.out.println("z1: ");
        int Z1 = input.nextInt();

        System.out.println("x2: ");
        int X2 = input.nextInt();

        System.out.println("y2: ");
        int Y2 = input.nextInt();

        System.out.println("z2: ");
        int Z2 = input.nextInt();

        TwoDimensionalCramerRule values = new TwoDimensionalCramerRule(X1, X2, Y1, Y2, Z1, Z2);

        try{
            double[] solution = values.twoDimenstionalSolution();
            System.out.println("x = " + solution[0]);
            System.out.println("y = " + solution[1]);
        }
        catch(ArithmeticException e){
            System.out.println("No solution " + e.getMessage());
        }
    }
}