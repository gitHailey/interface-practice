package ch7.deliveryCharge;

class Grocery extends Product implements Promotion {
    public Grocery(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 2000;
    }
}