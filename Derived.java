/**
 * Binding statico per metodi statici
 */

 class Base{
     public static String whoAmi(){
         return "classe base";
     }
 }

 class Derived extends Base{
    public static String whoAmi(){
        return "classe derivata";
    }
    public static void main(String[] args){
        Base prova = new Derived();
        System.out.println(prova.whoAmi());
    }
 }