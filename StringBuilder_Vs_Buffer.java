
public class StringBuilder_Vs_Buffer {

	public static void main(String[] args) {
		//String - 90%
        String s0 = "Mahesh";
        String s1 = new String("Mahesh");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Mahesh");
        StringBuilder stringBuilder = new StringBuilder("Mahesh");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

	}

}
