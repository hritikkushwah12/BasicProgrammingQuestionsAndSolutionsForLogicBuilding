QUESTION:Print pattern given below with the input n given by the user for customization in pattern:
given n=4:
A B C D 
A B C D 
A B C D 
A B C D 
SOLUTION:


import java.util.Scanner;
public class printPatternL2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)('A'+j-1)+" ");
            }
            System.out.println();
        }
    }
}
