
package p3;

import java.io.Serializable;


public class participant implements Serializable
{
    private int nim;
    private String nama;
    private String asal;
    private String kelas;

    public participant(int nim, String nama, String asal, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
        this.kelas = kelas;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public String toString() {
        return nim+" | "+nama+" | "+asal+" | "+kelas;
    }
}
