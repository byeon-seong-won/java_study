package baekjoon;



public class Practice {

	public static void main(String[] args) {
		hello("성원");
	}
	private static void hello(String name) {
		System.out.printf("이름 : %s%n" , name);
		String ans = greet("인사하자");
		if(ans == "인사하자") {
			System.out.println("성공!");
		} else {
			System.out.println("실패!");
		}
	}
	private static String greet(String string) {
		System.out.println(string);
		return string;
	}

	
	
}




