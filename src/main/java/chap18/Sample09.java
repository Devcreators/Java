package chap18;

public class Sample09 {

	public static void main(String[] args) {
		try {
			excute();
		} catch (Exception e) {
			System.out.println(e.getMessage() + " in Main method");
		}
	}
	
	public static void excute() throws Exception {
		throw new Exception("throw로 오류를 강제로 위임시겼습니다.");
	}
}
