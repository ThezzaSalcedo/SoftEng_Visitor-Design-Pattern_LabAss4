public class ShippingCostCalculator implements ShippingVisitor {

    @Override
public void visit(Chair chair) {

    double cost;

    switch (chair.getSize().toLowerCase()) {
        case "small":
            cost = 400;
            break;

        case "medium":
            cost = 550;
            break;

        case "large":
            cost = 700;
            break;

        default:
            cost = 500; // default shipping rate
    }

    System.out.println("Chair size: " + chair.getSize());
    System.out.println("Shipping cost for Chair: ₱" + cost);
}

    @Override
    public void visit(Table table) {
        double cost = table.getWeight() * 50; // ₱50 per kg
        System.out.println("Shipping cost for Table: ₱" + cost);
    }

    @Override
    public void visit(Sofa sofa) {
        double cost = sofa.getDistance() * 20; // ₱20 per km
        System.out.println("Shipping cost for Sofa: ₱" + cost);
    }
}