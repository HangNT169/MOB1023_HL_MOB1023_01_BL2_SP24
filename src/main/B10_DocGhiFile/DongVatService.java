/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B10_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class DongVatService {

    private List<DongVat> listDongVat = new ArrayList<>();

    public DongVatService() {
        // fake dataa trong contructor 
        listDongVat.add(new DongVat("DV01", "Meo", 10, true));
        listDongVat.add(new DongVat("DV02", "Meo1", 11, false));
        listDongVat.add(new DongVat("DV03", "Meo2", 13, true));
        listDongVat.add(new DongVat("DV04", "Meo3", 15, false));
        listDongVat.add(new DongVat("DV05", "Meo4", 17, false));
    }

    public List<DongVat> getAll() {
        return listDongVat;
    }

    public void add(DongVat dv) {
        listDongVat.add(dv);
    }

    public void xoa(int index) {
        listDongVat.remove(index);
    }
    
    public void update(DongVat newDongVat, int index){
        listDongVat.set(index, newDongVat);
    }
    
    public String ghiFile(String path){
        try {
            // B1: Tao ra file 
            File f = new File(path);
            // B2: Kiem tra su ton tai cua file 
            if(f.exists() == false){
                // chua ton tai file => Tao file moi 
                f.createNewFile();
            }
            // B3: Ghi vao file => OUTPUTSTREAM 
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (DongVat dongVat : listDongVat) {
                // Viet vao file
                oos.writeObject(dongVat);
            }
            // B4: Dong close file 
            oos.close();
            fos.close();
            return "Ghi file thanh cong";
        } catch (Exception e) {
            // Khi xay ra loi
            return "Ghi file that bai";
        }
    }
    
     public String docFile(String path){
        try {
            // B1: Tao ra file 
            File f = new File(path);
            // B2: Kiem tra su ton tai cua file 
            if(f.exists() == false){
               return "File chua ton tai";
            }
            // B3: Doc vao file => INPUTSTREAM 
            FileInputStream fis = new FileInputStream(f); // Dung de mo file
            ObjectInputStream ois = new ObjectInputStream(fis);// Doc du lieu trong file
            // B4: Kiem tra du lieu de doc file ra 
            while(fis.available() > 0){ // Kiem tra xem con dong de doc hay khong
                listDongVat.add((DongVat) ois.readObject());
            }
            // B5: Dong close file 
            ois.close();
            fis.close();
            return "Doc file thanh cong";
        } catch (Exception e) {
            // Khi xay ra loi
            return "Doc file that bai";
        }
    }
     
}
