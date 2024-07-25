import clases.vehicles;
import enums.model;

public class App {
    public static void main(String[] args) {
        vehicles vehicles= new vehicles("susuki","2010");
        System.out.println(vehicles);

        vehicles.honk();

        model mode = model.M2008;
    }
}
