QUESTION:Print below pattern according to the input n given by the user for further customization in pattern by the user:
given here n=6
ABCDEF
GHIJKL
MNOPQR
STUVWX
YZ[\]^
_`abcd
SOLUTION:


import java.util.Scanner;
public class printPatternmM2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)('A'+(count-1)));
                count++;
            }
            System.out.println();
        }

    }
}
