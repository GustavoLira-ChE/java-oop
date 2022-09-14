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
    }
}
