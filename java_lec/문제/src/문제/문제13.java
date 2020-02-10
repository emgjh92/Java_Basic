package 문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제13] 아래와 같이 12달의 날수를 배열를 만들어 기억시킨후 
원하는 month을 입력받아 그 달의 날수를 출력하시오

[참고]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

[입력화면/출력화면]

원하는 month을 입력하시오 : 3
3월은 31일입니다.
 */
public class 문제13 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int []month={31,28,31,30,31,30,31,31,30,31,30,31};
	
	int i=0;
	System.out.print("원하는 month을 입력하시오 : ");
	i=Integer.parseInt(br.readLine());
	
	System.out.println(i+"월은"+ month[i-1]+"일 입니다.");
	
	}
}
