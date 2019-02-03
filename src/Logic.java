
public class Logic {




   public static String math(String operator, String firstNumber, int firstBase, String number, int base, int baseOutput, Boolean firstNegative, Boolean secondNegative){
       int[] secondArray = conversionCalc.toArray(number);
       double secondNumberDec = conversionCalc.toDeci(secondArray, base);

       String answer;

       if(firstNumber.equals(" ")){

           answer = conversionCalc.toBase(secondNumberDec, baseOutput);
           if(secondNegative){
               answer = "-" + answer;
           }

       } else{

           int[] firstArray = conversionCalc.toArray(firstNumber);
           double firstNumberDec = conversionCalc.toDeci(firstArray, firstBase);
           //DEAL WITH AFTER
           double numAnswer;

           if(firstNegative){
               firstNumberDec = firstNumberDec * -1.0;

           } else if(secondNegative){
               secondNumberDec = secondNumberDec * -1.0;
           }


           if(operator.equals("+")){
               numAnswer = add(firstNumberDec, secondNumberDec);

           }else if(operator.equals("-")){
               numAnswer = subtract(secondNumberDec, firstNumberDec);
           }else if(operator.equals("x")){
               numAnswer = multiply(firstNumberDec, secondNumberDec);
           }
           else{
               numAnswer = divide(secondNumberDec, firstNumberDec);
           }




           answer = conversionCalc.toBase(numAnswer, baseOutput);

       }

       return answer;


   }

   public static double add(double firstNumberDec, double secondNumberDec){
        return firstNumberDec + secondNumberDec;
   }
   public static double subtract(double firstNumberDec, double secondNumberDec){
       return secondNumberDec - firstNumberDec;
   }
   public static double multiply(double firstNumberDec, double secondNumberDec){
        return firstNumberDec * secondNumberDec;
   }
   public static double divide(double firstNumberDec, double secondNumberDec){
        return  secondNumberDec / firstNumberDec;
   }



}
