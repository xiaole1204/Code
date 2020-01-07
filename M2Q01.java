import java.util.*;
public class M2Q01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float max=-Float.MAX_VALUE,min=Float.MAX_VALUE;
        for(int i=1;i<=10;i++)
        {
            float n=in.nextFloat();
            if(n>max)
                max=n;
            if(n<min)
                min=n;
        }
        System.out.printf("max=%.2f\n",max);
        System.out.printf("min=%.2f\n",min);
    }
}
