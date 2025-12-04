package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b =0;
        try{
            divide(a,b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("This is a finally block in exception handling.");
        }

    }

    static int divide(int a, int b) {
        if(b==0){
            throw new ArithmeticException("This division is not Possible.");
        }

        return a/b;
    }
}
