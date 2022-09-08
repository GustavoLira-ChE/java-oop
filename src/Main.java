import mypackage.FirstPackageClass;
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

        FirstPackageClass myObj3 = new FirstPackageClass(4,5);
        int result = myObj3.sum();
        System.out.println(result);

    }
}
