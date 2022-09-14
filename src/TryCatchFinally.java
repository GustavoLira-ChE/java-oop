public class TryCatchFinally {

    public static void main(String[] args){
        try{
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[10]);
        }catch(Exception e){
            System.out.println("Try statement throw an error: " + e);
        }finally{
            System.out.println("The 'try..catch' statement finished.");
        }

        TryCatchFinally myObj = new TryCatchFinally();
        myObj.checkAge(20);
        myObj.checkAge(15);

    }
    public void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access Denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }
}
