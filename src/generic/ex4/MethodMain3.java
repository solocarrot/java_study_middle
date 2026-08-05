package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이1", 300);

        ComplexBox<Dog> dogHospital = new ComplexBox<>();
        dogHospital.set(dog);

        Cat returnCat = dogHospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);

    }
}
