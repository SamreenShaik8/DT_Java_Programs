import java.util.*;
class Rev_num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        // initially rev value will be zero
        int rev=0;

        // condition for reverse a number
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse number is:"+rev);
    }
}