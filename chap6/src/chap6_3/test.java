package chap6_3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 toBinary(23);
    }
    
    public static int toBinary(int decimal) {
        if(decimal > 0) {
            int bin = decimal % 2;
            decimal /= 2;
            
            toBinary(decimal);
            System.out.print(bin);
        }
        
        return 0;
    }
}
