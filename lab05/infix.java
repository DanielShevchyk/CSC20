//infix.java
//Lab 05
//CSC 20
//Daniel Shevchyk
import java.io.*;
import MyStackQueue.*;

class TooManyRight extends Exception {
	public String toString () { return "Too many )";}
 }
class TooManyLeft extends Exception {
	public String toString () { return "Too many (";}
 }
class TooManyOperands extends Exception {
	public String toString () { return "Too many operands";}
 }
class TooManyOperators extends Exception {
	public String toString () { return "Too many operators";}
 }

class infix {
	public static void main(String[] args) throws IOException {
	Queue Post;
	while(true) {
		System.out.print("Enter infix: ");
		System.out.flush();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		if ( s.equals("") ) break;
      try {
		Post = infixToPostfix(s);
		System.out.println("Postfix is " + Post.toString() + '\n');
		int total = evaluePostfix(Post);
		System.out.println("Result is " + total + '\n');
      } catch(Exception e) {
				System.out.println("\n***** "+e.toString()+" *****\n");
			}

	}
     }
   static Queue infixToPostfix(String s)throws Exception{
      Stack theStack = new Stack();
      Queue queue = new Queue();
      Tokenizer T = new Tokenizer(s);
      theStack.push(new Operator('#'));
         while (T.moreTokens()) {    
            Token tkn =T.nextToken();
               if (tkn instanceof Operand)
               {
               queue.enqueue(tkn);
               } else { Operator opr = (Operator)tkn;
            if (opr.operator == '(') {
         theStack.push(opr);
         }else if (opr.operator == ')')
         {
         try{
            while (((Operator)theStack.top()).operator!='('){
               queue.enqueue(theStack.pop());
               
            }theStack.pop();} catch (Exception e){
                              throw new TooManyRight();
                              }
            }else{
            while (((Operator)theStack.top()).precedence()>=opr.precedence()){
               queue.enqueue(theStack.pop());
               
            }theStack.push(opr);
         }   
         }       
   }
   while (((Operator)theStack.top()).operator!='#'){
      if (((Operator)theStack.top()).operator== '('){
         throw new TooManyLeft();
         }
      queue.enqueue(theStack.pop());
      } theStack.pop();
      return queue;
   }         
   static int evaluePostfix(Queue Post)throws Exception {
   Stack stack = new Stack();
	int total = 0;
   int op1;
   int op2;
		while (!Post.isEmpty()){
         Token tkn = (Token)Post.dequeue();
			if (tkn instanceof Operand){
				stack.push(tkn);
			}
         
			else{
         Operator opr = (Operator) tkn;    
            try{
                     
				op2 = ((Operand)stack.pop()).operand;
				op1 = ((Operand)stack.pop()).operand;
            }catch (Exception e){throw new TooManyOperators();}
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
      if (!stack.isEmpty()) throw new TooManyOperands();
	
   return total;
   
}
}
   



