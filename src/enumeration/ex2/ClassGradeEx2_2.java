package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        //ClassGrade resultClass = new ClassGrade();
        //int result = discountService.discount(resultClass, price);
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC등급의할인금액" + basic);
        //System.out.println("RESULT등급의할인금액" + result);
        System.out.println("GOLD등급의할인금액" + gold);
        System.out.println("DIAMOND등급의할인금액" + diamond);
    }
}
