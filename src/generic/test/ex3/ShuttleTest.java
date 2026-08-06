package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;
import generic.test.ex3.unit.Zergling;

public class ShuttleTest {

    public static void main(String[] args) {
        Shuttle<Zealot> zealotShuttle = new Shuttle<>();
        zealotShuttle.in(new Zealot("질럿1" , 150));
        zealotShuttle.showInfo();

        Shuttle<Zergling> zerglingShuttle = new Shuttle<>();
        zerglingShuttle.in(new Zergling("저글링1", 25));
        zerglingShuttle.showInfo();

        Shuttle<Marine> marineShuttle = new Shuttle<>();
        marineShuttle.in(new Marine("마린1", 40));
        marineShuttle.showInfo();
    }
}
