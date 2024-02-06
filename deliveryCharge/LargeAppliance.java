package ch7.weeklyQuiz;

class LargeAppliance extends Product implements Promotion {
    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
