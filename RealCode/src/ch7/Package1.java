package ch7;

public class Package1 {
	public static void main(String[] args) {
		// 3.1 패키지
		// 같은 이름의 클래스라도 서로 다른 패키지에 있으면 충돌 X
		// 자주 사용하는 System클래스 역시 java.lang패키지에 속해있음. 
		// 정확히는 java패키지의 lang패키지의 System클래스 
		// 우리가 예전에 scanner클래스 사용할 때 java.util.*했었던거 기억
		
		// 3.2 패키지의 선언
		// 소스파일 첫 번째 문장으로 단 한번 선언
		// 하나의 소스파일에 잇는 클래스나 인터페이스는 모두 같은 패키지에 속하는 것
		// 패키지 선언을 안하면 unnamed패키지에 자동으로 속함
		
		// 3.3 클래스패스 설정
		// 원래는 메모장같은 곳에 써서 jdk 하위 폴더에 만들어서 cmd창에서 컴파일 및 실행
		// 이러면 classpath없이도 알아서 class를 찾는다. 현재폴더에 대한 classpath는 자동생성이므로
		// 그러나 새로운 패키지를 만들게 되면, 그 상위 폴더의 루트를 classpath에 저장해야 class파일을 찾을 수 있음.
		// 그러면 현재폴더 경로가 자동생성이 안되므로, .도 함께 추가해줘야 함. 
		// path에 jdk\bin 설정한 이유는 OS가 파일의 위치를 파악하기 위함. 
		
		// 저 디렉토리안에 있는 애들은 classpath 설정 필요치 않음.
		
		// 3.4 import문
		// 사용할 클래스가 속한 패키지 지정 시 사용 -> 매번 패키지 명을 붙일 필요가 없어짐.
		// ctrl+shift+o 누르면 알아서 추가
		
		// 3.5 선언
		// import 패키지면.* -> 패키지에 속한 클래스 전부 사용가능
		// But 패키지안 패키지안 클래스를 쓸 수 있는 것은 아님!!!!!
		// 이름이 같으면 패키지명을 붙여줘야 함!!!!!
		// System이나 String클래스는 java.lang패키지에 있는 것!!
		// 빈번하게 사용되는 패키지라 묵시적으로 선언되어 있음 이미
		
		// 3.6 static import문
		// 패키지 하위의 클래스의 static멤버들을 호출할 때 클래스이름까지 생략가능
		
	}
}
