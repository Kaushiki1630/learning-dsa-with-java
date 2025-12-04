package RecursionConcepts;

public class SetNPermutation {
    
//SUBSEQUENCE OR SUBSET

// public static void main(String[] args) {
//     String str="abc";

//     //subseq("", str);

//     System.out.println();

//     System.out.println(subseq1("", str));


// }

// static void subseq(String process, String unprocess){
//     if(unprocess.isEmpty()){
//         System.out.print(process + " ");
//         return;
//     }

//     char ch=unprocess.charAt(0);

//     subseq(process +ch, unprocess.substring(1));
//     subseq(process, unprocess.substring(1));

// }

// static ArrayList<String> subseq1(String process, String unprocess){
//     if(unprocess.isEmpty()){
//         ArrayList<String> al= new ArrayList<>();
//         al.add(process);
//         return al;

//     }

//     char ch=unprocess.charAt(0);

//     ArrayList<String> left= subseq1(process +ch, unprocess.substring(1));
//     ArrayList<String> right= subseq1(process, unprocess.substring(1));

//     left.addAll(right);

//     return left;

// }


// PERMUTATION

// public static void main(String[] args) {
//     String str="abc";

//    // permutation("", str);

//    // ArrayList<String> ans= permutation("", str);
//    // System.out.println(ans);

//    System.out.println(Countpermutation("", str));
// }

// // static void permutation(String p, String up){
// //     if(up.isEmpty()){
// //         System.out.println(p);
// //         return;
// //     }

// //     int NumofCalls= p.length();

// //     char ch=up.charAt(0);
    
// //     for(int i=0; i<=NumofCalls; i++){
// //         String first=p.substring(0, i);
// //         String second=p.substring(i, p.length());
// //         permutation(first+ ch+ second, up.substring(1));
// //     }
// // }


// // static ArrayList<String> permutation(String p, String up){
// //     if(up.isEmpty()){
// //         ArrayList<String> al= new ArrayList<>();
// //         al.add(p);
// //         return al;
// //     }

// //     int NumofCalls= p.length();

// //     char ch=up.charAt(0);
    
// //     ArrayList<String> ans= new ArrayList<>();
// //     for(int i=0; i<=NumofCalls; i++){
// //         String first=p.substring(0, i);
// //         String second=p.substring(i, p.length());
// //        ans.addAll(permutation(first+ ch+ second, up.substring(1)));
// //     }

// //     return ans;
// // }

// static int Countpermutation(String p, String up){
//     if(up.isEmpty()){
//         return 1;
//     }

//     int NumofCalls= p.length();

//     char ch=up.charAt(0);
//     int count=0;
//     for(int i=0; i<=NumofCalls; i++){
//         String first=p.substring(0, i);
//         String second=p.substring(i, p.length());
//         count = count+ Countpermutation(first+ ch+ second, up.substring(1));
//     }

//     return count;
// }

// LETTER COMBINATION OF A PHONE NUMBER (GOOGLE) LEETCODE

// public static void main(String[] args){
//    // phonePad("", "812");

//   // ArrayList<String> result = phonePad("", "12");
//   // System.out.println(result);

//   System.out.println(phonePad("", "12"));

    
// }

// // static void phonePad(String p, String up){
// //     if(up.isEmpty()){
// //         System.out.println(p);
// //         return;
// //     }

// //     int digit=up.charAt(0) -'0';

// //     for(int i=(digit-1) * 3; i< digit *3; i++){

// //         char ch=(char) ('a' + i);
// //         phonePad(p+ch, up.substring(1));
// //     }
// // }


// // static ArrayList<String> phonePad(String p, String up){
// //     if(up.isEmpty()){
// //         ArrayList<String> al = new ArrayList<>();
// //         al.add(p);
// //         return al;
// //     }

// //     int digit=up.charAt(0) -'0';

// //     ArrayList<String> ans = new ArrayList<>();
// //     for(int i=(digit-1) * 3; i< digit *3; i++){

// //         char ch=(char) ('a' + i);
// //         ans.addAll(phonePad(p+ch, up.substring(1)));
// //     }

// //     return ans;
// // }


// static int phonePad(String p, String up){
//     if(up.isEmpty()){
//         return 1;
//     }

//     int digit=up.charAt(0) -'0';

//     int count=0;
//     for(int i=(digit-1) * 3; i< digit *3; i++){

//         char ch=(char) ('a' + i);
//         count = count + (phonePad(p+ch, up.substring(1)));
//     }

//     return count;
// }

// NUMBER OF DICE ROLLS WITH TARGET SUM (AMAZON) 

// public static void main(String[] args) {
//     //dice("", 4);

//     ArrayList<String> result = dice("", 4);
//     System.out.println(result);

    
//     ArrayList<String> result1 = dice1("", 6, 8);
//     System.out.println(result1);
// }

// // static void dice(String p, int target){
// //     if(target==0){
// //         System.out.println(p);
// //         return;
// //     }

// //    for(int i=1; i<=6 && i<=target; i++){
// //     dice(p+i, target-i);
// //    } 
// // }


// static ArrayList<String> dice(String p, int target){
//     if(target==0){
//         ArrayList<String> al = new ArrayList<>();
//         al.add(p);
//         return al;
//     }

//     ArrayList<String> ans = new ArrayList<>();
//    for(int i=1; i<=6 && i<=target; i++){
//     ans.addAll(dice(p+i, target-i));
//    }

//    return ans;
// }

// //(ANY) custom number of faces
// static ArrayList<String> dice1(String p, int target, int faces){
//     if(target==0){
//         ArrayList<String> al = new ArrayList<>();
//         al.add(p);
//         return al;
//     }

//     ArrayList<String> ans = new ArrayList<>();
//    for(int i=1; i<=faces && i<=target; i++){
//     ans.addAll(dice1(p+i, target-i, faces));
//    }

//    return ans;
// }
}
