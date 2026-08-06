package generic.test.ex3.unit;

public class BioUnit {

    private String name;
    private Integer hp;

    public BioUnit(String name, Integer hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public Integer getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "BioUnit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
