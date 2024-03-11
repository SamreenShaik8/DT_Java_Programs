import java.util.Scanner;
public class Rev_num_strbuffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        StringBuffer sb=new StringBuffer(String.valueOf(num));
        System.out.println("Reversed number is:"+sb.reverse());

    }
}
