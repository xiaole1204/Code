import java.util.*;
public class M2Q15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
            sum+=1.0/((2*i-1)*(2*i));
        System.out.println(sum);
    }
}
