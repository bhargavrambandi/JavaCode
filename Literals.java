public class Literals {

    // literals are the constant values that appear directly in the program. It can
    // be assigned directly to a variable. Java has various types of literals
    // Integer Literal
    // Character Literal
    // Boolean Literal
    // String Literal

    public static void main(String[] args) {
        int count = 987;
        float floatVal = 4534.99f;
        double cost = 19765.567;
        int hexaVal = 0x7e4;
        int binary = 0b11010;
        char alpha = 'p';
        String str = "Java";
        boolean boolVal = true;
        int octalVal = 067;
        String stuName = null;
        char ch1 = '\u0021';
        char ch2 = 1456;
        //invalid literals 
        //float g = 6_.674f;  
        //float g = 6._674F;  
        //long phoneNumber = 99_00_99_00_99_L;  
        //int x = 77_;  
        //int y = 0_x76;  
       // int z = 0X_12;   
        //int z = 0X12_; 
        System.out.println(count);
        System.out.println(floatVal);
        System.out.println(cost);
        System.out.println(hexaVal);
        System.out.println(binary);
        System.out.println(alpha);
        System.out.println(str);
        System.out.println(boolVal);
        System.out.println(octalVal);
        System.out.println(stuName);
        System.out.println(ch1);
        System.out.println("\t" + "backslash literal");
        System.out.println(ch2);
    }
 
}
