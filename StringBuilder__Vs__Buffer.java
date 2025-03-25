
public class StringBuilder__Vs__Buffer {

	public static void main(String[] args) {
		String s0 = "Mahesh babu";
        String s1 = new String("Mahesh babu");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Mahesh babu");
        StringBuilder stringBuilder = new StringBuilder("Mahesh babu");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

	}

}
