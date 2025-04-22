package CramersRule;

import java.util.Scanner;

public class ThreeDimenstionalCramersRule {
    private final int x1, x2, x3, y1, y2, y3, z1, z2, z3, w1, w2, w3;

    public ThreeDimenstionalCramersRule(int x1, int x2, int x3, int y1, int y2, int y3, int z1, int z2, int z3, int w1, int w2, int w3){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.z1 = z1;
        this.z2 = z2;
        this.z3 = z3;
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
    }

    public double Determinant(){
        return (x1*y2*z3 + y1*z2*x3 + z1*x2*y3) - (x3*y2*z1 + y3*z2*x1 + z3*x2*y1);
    }

    public double DeterminantX(){
        return (w1*y2*z3 + y1*z2*w3 + z1*w2*y3) - (w3*y2*z1 + y3*z2*w1 + z3*w2*y1);
    }

    public double DeterminantY(){
        return (x1*w2*z3 + w1*z2*x3 + z1*x2*w3) - (x3*w2*z1 + w3*z2*x1 + z3*x2*w1);
    }

    public double DeterminantZ(){
        return (x1*y2*w3 + y1*w2*x3 + w1*x2*y3) - (x3*y2*w1 + y3*w2*x1 + w3*x2*y1);
    }

    public double[] threeDimenstionalSolution(){
        double det = Determinant();

        if(det == 0){
            throw new ArithmeticException("No Solution");
        }

        double x = DeterminantX()/det;
        double y = DeterminantY()/det;
        double z = DeterminantZ()/det;

        return new double[] {x, y, z};
    }

    public static void output3D(){
        Scanner input = new Scanner(System.in);

        System.out.println("x1: ");
        int X1 = input.nextInt();

        System.out.println("y1: ");
        int Y1 = input.nextInt();

        System.out.println("z1: ");
        int Z1 = input.nextInt();

        System.out.println("w1");
        int W1 = input.nextInt();

        System.out.println("x2: ");
        int X2 = input.nextInt();

        System.out.println("y2: ");
        int Y2 = input.nextInt();

        System.out.println("z2: ");
        int Z2 = input.nextInt();

        System.out.println("w2");
        int W2 = input.nextInt();

        System.out.println("x3: ");
        int X3 = input.nextInt();

        System.out.println("Y3: ");
        int Y3 = input.nextInt();

        System.out.println("Z3:");
        int Z3 = input.nextInt();

        System.out.println("W3: ");
        int W3 = input.nextInt();

        ThreeDimenstionalCramersRule values = new ThreeDimenstionalCramersRule(X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3, W1, W2, W3);

        try{
            double[] solution = values.threeDimenstionalSolution();
            System.out.println("x = " + solution[0]);
            System.out.println("y = " + solution[1]);
            System.out.println("z = " + solution[2]);
        }
        catch(ArithmeticException e){
            System.out.println("No solution " + e.getMessage());
        }

        input.close();
    }
}
