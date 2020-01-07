import java.util.*;
public class M2Q23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n>0)
        {
            System.out.print(n%10);
            n/=10;
        }
        System.out.println();
    }
}
