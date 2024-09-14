import java.util.Scanner;

public class printPatternV2{
    public static void main(String []  args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i-1)System.out.print("  ");
                else System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}