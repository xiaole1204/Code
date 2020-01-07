import java.util.*;
public class M2Q05 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int x1=x;
        //Method 1
        int num=128;
        while(num>0)
        {
            System.out.print(x/num);
            x=x%num;
            num=num/2;
        }
        System.out.println();
        //Method 2
        String str="";
        for(int i=0;i<8;i++)
        {
            str=(x1%2)+str;
            x1=x1/2;
        }
        System.out.println(str);
    }
}
