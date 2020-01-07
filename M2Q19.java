import java.util.*;
public class M2Q19 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=1,now=1;
        while(sum<n)
        {
            System.out.print(sum+"\t");
            sum+=now++;
        }
        System.out.println(sum);
        for(int i=1;i<=n+1;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(i+"\t");
        }
        System.out.println();
    }
}
