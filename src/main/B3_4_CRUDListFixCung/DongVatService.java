/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B3_4_CRUDListFixCung;

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
}
