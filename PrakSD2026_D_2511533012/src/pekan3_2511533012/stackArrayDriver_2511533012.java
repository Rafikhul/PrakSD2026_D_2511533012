package pekan3_2511533012;

public class stackArrayDriver_2511533012 {
	public static void main (String[] args) {
		
	stackArray_2511533012 s = new stackArray_2511533012();
	s.push_3012(10);
	s.push_3012(20);
	s.push_3012(30);
	System.out.println(s.pop_3012() + " dikeluarkan dari stack");
	System.out.println("Eleman teratas adalah : " + s.peek_3012());
	System.out.println("Elemen pada stack : ");
	s.print_3012();
	}
}
