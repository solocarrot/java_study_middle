package enumeration.ex3;

public class DiscountService {
    int discountPercent = 0;

    public int discount(Grade grade, int price){
        if(grade == Grade.BASIC) {
            discountPercent = 10;
        } else if(grade == Grade.GOLD) {
            discountPercent = 20;
        } else if(grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(grade + "할인x");
        }

        return price * discountPercent /100;
    }
}
