import java.util.Scanner;
public class printPatternZA2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=2*i;k++){
                System.out.print("* ");
            }
            for(int l=n-i;l>0;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }


    }
}