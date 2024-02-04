package ch7.weeklyQuiz;

public class manage {
    public static void main(String[] args){
        Beauty beauty=new Beauty("lips",15000,0.5);
        Grocery grocery=new Grocery("carrot",31000,1.5);
        LargeAppliance LA=new LargeAppliance("fan",65000,3.8);

        beauty.show("화장품");
        grocery.show("식료품");
        LA.show("대형 가전");

        beauty.getDeliveryCharge(beauty.price,beauty.weight);
        grocery.getDeliveryCharge(grocery.price,grocery.weight);
        LA.getDeliveryCharge(LA.price,LA.weight);

    }
}
