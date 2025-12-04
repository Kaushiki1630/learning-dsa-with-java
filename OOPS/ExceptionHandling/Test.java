package OOPS.ExceptionHandling;

public class Test {
    public static void main(String[] args) {
        try{
            dosomething();
            
            String name = " Kaushiki ";
            if(name.equals(" Kaushiki ")){
            throw new CustomException("My name is Kaushiki.");
        }

    }
        catch(CustomException e){
            System.out.println(e.getMessage());
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void dosomething() throws Exception {
        System.out.println("Something went wrong!");
    }
}
