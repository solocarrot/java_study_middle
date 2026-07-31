package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price) {
        int discountPercent = 0 ;

        if(grade.equals("Basic")) {
            discountPercent = 10;
        } else if(grade.equals("Silver")) {
            discountPercent = 20;
        } else if(grade.equals("Gold")) {
            discountPercent = 30;
        } else {
            System.out.println(grade + "할인X");
        }

        return price * discountPercent / 100;
    }

}
