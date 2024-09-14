QUESTION:Print below pattern according to the input n given by the user for further customization in pattern by the user:
given here n=11
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
6 5 4 3 2 1 
7 6 5 4 3 2 1 
8 7 6 5 4 3 2 1 
9 8 7 6 5 4 3 2 1 
10 9 8 7 6 5 4 3 2 1 
11 10 9 8 7 6 5 4 3 2 1 
SOLUTION:


import java.util.Scanner;
public class printPatternJ2{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((i-j+1)+" ");
            }
            System.out.println();

        }
    }}
