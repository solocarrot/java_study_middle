package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {

        DiscountService discountService = new DiscountService();
        int price = 10000;

        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC등급의할인금액" + basic);
        System.out.println("GOLD등급의할인금액" + gold);
        System.out.println("DIAMOND등급의할인금액" + diamond);
    }
}
