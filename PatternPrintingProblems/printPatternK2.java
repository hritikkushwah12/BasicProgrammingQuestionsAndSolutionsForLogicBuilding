QUESTION:Print below pattern according to the input n given by the user for further customization in pattern by the user:
given here n=8
A A A A A A A A 
B B B B B B B B 
C C C C C C C C 
D D D D D D D D 
E E E E E E E E 
F F F F F F F F 
G G G G G G G G 
H H H H H H H H     
SOLUTION:


import java.util.Scanner;
public class printPatternK2 {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               System.out.print( (char)('A'+i-1)+" ");
            }
            System.out.println();
        }

    }
}
    
