/**
Daniel Shevchyk
Lab 06
CSC 20
**/
class Tokenizer {
   private char [] Buf;
   private int cur;
   
   Tokenizer(String infixExpression){
         Buf = infixExpression.toCharArray();
         cur = 0;
         
         }
         
         boolean moreTokens() {
               for(; cur<Buf.length && Buf[cur] == ' '; cur++);
               return cur<Buf.length;
               
         }
         
         Token nextToken() {
         //skip blanks.
         for(; cur<Buf.length && Buf[cur] == ' '; cur++);
         
         if (cur>=Buf.length) return null;
         if (Buf[cur]>='0' && Buf[cur]<='9'){
            int start = cur;
         while(cur<Buf.length && Buf[cur]>='0' && Buf[cur]<='9'){
            
            cur++;
            }
         
         
         String Digits = new String(Buf, start, cur-start);
         int num = Integer.valueOf(Digits).intValue();
         return new Operand(num);
         
         }else{return new Operator(Buf[cur++]);}
         
         }
         
         }
         
        
         
         //Use num to create and return an operand.
         
         // Otherwise, use the next character to create and return an operator. 