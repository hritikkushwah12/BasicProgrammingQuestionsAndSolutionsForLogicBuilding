import java.util.Scanner;
public class printPatternQ2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+i+j-2));
            }
            System.out.println();
        }
    }
}