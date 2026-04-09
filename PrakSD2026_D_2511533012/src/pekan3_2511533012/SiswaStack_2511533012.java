package pekan3_2511533012;

import java.util.ArrayList;

class Siswa_2511533012 {
	String nama_3012;
	int nim_3012;
	
	public Siswa_2511533012(String nama_3012, int nim_3012) {
		this.nama_3012 = nama_3012;
		this.nim_3012 = nim_3012;
	}
	
	@Override
	public String toString() {
		return "Nim : " + nim_3012 + ", Nama : " + nama_3012;
	}
}

public class SiswaStack_2511533012 {
	private ArrayList<Siswa_2511533012> stack;
	
	public SiswaStack_2511533012() {
		stack = new ArrayList<>();
	}
	
	public void push_3012(Siswa_2511533012 mhs) {
		stack.add(mhs);
	}
	
	public Siswa_2511533012 pop_3012() {
		if(!isEmpty_3012()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}
	
	public Siswa_2511533012 peek_3012() {
		if (!isEmpty_3012()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty_3012() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_3012() {
		for (int i_3012 = stack.size() -1; i_3012 >= 0; i_3012--) {
			System.out.println(stack.get(i_3012));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SiswaStack_2511533012 StudentStack = new SiswaStack_2511533012();
		
		Siswa_2511533012 mhs1 = new Siswa_2511533012 ("Ali", 1);
		Siswa_2511533012 mhs2 = new Siswa_2511533012 ("Boby", 2);
		Siswa_2511533012 mhs3 = new Siswa_2511533012 ("Charles", 3);
		
		StudentStack.push_3012(mhs1);
		StudentStack.push_3012(mhs2);
		StudentStack.push_3012(mhs3);
		
		System.out.println("Siswa di dalam stack : ");
		StudentStack.tampilkanSiswa_3012();
		
		System.out.println("Siswa Teratas " + StudentStack.peek_3012());
		System.out.println("Mengeluarkan siswa teratas dari stack : " + StudentStack.pop_3012());
		System.out.println("Daftar siswa setelah di pop : ");
		StudentStack.tampilkanSiswa_3012();
	}

}
