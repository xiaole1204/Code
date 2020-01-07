import java.util.*;
public class M2Q24 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int m=0;
        while(sum<=n)
            sum+=++m;
        System.out.println(m-1);
    }
}
