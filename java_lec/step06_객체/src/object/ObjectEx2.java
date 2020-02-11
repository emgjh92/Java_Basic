package object;

//해당 java 파일은 User.java 와 연동해서 사용한다.
public class ObjectEx2 {
	public static void main(String[] args) {
		User ob = new User();
		ob.setUser("진달래", 97,55,79);
		System.out.println(ob.getUser());
		}
	}
//이름은 진달래 이고, 총점은 231점 입니다.