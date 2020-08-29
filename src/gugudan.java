import java.util.Scanner;
public class gugudan {
	public static void main(String[] args) {
		System.out.println("입력한 숫자의 곱셉이 출력 :     ");
	Scanner scanner = new Scanner(System.in);
	int fx = scanner.nextInt();
	if ( fx > 10) {
		System.out.println("2~9사이의 숫자를 입력하세요");
	}
	else if (fx < 2) {
		System.out.println("2~9사이의 숫자를 력하세요");
	}
	else 
		for (int i = 1; i < 10; i++) {
			System.out.print("사용가 입력한 숫자      ");
			System.out.println(fx + "*" + i + "=" +i*fx);
		}
	}
	}
	
