
package p3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Serialize 
{
    public void serialize(ArrayList<participant> L, String fileName)
    {
        try 
        {
             ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName));
             out.writeObject(L);
        } 
        catch (IOException e) 
        {
            System.out.println("error pada "+e.getMessage());
        }
    }
    
    public void save(ArrayList<participant> L, String fileBaru)
    {
        try 
        {
            FileOutputStream fos=new FileOutputStream(fileBaru);
            String v=String.valueOf(L);
            for(int i=0;i<v.length();i++)
            {
                fos.write(v.charAt(i));
            }
        } 
        catch (IOException e) 
        {
            System.out.println("error save = "+e.getMessage());
        }
        
    }
    
    public ArrayList<participant> print(String fileName)
    {
        List<participant> p=null;
        try 
        {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName));
            p=(List<participant>) in.readObject();
        } 
        catch (IOException | ClassNotFoundException ex) 
        {
            System.out.printf("problem data ",fileName);
            System.out.println(ex.getMessage());
        }
        return (ArrayList<participant>) p;
    }
}
