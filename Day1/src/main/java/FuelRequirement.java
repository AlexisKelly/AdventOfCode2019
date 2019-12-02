import java.io.*;

public class FuelRequirement {

    public static void main(String args[]) throws FileNotFoundException {
        task1();
    }

    public static void task1() throws FileNotFoundException {
        File file = new File("../resources/input/input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String mass = "";
        int counter = 0;
        int totalFuel =  0;

        while (true) {
            try {
                if((mass = br.readLine()) !=null){
                    counter++;
                    int fuelRequired = ((int) Integer.parseInt(mass)/3)-2;

                    totalFuel += fuelRequired;
                    System.out.println(counter+" "+mass+" FuelRequired:"+fuelRequired);
                } else {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total Fuel:"+totalFuel);
    }

}
