import java.util.*;
public class switchCase {

    public static void main(String args[]){
        int a = 5, b = 10, res;
        char ch;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operator as input(+, -, *, /): ");
        ch = sc.next().charAt(0);

        switch(ch){

            case '+':
                res = a + b;
                System.out.println("The addition of two numbers are: " + res);
                break;
            
            case '-':
                res = a - b;
                System.out.println("The difference of two numbers are: " + res);
                break;
            
            case '*':
                res = a * b;
                System.out.println("The product of two numbers are: " + res);
                break;
            
            case '/':
                res = a / b;
                System.out.println("The division of two numbers are: " + res);
                break;
            
            default:
                System.out.println("No such operator is present enter a valid operator");
            
        }
    }
    

}
