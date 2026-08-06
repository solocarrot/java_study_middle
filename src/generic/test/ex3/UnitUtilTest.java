package generic.test.ex3;


import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.UnitUtil;

public class UnitUtilTest {

    public static void main(String[] args) {
        Marine marine1 = new Marine("마린1", 40);
        Marine marine2 = new Marine("마린2", 50);

        Marine moreHp = UnitUtil.maxHp(marine1, marine2);
        System.out.println("더많은체력 : " + moreHp.getName());

    }
}
