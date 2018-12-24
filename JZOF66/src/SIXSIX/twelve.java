package SIXSIX;
/*给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。*/
public class twelve {
    public static void main(String[] args) {
		System.out.println(Power(1.36,10));
		
	}
	  public static double Power(double base, int exponent) {
	         double result = base;
             int n = exponent;
          if (exponent < 0) {
            exponent = - exponent;
        }
        else if(exponent == 0) {
            return 1;
        }
             for (int i = 1; i < exponent; i++) {
                    result *= base;
            }
             return n < 0 ? 1 / result : result;
	  }
}
