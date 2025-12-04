//import java.util.ArrayList;

//import java.util.Arrays;

public class StringBuilder13{
    public static void main(String[] args) {

    // String a= new String("Kaushiki");
    // String b= new String("Kaushiki");

    // System.out.println(a==b);

    // float c = 534.122324f;
    // System.out.println(c);
    // System.out.printf("The formatted number is %.2f", c);
    // System.out.println();

    // System.out.printf("Pie: %.3f", Math.PI);
    // System.out.println();

    // System.out.printf("Hello, my name is %s and I am %s" , "Kaushiki", "Cool");
    // System.out.println();

    // //better to use Integer.valueof(56) to avoid unneccessary object creation;
    // // Integer(int) is not a good practise since java 9 version
    // // System.out.println(new Integer(56) + "Aa");

    // // System.out.println(new Integer(56) +" A " + new ArrayList<>());

    // String series="";
    // for(int i=0; i<26; i++){
    //     char ch= (char) ('a' +i);

    //    // System.out.print(ch + " ");

    //   //  System.out.println();

    //     series= series +ch;
    // }

    // System.out.println(series);

    // StringBuilder sb= new StringBuilder();
    // for(int i = 0; i<26; i++){
    //     char ch= (char) ('a' + i);

    //     sb.append(ch);
    // }

    // // both are same
    // System.out.println(sb.toString());
    // System.out.println(sb);

    // String name="Kim Taehyung";
    // System.out.println(Arrays.toString(name.toCharArray()));

    // String str="\u2000Hello\u2000";
    // System.out.println(str.trim());
    // System.out.println(str.strip());
    


    // PALINDROM NUMBER OR NOT
    String str= "abcdcba";

    System.out.println(isPalindrom(str));
    
}

static boolean isPalindrom(String str){
    if(str== null || str.length()==0){
        return true;
    }
     str= str.toLowerCase();

    for(int i=0; i< str.length()/2; i++){
        char start= str.charAt(i);
        char end= str.charAt(str.length()-1-i);

    if(start != end){
        return false;
    }
}
return true;
}
}