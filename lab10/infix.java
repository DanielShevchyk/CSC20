//infix.java
//Lab 010
//CSC 20
//Daniel Shevchyk
import java.io.*;
import java.util.*;


class infix {
	public static void main(String[] args) throws IOException {
	LinkedList <Token> Post;
	while(true) {
		System.out.print("Enter infix: ");
		System.out.flush();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		if ( s.equals("") ) break;
      try {
		Post = infixToPostfix(s);
		System.out.println("Postfix is ");// + Post.toString() + '\n');
      for(Token j: Post){
         System.out.print(j + " ");
         }
      System.out.println();
		int total = evaluePostfix(Post);
		System.out.println("Result is " + total + '\n');
      } catch(Exception e) {
				System.out.println("\n***** "+e.toString()+" *****\n");
			}

	}
     }
   static LinkedList <Token> infixToPostfix(String s)throws Exception{
      Stack<Operator> theStack = new Stack<Operator>();
      LinkedList<Token> queue = new LinkedList<Token>();
      Tokenizer T = new Tokenizer(s);
      theStack.push(new Operator('#'));
         while (T.moreTokens()) {    
            Token tkn =T.nextToken();
               if (tkn instanceof Operand)
               {
               queue.addLast(tkn);
               } else { Operator opr = (Operator)tkn;
            if (opr.operator == '(') {
         theStack.push(opr);
         }else if (opr.operator == ')')
         {
         try{
            while ((theStack.peek()).operator!='('){
               queue.addLast(theStack.pop());
               
            }theStack.pop();} catch (Exception e){
                              throw new infixException(errorType.ExcessRightParenthesis);
                              }
            }else{
            while ((theStack.peek()).precedence()>=opr.precedence()){
               queue.addLast(theStack.pop());
               
            }theStack.push(opr);
         }   
         }       
   }
   while ((theStack.peek()).operator!='#'){
      if ((theStack.peek()).operator== '('){
         throw new infixException(errorType.ExcessLeftParenthesis);
         }
      queue.addLast(theStack.pop());
      } theStack.pop();
      return queue;
   }         
   static int evaluePostfix(LinkedList Post)throws Exception {
   Stack<Operand> stack = new Stack<Operand>();
	int total = 0;
   int op1;
   int op2;
		while (!Post.isEmpty()){
         Token tkn = (Token)Post.removeFirst();
			if (tkn instanceof Operand){
				stack.push((Operand)tkn);
			}
         
			else{
         Operator opr = (Operator) tkn;    
            try{
                     
				op2 = (stack.pop()).operand;
				op1 = (stack.pop()).operand;
            }catch (Exception e){throw new infixException(errorType.ExcessOperator);}
				switch (opr.operator){
					case '+': total = op1 + op2; break;
					case '-': total = op1 - op2; break;
					case '*': total = op1 * op2; break;
					case '/': total = op1 / op2;  
			}
			stack.push(new Operand(total));
		}
                           
                         
		}
      stack.pop();
      if (!stack.isEmpty()) throw new infixException(errorType.ExcessOperand);	
   return total;  
} 
}
enum errorType{ ExcessLeftParenthesis, ExcessRightParenthesis, ExcessOperator, ExcessOperand};
class infixException extends Exception {
   private errorType etype;
   public infixException(errorType et) { // constructor
   etype = et;
}
   public String toString() {
   return etype.name();
}   
}


