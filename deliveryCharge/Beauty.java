package ch7.deliveryCharge;

class Beauty extends Product implements Promotion {
    public Beauty(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 10000;
    }
}