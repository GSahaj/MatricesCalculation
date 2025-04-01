package CramersRule;

public class ThreeDimenstionalCramersRule {
    private int x1, x2, x3, y1, y2, y3, z1, z2, z3, w1, w2, w3;

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

        double[] solution = {x, y, z};

        return solution;
    }
}
