import java.util.Scanner;
public class printPatternI2{
    public static void main (String []args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }}
