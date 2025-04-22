package CramersRule;

import java.util.Scanner;

public class TwoDimensionalCramerRule {
    private int x1, x2, y1, y2, z1, z2;


    public TwoDimensionalCramerRule(int x1, int x2, int y1, int y2, int z1, int z2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
    }

    public double Determinant(){
        return (x1 * y2) - (x2 * y1);
    }

    public double DeterminantX(){
        return (z1 * y2) - (z2 * y1);
    }

    public double DeterminantY(){
        return (x1 * z2) - (x2 * z1);
    }

    public double[] twoDimensionalSolution(){
        double det = Determinant();

        if(det == 0){
            throw new ArithmeticException("No Solution");
        }

        double x = DeterminantX() / det;
        double y = DeterminantY() / det;

        return new double[] {x, y};
    }

    public static void output2D(){
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
            double[] solution = values.twoDimensionalSolution();
            System.out.println("x = " + solution[0]);
            System.out.println("y = " + solution[1]);

        }
        catch(ArithmeticException e){
            System.out.println("No solution " + e.getMessage());
        }

        input.close();
    }
}
