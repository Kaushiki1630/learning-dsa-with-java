import java.util.Scanner;

public class SwitchStatements3 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the name of the fruit: ");
    //     String fruits=sc.next();

    //     switch(fruits){
    //         case "mango" :
    //         System.out.println("King of fruits.");
    //         break;

    //         case "apple" :
    //         System.out.println("a sweet red fruit.");
    //         break;

    //         case "orange" :
    //         System.out.println("a round fruit.");
    //         break;

    //         case "grapes" :
    //         System.out.println("small fruits.");
    //         break;

    //         default:
    //         System.out.println("Please enter a valid fruit.");
    //     }

    //     sc.close();
    // }


//   ENHANCED SWITCH STATEMENT

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String fruits=sc.next();

    //     switch(fruits){
    //         case "mango" -> System.out.println("King of fruits.");
    //         case "apple" -> System.out.println("a sweet red fruit.");
    //         case "orange" -> System.out.println("round fruit.");
    //         case "grapes" -> System.out.println("small fruit.");
    //         default -> System.out.println("Enter the valid fruit name.");
    //     }

    //     sc.close();
    // }


    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int day = sc.nextInt();

    //     switch(day){
    //         case 1 -> System.out.println("Monday");
    //         case 2 -> System.out.println("Tuesday");
    //         case 3 -> System.out.println("Wednesday");
    //         case 4 -> System.out.println("Thursday");
    //         case 5 -> System.out.println("Friday");
    //         case 6 -> System.out.println("Saturday");
    //         case 7 -> System.out.println("Sunday");
    //         default -> System.out.println("Enter the valid number.");
    //     }
    //     sc.close();
    // }


    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int day = sc.nextInt();

    //     switch(day){
    //         case 1,2,3,4,5 -> System.out.println("Weekday");
    //         case 6,7 -> System.out.println("Weekend");
    //         default -> System.out.println("Enter the valid number.");
    //     }
    //     sc.close();
    // }


//  NESTED SWITCH STATEMENT

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Employ_id=sc.nextInt();
        String Department = sc.next();

        switch(Employ_id){
            case 1 -> System.out.println("Employee 1 : Kaushiki");
            case 2 -> System.out.println("Employee 2 : Kirti");
            case 3 -> {
                System.out.println("Employee 3 : Dhwani");
                switch(Department){
                    case "CSE" -> System.out.println("Departmeny CSE.");
                    case "ECE" -> System.out.println("Departmeny ECE.");
                    case "BioTech" -> System.out.println("Departmeny BioTech.");
                    case "Mechanical" -> System.out.println("Departmeny Mechanical.");

                    default -> System.out.println("Enter the valid Department.");
                }
        }

        default -> System.out.println("Enter the valid employee id.");
    }

    sc.close();
    }
}


