package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("Vip", price);
        int gold = discountService.discount("Goldd", price);
        int diamond = discountService.discount("diamond", price);

        System.out.println("vip등급의 할인금액: " + basic);
        System.out.println("goldd등급의 할인금액: " + gold);
        System.out.println("diamond등급의 할인금액: " + diamond);


    }
}
