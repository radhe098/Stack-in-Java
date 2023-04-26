//Stack Program
import java.util.*;
public class stack {
    int max = 5;
    int top;
    int data[] = new int[max];
    void initialize() {
        top = -1;
    }
    int full() {
        if(top == max -1) {
            return (1);
        }
        else {
            return (0);
        }
    }
    int empty() {
        if(top == -1) {
            return (1);
        }
        else {
            return (0);
        }
    }
    void push() {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter data for push on the stack : ");
        x = sc.nextInt();
        if(top == -1) {
            top = 0;
            data[top] = x;
        }
        else {
            top = top +1;
            data[top] = x;
        }
        System.out.println("\nData pushed successfully!!");
    }
    void pop() {
        int x;
        if(top == -1) {
            System.out.println("\nStack is empty!!");
        }
        else {
            x = data[top];
            top = top -1;
        }
        System.out.println("\nData popped successfully!!");
    }
    void count() {
        int Count = 0;
        if(top == -1) {
            System.out.println("\nStack is empty!!");
        }
        else {
            for(int i = 0; i <= top; i++) {
                Count++;
            }
        }
        System.out.println("\nTotal data presetn in the stack are : " + Count);
    }
    void display() {
        int i;
        if(top == -1) {
            System.out.println("\nStack is empty!!");
        }
        else {
            System.out.println("\nStack Data : ");
            for(i = top; i >= 0; i--) {
                System.out.println(data[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int ch;
        s.initialize();
        do {
            System.out.println("\n*******Stack Operations*******");
            System.out.println("1. Push");  
            System.out.println("2. Pop");  
            System.out.println("3. Count");  
            System.out.println("4. Display");  
            System.out.println("5. Exit");  
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                    if(s.full() == 0) {
                        s.push();
                    }
                    else {
                        System.out.println("Stack is full!!");
                    }
                    break;
                case 2:
                    if(s.empty() == 0) {
                        s.pop();
                    }
                    else {
                        System.out.println("Stack is empty!!");
                    }
                    break;
                case 3:
                    s.count();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Thank you!!");
                    break;
                default:
                    System.out.println("Invalid choice!!");
                    break;
            }  
        }while(ch != 5);
    }
}