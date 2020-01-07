import java.util.Scanner;
public class M2Q18 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean flag=false; //判斷是否有整數可以相加，預設不行
        int n=in.nextInt();
        int sum;
        for(int i=1;i<=n/2;i++)
        {
            sum=0;
            int tmp=i; //記錄從那個數字開始加
            int now=i; //加到哪一個數字剛好等於n
            while(sum<n) { //累加>=n就開始判斷
                sum += now++;
            }
            if(sum==n) //等於n代表找到了
            {
                flag=true;//發現可以之後，改成true
                System.out.print(tmp);
                for(int j=tmp+1;j<now;j++)
                    System.out.print("+"+j);
                System.out.println();
            }
        }
        if(flag==false)
            System.out.println("No");
    }
}
