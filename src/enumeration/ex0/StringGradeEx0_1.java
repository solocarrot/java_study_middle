package enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("Basic", price);
        int gold = discountService.discount("Gold", price);
        int diamond = discountService.discount("Diamond", price);

        System.out.println("basic등급의 할인금액: " + basic);
        System.out.println("gold등급의 할인금액: " + gold);
        System.out.println("diamond등급의 할인금액: " + diamond);


    }
}
