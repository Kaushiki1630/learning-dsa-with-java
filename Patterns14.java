public class Patterns14 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern28(5);
        pattern30(5);
        pattern17(5);
        pattern31(5);
    }

// Pattern 1

    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }

// Pattern 2

    static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

    }

// Pattern 3

    static void pattern3(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<(n-i); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }

// Pattern 4

    static void pattern4(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

// Pattern 5

    static void pattern5(int n){
        for(int i=0; i< 2 * n-1; i++){
            if(i<n){
                for(int j=0; j<=i; j++){
                System.out.print("* ");
                }
            }
            else{
                for(int j=0; j<(2 * n -1- i); j++){
                System.out.print("* ");
                }
            }
        System.out.println();

         }

         System.out.println();
     }

// Pattern 28

     static void pattern28(int n){
        for(int i=1; i< 2 * n ; i++){

            if(n>=i){
                for(int k=0; k<n-i; k++){
                    System.out.print(" ");
                }

                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int k=0; k<i-n; k++){
                    System.out.print(" ");
                }

                for(int j=1; j<=2*n-i; j++){
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }

// Pattern 30

     static void pattern30(int n){
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" " + " ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j + " ");
            }

            for(int a=1; a<=i-1; a++){
            System.out.print(a+1 + " ");
            }

            System.out.println();
        }

        System.out.println();
    }


// Pattern 17

static void pattern17(int n){
    for(int i=1; i< 2 * n; i++){
        if(n>i){
        for(int k=1; k<=n-i; k++){
            System.out.print(" " + " ");
        }

        for(int j=i; j>=1; j--){
            System.out.print(j + " ");
        }

        for(int a=1; a<=i-1; a++){
        System.out.print(a+1 + " ");
        }
    }
    else{
        for(int k=1; k<=i-n; k++){
            System.out.print(" " + " ");
        }

        for(int j= 2* n-i; j>=1; j--){
            System.out.print(j + " ");
        }

        for(int a=2; a<=2*n-i; a++){
        System.out.print(a + " ");
        }
    }

        System.out.println();
    }

    System.out.println();
}


// Pattern 31

    static void pattern31(int n){
        int original=n;
        n=2*n-1;
        for(int i=0; i<= n ; i++){
            for(int j=0; j<=n ; j++){
                int rightDistance= n-j;
                int leftDistance=j;
                int upDistance= i;
                int downDistance=n-i;

               int Value=original-Math.min(Math.min(rightDistance, leftDistance), Math.min(upDistance, downDistance));
               // int Value=Math.min(Math.min(rightDistance, leftDistance), Math.min(upDistance, downDistance));
               // int Value= Math.max(Math.max(rightDistance, leftDistance), Math.max(upDistance, downDistance))-n;

                System.out.print(Value + " ");
            }
            System.out.println();
        }
}






}
