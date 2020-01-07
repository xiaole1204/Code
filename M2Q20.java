import java.util.*;
public class M2Q20 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=2;i<n;i++)
        {
            int j;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.println(i);
        }
    }
}
