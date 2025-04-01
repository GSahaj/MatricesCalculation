package CramersRule;

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

    public double[] twoDimenstionalSolution(){
        double det = Determinant();

        if(det == 0){
            throw new ArithmeticException("No Solution");
        }

        double x = DeterminantX() / det;
        double y = DeterminantY() / det;

        double[] solution = {x, y};

        return solution;
    }
}
