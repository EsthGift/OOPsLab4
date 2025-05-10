package evaluations.level2;

public class ExceptionHandlingApplication {
    public void handleException(){
        try{
            int a = 5 / 0;
        } catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    public void generateStackTrace(){
        try {
            int[] arr = new int[5];
            int value = arr[10];
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }


}
