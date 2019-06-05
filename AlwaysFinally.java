/**
 * Clausola finally
 */

 class FourException extends Exception {}

 public class AlwaysFinally {
     public static void main(String[] args){
         System.out.println("Entering first try block");
         try{
            System.out.println("Entering second try block");
            try{
                throw new FourException();
                //System.out.println("Hello"); unreachable code
            }finally{
                System.out.println("Finally in second try block");
            }
         }catch(FourException e){
             System.err.println("Caught FourException in first try block");
         }finally
         {
             System.err.println("Finally in first try block");
         }
     }
 }