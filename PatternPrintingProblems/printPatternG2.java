QUESTION:Print below pattern according to the input given by the user for customization in pattern:
1 2 3 4 5 6 
7 8 9 10 11 12 
13 14 15 16 17 18 
19 20 21 22 23 24 
25 26 27 28 29 30 
31 32 33 34 35 36    
SOLUTION:

        
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

