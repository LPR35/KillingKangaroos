import java.util.Scanner;
//-----------------------------------------------------------------------------
public class KillingKangaroos {
    private static final Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {
        double ROADKILL_CONSTANT = 1.47;
        double ROAD_WIDTH = .01;
//----------------------------Variables
        double side_ofSquare;
        double roadLength;
        double num_Roos;
        double expKills;
        double kangarooDensity;
        double road_surfaceArea;


//----------------------------User Input
        System.out.println("Enter side of square in km : ");
        side_ofSquare = keyboard.nextDouble();
        System.out.println("Enter roads length in km : ");
        roadLength = keyboard.nextDouble();
        System.out.println("Enter number of roos : ");
        num_Roos = keyboard.nextDouble();

//-----------------------------Calculations
        road_surfaceArea = (roadLength * ROAD_WIDTH);
        kangarooDensity = (num_Roos / (side_ofSquare * side_ofSquare));
        expKills = (road_surfaceArea * kangarooDensity * ROADKILL_CONSTANT);

//-----------------------------Final Display
        System.out.println("Expected number of kills is : " + expKills);


    }
}
