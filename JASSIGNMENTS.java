import java.util.Scanner;
//https://www.codechef.com/problems/JASSIGNMENTS
public class JASSIGNMENTS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            if((a+3)<=10){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
}
