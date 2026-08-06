package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T v1Unit = shuttle.out();
        System.out.println("유닛 이름 : " + v1Unit.getName() + "유닛 체력 : " + v1Unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> bioUnit) {
        BioUnit v2Unit = bioUnit.out();
        System.out.println("유닛 이름 : " + v2Unit.getName() + "유닛 체력 : " + v2Unit.getHp());
    }
}
