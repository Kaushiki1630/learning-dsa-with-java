package LinkedList.LinkedListQuestions;

public class HappyNumber {
    public static Boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(fast != slow);

        if(fast == 1 || slow == 1){
            return true;
        }

        return false;
    }

    public static int findSquare(int n){
        int ans = 0;

        while(n > 0){
            int rem = n% 10;
            ans = ans + (rem * rem);
            n=n/10;
        }

        return ans;
    }

    public static void main(String[] args) {
       // HappyNumber hn= new HappyNumber();
        System.out.println(HappyNumber.isHappy(19));
    }
    
}
