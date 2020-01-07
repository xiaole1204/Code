import java.util.*;
public class M2Q07 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char str;
        int count;
        int n=in.nextInt();
        int L,R,S;
        for(int i=1;i<=n;i++)
        {
            count=0;
            L=in.nextInt();
            R=in.nextInt();
            S=in.nextInt();
            if(L>=60&&R>=60&&S>=60)
                str='P';
            else
            {
                if(L<60) count++;
                if(R<60) count++;
                if(S<60) count++;
                if(count==1)
                {
                    if(L+R+S>=220)
                        str='P';
                    else
                        str='M';
                }
                else if(count==2)
                {
                    if(Math.max(L,Math.max(R,S))>=80)
                        str='M';
                    else
                        str='F';
                }
                else
                    str='F';
            }
            System.out.println(str);
        }
    }
}
