import java.util.Scanner;
public class printPatternG2 {
        public static void main(String []args){
            Scanner inp=new Scanner(System.in);
            int n=inp.nextInt();
            int count=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print(count+" ");
                        count+=1;
                    }
                System.out.println();
                }
            }}

