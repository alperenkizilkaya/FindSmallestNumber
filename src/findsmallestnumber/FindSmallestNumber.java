
package findsmallestnumber;
import java.util.Scanner;

public class FindSmallestNumber {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("write your first number ");
        int a = s.nextInt();
        
        System.out.println("write your second number ");
        int b = s.nextInt();
        
        System.out.println("write your third number ");
        int c = s.nextInt();
        
        if(a<b && a<c){
            System.out.println("first number " + a + " is smallest");
        }else if(b<a && b<c){
            System.out.println("second number " + b + " is smallest");
        }else if(c<b && c<a){
            System.out.println("third number " + c + " is smallest");
        }
    } 
    
}
