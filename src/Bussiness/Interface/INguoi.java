package Bussiness.Interface;

import Entities.Nguoi;

import java.util.ArrayList;

public interface INguoi {
    void Them(ArrayList<Nguoi> nguois);
    void Hien(ArrayList<Nguoi> nguois);
    void Tim(ArrayList<Nguoi> nguois,String ma);
    void Xoa(ArrayList<Nguoi> nguois,String ma);
    void Sua(ArrayList<Nguoi> nguois,String ma);
    void Tra(ArrayList<Nguoi> nguois,String ma,String masach);
    void Thongke(ArrayList<Nguoi> nguois);
}
