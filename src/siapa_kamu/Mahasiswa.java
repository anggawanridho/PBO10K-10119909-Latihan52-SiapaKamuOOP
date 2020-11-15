package siapa_kamu;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Mahasiswa extends Manusia {
    public String nim, kelas;

    //getter setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.printf("Saya %s umur %d tahun sedang belajar di kelas %s%n", nama, umur, kelas);
    }

    //override method
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}