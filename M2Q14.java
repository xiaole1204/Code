import java.util.*;
public class M2Q14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=i*(i+1);
        System.out.println(sum);
    }
}
