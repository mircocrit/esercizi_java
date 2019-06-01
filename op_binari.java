//Esempio egli operatori logici binari
public class op_binari {
    public static void main (String args[]){
        String binario[] ={"0000","0001","0010","0011","0100",
        "0101",
        "0110", "0111", "1000", "1001", "1010", "1011",
        "1100", "1101", "1110", "1110", "1111" };
        int varA=3; /* 0000 0011 */
        int varB=6; /* 0000 0110 */
        int varC=varA|varB; //or
        int varD= varA&varB; //and
        int varE= varA^varB; //xor
        int varF= (~varA & varB) | ( varA & ~varB);
        System.out.println("varA=" + binario[varA]);
        System.out.println("varB=" + binario[varB]);
        System.out.println("varC=" + binario[varC]);
        System.out.println("varD=" + binario[varD]);
        System.out.println("varE=" + binario[varE]);
        System.out.println("varF=" + binario[varF]);
    }
}
