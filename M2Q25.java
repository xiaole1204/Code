import java.util.*;
public class M2Q25 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=2;i<=n;i++) {
            int tmp=i;
            while (tmp % 2 == 0)
                tmp /= 2;
            while (tmp % 3 == 0)
                tmp /= 3;
            while (tmp % 5 == 0)
                tmp /= 5;
            if (tmp == 1)
                sum+=i;
        }
        System.out.println(sum);
    }
}
