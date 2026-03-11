public class Sofa implements Furniture {
    private int distance;

    public Sofa(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}