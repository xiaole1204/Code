import java.util.*;
public class M2Q06 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int i;
        for(i=2;i<x;i++)
        {
            if(x%i==0)
                break;
        }
        if(x==i)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
