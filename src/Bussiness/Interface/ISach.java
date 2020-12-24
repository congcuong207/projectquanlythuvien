package Bussiness.Interface;

import Entities.Sach;

import java.util.ArrayList;

public interface ISach {
    void Them(ArrayList<Sach> saches);
    void Hien(ArrayList<Sach> saches);
    void Sua(ArrayList<Sach> saches,String ma);
    void Tim(ArrayList<Sach> saches,String ma);
    void Xoa(ArrayList<Sach> saches,String ma);
}
