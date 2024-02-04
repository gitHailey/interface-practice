package ch7.weeklyQuiz;

public class Beauty extends Product implements  DeliveryChargeCalculator{

    public Beauty(String name,int price, double weight) {
        super(name, price, weight);
    }

    @Override
    public void show(String category){
        System.out.println("화장품에 대한 정보");
        System.out.println("상품명: "+name);
        System.out.println("가격: "+price);
        System.out.println("무게: "+weight);
        System.out.println("--------------");
    }
    @Override
    public void getDeliveryCharge(int price, double weight){
        int deliveryFee=0;
        if(weight<3){
            deliveryFee=1000;
        } else if((weight>=3)&&(weight<=10)){
            deliveryFee=5000;
        } else if(weight>=10) {
            deliveryFee=10000;
        } else{
            System.out.println("오류");
        }

        if(price<30000){
            System.out.println("화장품 배송비는"+deliveryFee+"원입니다.");
        } else if(price<100000){
            deliveryFee=deliveryFee-1000;
            System.out.println("화장품 배송비는"+deliveryFee+"원입니다.");
        } else if (price >= 100000) {
            deliveryFee=0;
            System.out.println("화장품 배송비는"+deliveryFee+"원입니다.");
        } else {
            System.out.println("오류");
        }
    }
}
