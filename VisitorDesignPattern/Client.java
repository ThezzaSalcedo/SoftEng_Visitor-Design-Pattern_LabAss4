import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Furniture> furnitureList = new ArrayList<>();

        furnitureList.add(new Chair("Small"));
        furnitureList.add(new Chair("Medium"));
        furnitureList.add(new Chair("Large"));
        furnitureList.add(new Table(30));  // 30 kg
        furnitureList.add(new Sofa(100));  // 100 km distance

        ShippingVisitor shippingCalculator = new ShippingCostCalculator();

        for (Furniture furniture : furnitureList) {
            furniture.accept(shippingCalculator);
        }
    }
}