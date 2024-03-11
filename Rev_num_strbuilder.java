import java.util.*;
public class Rev_num_strbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        StringBuilder sb=new StringBuilder();
        sb.append(num);
        System.out.println("Reversed number is:"+sb.reverse());
    }
}
