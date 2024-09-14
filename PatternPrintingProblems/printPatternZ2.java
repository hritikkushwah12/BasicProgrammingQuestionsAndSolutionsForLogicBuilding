import java.util.Scanner;
public class printPatternZ2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int l=1;l<=n;l++) {
            for (int i = 1; i <= n -l; i++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= l; j++) {
                System.out.print(j + " ");
            }
            for (int k = l - 1; k>0; k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }}