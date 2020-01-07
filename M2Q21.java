import java.util.*;
public class M2Q21 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int tmp,count=0;
        for(int i=5;i<=n;i+=5)
        {
            tmp=i;
            while(tmp%5==0)
            {
                count++;
                tmp/=5;
            }
        }
        System.out.println(count);
    }
}
