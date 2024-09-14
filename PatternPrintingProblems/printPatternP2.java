import java.util.Scanner;
public class printPatternP2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char st='A';
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(st));
                st+=1;
            }System.out.println();
        }
    }}