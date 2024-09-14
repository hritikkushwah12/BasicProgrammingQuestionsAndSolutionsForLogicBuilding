QUESTION:Print below pattern according to the input n given by the user for further customization in pattern by the user:
given here n=9
ABCDEFGHI
BCDEFGHIJ
CDEFGHIJK
DEFGHIJKL
EFGHIJKLM
FGHIJKLMN
GHIJKLMNO
HIJKLMNOP
IJKLMNOPQ
SOLUTION:


import java.util.Scanner;
public class printPatternN2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char start='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(start+j-1));
            }
            start++;
            System.out.println();
        }

    }}
