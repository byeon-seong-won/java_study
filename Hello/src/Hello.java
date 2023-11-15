

import java.util.*;

public class Hello {

	public static void main(String[] args) {
		
		
		
		System.out.println("******************** pr01 ********************");
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
		
		System.out.println("******************** pr02 ********************");
		int year = 0;
		int age = 14;
		System.out.println(year);
		System.out.println(age);
	
		year = age + 2000;
		age = age + 1;
		System.out.println(year);
		System.out.println(age);
		
		
		System.out.println("******************** pr03 ********************");
		int x = 10;
		int y = 20;
		int tmp = 0;
		System.out.println("x: " + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("x: " + x + " y:" + y);
		
		
		System.out.println("******************** pr04 ********************");
		System.out.println('\'');
		System.out.println("abc\t123\t456");
		System.out.println("\n");
		System.out.println("\"Hello\"");
		System.out.println("c:\\\n");
		
		
		System.out.println("******************** pr05 ********************");
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println("1번" + 7 + " ");
		System.out.println("2번" + " " + 7);
		System.out.println("3번" + "" + 7);
		System.out.println("4번" + 7 + "");
		System.out.println("5번" + "" + "");
		System.out.println("6번" + 7 + 7 + "");
		System.out.println("7번" + "" + 7 + 7);
		
		
		System.out.println("******************** pr06 ********************");
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("두자리 정수를 하나 입력해주세요>");
//		String input = scanner.nextLine();
//		int num = Integer.parseInt(input);
//		String inputstr = input;
//		
//		System.out.println("입력내용 :" + input);
//		System.out.printf("num=%d%n" ,num);
//		System.out.printf("내용=%s", inputstr);
		
//		if(num > 10) {
//			System.out.println("10넘음");
//		}
		
		
		
		
		System.out.println("******************** pr07 ********************");
		byte b = 1;
		short sh = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 1000000000;
		
		System.out.printf("b=%d%n", b);
		System.out.printf("sh=%s%n", sh);
		
		
		System.out.println("******************** pr08 ********************");
		double d = 85.4;
		int score = (int)d;
		System.out.println(score);
		System.out.println(d);
		
		
		
		System.out.println("******************** 구구단(1~9단) pr09 ********************");
		for(int m = 1; m<10; m++) {
			System.out.printf("xxxxxxxxxxx%d단xxxxxxxxxxx%n", m);
			for(int n = 1; n<10; n++) {
				System.out.printf("%d X %d = %d%n", m,n,m*n);
			}
		}
		
		
		System.out.println("******************** 구구단(3의 배수) pr10 ********************");
		for(int z = 3; z<10; z+=3) {
			System.out.printf("xxxxxxxxxxx%d단xxxxxxxxxxx%n", z);
			for(int v = 1; v<10; v++) {
				System.out.printf("%d X %d = %d%n", z,v,z*v);
			}
		}
		
		
		System.out.println("******************** 별짓기 오른쪽 pr11 ********************");
		for(int u=1;u<=10;u++) {
			for(int v=1; v<u/2; v++) {
				System.out.print(" ");
			}
			for(int z=1;z<=u;z+=2) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
