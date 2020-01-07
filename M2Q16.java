import java.util.*;
public class M2Q16
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int tmp=1;
        int sum=0;
        for(int i=1;i<=n;i++) {
            tmp *= 2;
            sum += tmp;
        }
        System.out.println(sum);
    }
}
