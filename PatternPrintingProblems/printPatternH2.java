import java.util.Scanner;
public class printPatternH2{
    public static void main(String []args){
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=count;j++){
                System.out.print(j+" ");
            }
            count+=2;
            System.out.println();
        }

    }
}