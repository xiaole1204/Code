import java.util.*;
public class M2Q17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            count++;
            n/=10;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
