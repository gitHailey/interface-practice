package ch7.weeklyQuiz;

class Product {
    protected String name;
    protected int price;
    protected int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return this.price;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getDiscountAmount() {
        return 0;
    }
}