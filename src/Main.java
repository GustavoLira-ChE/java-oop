import mypackage.FirstPackageClass;
import animalPackage.*;
public class Main {
    int x = 5;
    public static void main(String[] args){
        Main myObj = new Main();
        Main myObj2 = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj2.x);

        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("John");
        person2.setName("Peter");

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        //Package
        FirstPackageClass myObj3 = new FirstPackageClass(4,5);
        int result = myObj3.sum();
        System.out.println(result);

        //Inheritance
        Car myCar = new Car("VW","Polo");
        Car myCar2 = new Car("Mazda","3");
        System.out.println(myCar.getModel());
        System.out.println(myCar2.getModel());
        myCar.honk();

        //Inheritance and polymorphism
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myPig = new Pig();

        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();

    }
}
