import java.util.Scanner;

public class printPatternY2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count;
        count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print("  ");
                }
                else {
                    System.out.print(count+" ");
                    count++;}
            }
            System.out.println();
        }
    }
}