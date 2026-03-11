public class Table implements Furniture {
    private double weight;

    public Table(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}