package pekan6_2511533012;

public class Lagu_2511533012 {

 private String judul_3012;
 private String penyanyi_3012;

 Lagu_2511533012 next_3012;
 Lagu_2511533012 prev_3012;

 public Lagu_2511533012(String judul_3012, String penyanyi_3012) {

     this.judul_3012 = judul_3012;
     this.penyanyi_3012 = penyanyi_3012;

     this.next_3012 = null;
     this.prev_3012 = null;
 }

 public String getJudul_3012() {
     return judul_3012;
 }

 public String getPenyanyi_3012() {
     return penyanyi_3012;
 }

 public void setJudul_3012(String judul_3012) {
     this.judul_3012 = judul_3012;
 }

 public void setPenyanyi_3012(String penyanyi_3012) {
     this.penyanyi_3012 = penyanyi_3012;
 }
}
