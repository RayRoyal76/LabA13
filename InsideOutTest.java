class Out {
	int r = 44;
	
	
	class In {
	int b = 43;
	
	}
}



public class InsideOutTest {

	
	
	
	
	public static void main(String[] args) {
	
		Out s = new Out();
		Out.In h = s.new In();
		
		System.out.println(s.r+"  "+h.b);

	}

}
