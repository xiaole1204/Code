import java.util.*;
public class M2Q10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
                System.out.print(i*j+"\t");
            System.out.println();
        }
    }
}
