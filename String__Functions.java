
public class String__Functions {

	public static void main(String[] args) {
		String str1 = "11";
        String str2 = "20";
        String str3 = new String("11");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
		
        String str4 = "Ravi teja";
        String str5 = "Mahesh";
        String str6 = new String("Mahesh babu");
        System.out.println(str4 == str5);
        System.out.println(str4 == str6);
        System.out.println(str4.equals(str6));
		
		

	}

}
