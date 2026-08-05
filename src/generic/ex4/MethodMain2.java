package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);



        Dog bigDog = AnimalMethod.biggerAnimal(dog, new Dog("멍멍이2", 200));
        System.out.println("큰멍멍이: " + bigDog);
    }
}
