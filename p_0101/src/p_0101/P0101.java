package p_0101;

public class P0101 {



	public static char getLetrak(){
		return (char)(Math.random()*26 + 'a'); /*zebaki bat ausaz hartu eta a letrari gehitu*/
		
	}

	public static void main(String[] args) {
		System.out.println(getLetrak());/*gorako funtzoari deitu*/
		System.out.println(getLetrak());/*gorako funtzoari deitu*/
		System.out.println(getLetrak());/*gorako funtzoari deitu*/
		System.out.println(getLetrak());/*gorako funtzoari deitu*/

		int a = 'a';
		System.out.println(a);  // 'a' karakterearen Unicode balioa erakutsi
		double pi = 3.14;
		System.out.println(pi);
		byte ap = (byte) 200;    // -128tik 127rako tartea
		System.out.println(ap);
		
	}

}
