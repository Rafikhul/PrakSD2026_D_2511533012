package Pekan5_2511533012;

class Pasien_2511533012 {
    private String namaPasien_3012;
    private String penyakit_3012;
    private int nomorAntrian_3012;
    private Pasien_2511533012 next_3012;

    public Pasien_2511533012(String namaPasien_3012, String penyakit_3012, int nomorAntrian_3012) {
        this.namaPasien_3012 = namaPasien_3012;
        this.penyakit_3012 = penyakit_3012;
        this.nomorAntrian_3012 = nomorAntrian_3012;
        this.next_3012 = null;
    }

    public String getNamaPasien_3012() {
        return namaPasien_3012;
    }

    public String getPenyakit_3012() {
        return penyakit_3012;
    }

    public int getNomorAntrian_3012() {
        return nomorAntrian_3012;
    }

    public Pasien_2511533012 getNext_3012() {
        return next_3012;
    }

    // Setter
    public void setNamaPasien_3012(String namaPasien_3012) {
        this.namaPasien_3012 = namaPasien_3012;
    }

    public void setPenyakit_3012(String penyakit_3012) {
        this.penyakit_3012 = penyakit_3012;
    }

    public void setNomorAntrian_3012(int nomorAntrian_3012) {
        this.nomorAntrian_3012 = nomorAntrian_3012;
    }

    public void setNext_3012(Pasien_2511533012 next_3012) {
        this.next_3012 = next_3012;
    }
}