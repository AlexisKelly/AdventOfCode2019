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
        int task2FuelRequirements = 0;

        while (true) {
            try {
                if((mass = br.readLine()) !=null){
                    counter++;
                    int fuelRequired = getFuel(Integer.parseInt(mass));

                    task2FuelRequirements+= task2(fuelRequired);

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

        System.out.println("Task 2 Total:"+task2FuelRequirements);

    }

    public static int task2(int totalFuel){

        int fuelRequirements = totalFuel;
        while (totalFuel > 0){

            totalFuel = getFuel(totalFuel);
            if(totalFuel > 0){
                fuelRequirements+= totalFuel;
                System.out.println("total fuel remaining:"+totalFuel);
            }

        }
        System.out.println("FuelRequirements:"+fuelRequirements);

        return fuelRequirements;

    }

    public static int getFuel(int mass){

        return ((int) mass /3)-2;
    }

}
