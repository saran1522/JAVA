import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        //this is a calculator
        Scanner sc=new Scanner(System.in);
        System.out.println("\nWelcome to the calculator program!\nplease press 'x' as the input for operator to stop the calculator");
        char op='+';
        while(op!='x'){
            System.out.println("\nenter the 1st number: ");
            int a=sc.nextInt();
            System.out.println("enter the operation you want to perform: "); 
            op=sc.next().charAt(0);
            System.out.println("enter 2nd number ");
            int b=sc.nextInt();
        switch(op){
            case '+':
              {
                System.out.println("ths answer is: "+(a+b));
                break;
              }
              case '-':
              {
                System.out.println("the answer is: "+(a-b));
                break;
              }
              case '*':
              {
                System.out.println("the answer is: "+(a*b));
                break;
              }
              case '/':
              {
                System.out.println("the answer is:" +(a/b));
                break;
              }
              case 'x':
              {
                System.out.println("all operastins ended, calculator has been off");
                break;
              }
              default:
               System.out.println("invalid operator please try again...");
            }
            if(op!='x')
            System.out.println("\nnext operation");
    }
    }
}
