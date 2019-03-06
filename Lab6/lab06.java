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
               for(; cur<Buf.length && B
               uf[cur] == ' '; cur++);
               return cur<Buf.length;
               
         }
         
         Token nextToken() {
         //skip blanks.
         for(; cur<Buf.length && Buf[cur] == ' '; cur++);
         
         if (cur>=Buf.length) return null;
         
         
         
         // If the next character is a digit, keep reading until a non-digit is read.
         // convert the string of digits into a integer.
         
         
         //String Digits = new String(Bug,start, len);
         //int sum = Integer.valueof(Digits).intValue();
         
         //Use num to create and return an operand.
         
         // Otherwise, use the next character to create and return an operator. 