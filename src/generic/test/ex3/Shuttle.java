package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;
import generic.test.ex3.unit.Zergling;

public class Shuttle<T extends BioUnit> {
    private T unit;

    public void in(T unit) {
        this.unit = unit;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println(unit.toString());
    }
}
