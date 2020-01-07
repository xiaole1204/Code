import java.util.*;
public class M2Q13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long sum=1;
        for(int i=1;i<=n;i++)
            sum*=i;
        System.out.println(sum);
    }
}
