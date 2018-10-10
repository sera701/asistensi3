
package tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Aplikasi {
    private String nim, nama, asal, kelas; 
    
    public static void main(String[] args) {
        Aplikasi app = new Aplikasi();
        List<Mahasiswa> Mahasiswa = new ArrayList<Mahasiswa>();
        app.mainApp( Mahasiswa, 0);
        System.out.println(Mahasiswa);
        Simpan ss = new Simpan();
        ss.serialize(Mahasiswa, "E://infoData.ser");
    }
    
    public void mainApp( List<Mahasiswa> Mahasiswa, int index )
    {
        
        try {
            InputStream input = System.in;
            InputStreamReader reader = new InputStreamReader(input);
            
            System.out.println("pilih aksi \n"
                    + "1. insert \n"
                    + "2. edit \n"
                    + "3. hapus \n"
                    + "4. keluar");
            BufferedReader bf = new BufferedReader(reader);
            String option = bf.readLine();
            if(option.equals("1"))
            {
                modify();
                Mahasiswa.add(new Mahasiswa(nim, nama, asal, kelas));
            }
            else if(option.equals("4"))
            {
                return;
            }
            else
            {
                System.out.print("Index data: ");
                BufferedReader bfedit = new BufferedReader(reader);
                int ind = Integer.parseInt(bfedit.readLine());
                
                if(option.equals("2"))
                {
                    modify();
                    Mahasiswa.set(ind, new Mahasiswa(nim, nama, asal, kelas));
                }else
                {
                    Mahasiswa.remove(ind);
                }
                
            }
            mainApp(Mahasiswa, index+1);
                } catch (IOException ex) {
            
        }
    }
    
    public void modify()
    {
        try {
            InputStream input = System.in;
            InputStreamReader reader = new InputStreamReader(input);
            
            System.out.print("nim: ");
            BufferedReader bfNim = new BufferedReader(reader);
            this.nim = bfNim.readLine();
            System.out.print("nama: ");
            BufferedReader bfNama = new BufferedReader(reader);
            this.nama = bfNama.readLine();
            System.out.print("asal: ");
            BufferedReader bfAsal = new BufferedReader(reader);
            this.asal = bfAsal.readLine();
            System.out.print("kelas: ");
            BufferedReader bfKelas = new BufferedReader(reader);
            this.kelas = bfKelas.readLine();
            System.out.println("");
            
        } catch (IOException ex) {
            
        }
        
    }
}
