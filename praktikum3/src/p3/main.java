
package p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class main 
{
    public static void main(String[] args) throws IOException
    {
        String fileName="D:/copy.txt";
        String fileBaru="D:/paste.txt";
        ArrayList<participant> data=new ArrayList<participant>();
        Serialize s=new Serialize();
        ArrayList<participant> newList=null;
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(;;)
        {
            System.out.println("---------Menu---------");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Save Data");
            System.out.println("5. Show Data");
            System.out.println("6. Quit");
            System.out.println("Choice : ");
            
            int choice=Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                    System.out.println("Enter NIM : ");
                    int a=Integer.parseInt(br.readLine());
                    System.out.println("Enter Nama : ");
                    String b=br.readLine();
                    System.out.println("Enter Asal : ");
                    String c=br.readLine();
                    System.out.println("Enter Kelas : ");
                    String d=br.readLine();
                    data.add(new participant(a,b,c,d));
                    s.serialize(data, fileName);
                    break;
                case 2:
                    System.out.println("Menampilkan data ");
                    newList=(ArrayList<participant>) s.print(fileName);
                    System.out.println("List Data : "+newList);
                    System.out.println("Pilih Index Data yang akan Diganti : ");
                    int PilihIndex=Integer.parseInt(br.readLine());
                    System.out.println("Pilih Item Data yang akan diganti");
                    int PilihItem=Integer.parseInt(br.readLine());
                    if(PilihItem==0)
                    {
                        System.out.println("Ubah NIM : ");
                        a=Integer.parseInt(br.readLine());
                        data.get(PilihIndex).setNim(a);
                    }
                    else if(PilihItem==1)
                    {
                        System.out.println("Ubah Nama : ");
                        b=br.readLine();
                        data.get(PilihIndex).setNama(b);
                    }
                    else if(PilihItem==2)
                    {
                        System.out.println("Ubah Asal : ");
                        c=br.readLine();
                        data.get(PilihIndex).setAsal(c);
                    }
                    else if(PilihItem==3)
                    {
                        System.out.println("Ubah Kelas : ");
                        d=br.readLine();
                        data.get(PilihIndex).setKelas(d);
                    }
                    s.serialize(data, fileName);
                    break;
                case 3:
                    System.out.println("Menampilkan Data ");
                    newList=(ArrayList<participant>) s.print(fileName);
                    System.out.println("List Data : "+newList);
                    System.out.println("Pilih Index Data yang akan Dihapus : ");
                    PilihIndex=Integer.parseInt(br.readLine());
                    data.remove(PilihIndex);
                    s.serialize(data, fileName);
                    break;
                case 4:
                    s.save(data, fileBaru);
                    System.out.println("Data disimpan di "+fileBaru);
                    break;
                case 5:
                    newList=s.print(fileName);
                    System.out.println("List Data : "+newList);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
    
}
