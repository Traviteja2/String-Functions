
public class String__Buffer {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Ravi ");
        stringBuffer.append("Teja");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);

	}

}
