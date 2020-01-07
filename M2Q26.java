import java.util.*;
public class M2Q26 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int drink=n;
        while(n>=3)
        {
            drink+=n/3;
            n=n/3+n%3;
        }
        System.out.println(drink);
    }
}
