package test1;

import java.util.Scanner;

public class Main {
	static Stack s = new Stack();
	static Stack t = new Stack();
	public static void main(String[] args) {
		s.CreateStack();
		s.PushStack(5);
		System.out.println(s.toString());
		s.PushStack(25);
		System.out.println(s.toString());
		s.PushStack(45);
		System.out.println(s.toString());
		s.PushStack(67);
		System.out.println(s.toString());
		s.PushStack(78);
		System.out.println(s.toString());
		s.PushStack(89);
		System.out.println(s.toString());
		System.out.println(s.PopStack());
		System.out.println(s.toString());
		System.out.println(s.Peek());
		s.PushStack(10);
		System.out.println(s.toString());
		s.PushStack(23);
		System.out.println(s.toString());
		if(s.IsFull()==true) {
			System.out.println("the Stack is full");
		}
		Scanner kb = new Scanner(System.in);
		System.out.println("enter -1: ");
		int x = kb.nextInt();
		if(x==-1) {
			s.reverse();
		}
		System.out.println(s.PopStack());
		System.out.println(s.toString());
		System.out.println(s.PopStack());
		System.out.println(s.toString());
		System.out.println(s.PopStack());
		System.out.println(s.toString());
		System.out.println(s.PopStack());
		System.out.println(s.toString());
		System.out.println(s.PopStack());
		System.out.println(s.toString());
		System.out.println(s.PopStack());
		System.out.println(s.toString());
		System.out.println(s.PopStack());
		System.out.println(s.toString());
		if(s.IsEmpty()==true) {
			System.out.println("the Stack is empty");
		}
		String expr = "([{}])";
		 
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
		System.out.println(toPostfix("(5 + 2) ∗ (8 − 3))/4"));
		
	}
	static boolean areBracketsBalanced(String expr){
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{') {
                t.push(x);
                continue;
            }
            if (t.IsEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = t.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = t.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = t.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
        return (t.IsEmpty());
    }
	
	static int prec(int i) {  
		if (i == '+' || i == '-') {  
			return 1;
		}  
		if (i == '*' || i == '/' || i == '%') { 
			return 2; 
		}
		return 0;  
	}  
	
	public static String toPostfix(String infix) {
	
		char symbol;  
		String postfix = "";  
		for(int i=0;i<infix.length();++i){  
			symbol = infix.charAt(i);  
			if (Character.isLetter(symbol)) {  
				postfix = postfix + symbol;  
			}
			else if (symbol=='('){  
				t.PushStack(symbol);  
			}  
			else if (symbol==')'){  
				while (t.Peek() != '(')  {  
					postfix = postfix + t.PopStack();  
				}  
			t.PopStack(); 
			}  
			else{  
				while (!t.IsEmpty() && !(t.Peek()=='(') &&prec(symbol) <= prec(t.Peek())) {
					postfix = postfix + t.PopStack();  
					t.PushStack(symbol); 
				} 
			}  
		}  
		while (!t.IsEmpty()) {
			postfix = postfix + t.PopStack();  
			return postfix;
		}
		return t.toString();  
}

}
