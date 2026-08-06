package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;

public class UnitPrinterTest {

    public static void main(String[] args) {

        Shuttle<Zealot> zealotShuttle = new Shuttle<>();
        zealotShuttle.in(new Zealot("질럿1" , 150));

        Shuttle<Marine> marineShuttle = new Shuttle<>();
        marineShuttle.in(new Marine("마린1", 40));

        UnitPrinter.printV1(zealotShuttle);
        UnitPrinter.printV2(marineShuttle);

    }
}
