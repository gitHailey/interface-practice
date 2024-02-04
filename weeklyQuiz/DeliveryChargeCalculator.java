package ch7.weeklyQuiz;

public interface DeliveryChargeCalculator {

    void show(String name);
    void getDeliveryCharge(int price, double weight);

}
