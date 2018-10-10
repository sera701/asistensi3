
package tugas3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;


public class Simpan {
    public void serialize(List<Mahasiswa> pList, String fileName)
    {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(pList);
         } catch (IOException e) {
             System.out.println("gagal serialize "+e);
        }
    }
}
