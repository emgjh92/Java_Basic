package animal;

import java.util.Scanner;

// 동적바인팅 : 런타임에 호출 함수를 결정,
// 장점 : 코딩 양이 적어짐
// 단점 : 정적바인딩에 비해 속도가 느림

public class AnimalMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Animal ani=null;
		//Dog dd=null; Cat cc=null; Fish ff=null; Duck dk=null;
		
		while(true) {
			System.out.print("1.Dog 2.Cat 3.Fish 4.Duck 5.Exit \n선택:");
			n=sc.nextInt();
			switch(n) {
			case 1:ani=new Dog(); break;
			case 2:ani=new Cat(); break;
			case 3:ani=new Fish(); break;
			case 4:ani=new Duck(); break;			
			default:System.out.println("***종료합니다***");
			//부모 클래스의 참조변수로 자식객체 생성
				sc.close();
				System.exit(0);
			}
			ani.speak();
			ani.walk();
		}
	}
}
