package siapa_kamu;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Dosen extends Manusia {
    private String nip, mataKuliah;

    //getter setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.printf("Saya %s umur %d tahun sedang mengajar matakuliah %s%n", nama, umur, mataKuliah);
    }

    //override method
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
