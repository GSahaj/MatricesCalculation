import CramersRule.ThreeDimenstionalCramersRule;
import CramersRule.TwoDimensionalCramerRule;
import java.util.Scanner;

public class Main {
    public static TwoDimensionalCramerRule twodimensional;
    public static ThreeDimenstionalCramersRule threedimensional;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Dimensions of the System of Equation: ");
        int typeOfSOE = input.nextInt();


        if(typeOfSOE == 2){
            twodimensional.output2D();
        }
        else if(typeOfSOE == 3){
            threedimensional.output3D();
        }
    }
}