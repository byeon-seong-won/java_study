



public class Hello {

	public static void main(String[] args) {
		String s = "12345";
		int i = Integer.parseInt(s);
		System.out.printf("문자를 숫자로 %d   (%d)   \n", i , i+10);
		
		String a;
		a = String.format("%d", i);
		System.out.print("한줄 붙여지는지");
		System.out.print("테스트");
		System.out.println("함");
		
		System.out.println("한줄 띄어지는 지");
		System.out.println("테스트");
		
		
//		System.out.printf("숫자를 문자로 %s (%s)\n", a, a+ "abcde");
	}

}
