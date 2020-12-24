package Bussiness;

import Bussiness.Interface.INguoi;
import Entities.Nguoi;

import java.util.ArrayList;
import java.util.Scanner;

public class NguoiDLL implements INguoi {
    public Scanner sc=new Scanner(System.in);
    public String Rangbuocstring()
    {
        String rb;
        do {
            rb=sc.nextLine();
            if(!(rb.equalsIgnoreCase("")))
            {
                break;
            }
            else {
                System.out.print("╠═════════════════════════════Mời nhập lại═════════════════════════════════╬");
            }
        }while (true);
        return rb;
    }
    public int Rangbuocint()
    {
        int so;
        do {
            try {
                so=Integer.parseInt(sc.nextLine());
                if(so>=0)
                {
                    break;
                }
            }catch (Exception exception){
                System.out.println("╠════════════════Bạn nhập k phải là số nguyên mời nhập lại═══════════╬");
            }
        }while (true);
        return so;
    }
    @Override
    public void Them(ArrayList<Nguoi> nguois) {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║                      Thêm người mượn                         ║");
        System.out.println("╠══════════════════════════════════════════════════════════════╬");
        System.out.print("║         Nhập mã thẻ đọc: ");
        String mathe=Rangbuocstring();
        System.out.print("║         Nhập tên người mượn: ");
        String hoten=Rangbuocstring();
        System.out.print("║         Nhập tên lớp: ");
        String tenlop=Rangbuocstring();
        System.out.print("║         Nhập mã sách mượn: ");
        String masach=Rangbuocstring();
        System.out.print("║         Nhập ngày mượn: ");
        String ngaymuon=Rangbuocstring();
        String ngaytra=" ";
        System.out.print("║         Nhập số lượng: ");
        int soluong=Rangbuocint();
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        Nguoi ng=new Nguoi(mathe,hoten,tenlop,masach,ngaymuon,ngaytra,soluong);
        nguois.add(ng);
    }
    public void Hien1nguoi(Nguoi ng)
    {

        System.out.printf("║%10s║%25s║%15s║%10s║%15s║%15s║%15s║\n",ng.getMaThe(),ng.getHoTen(),ng.getMaLop(),ng.getMaSach(),ng.getNgayMuon(),ng.getNgayTra(),ng.getSoLuong());
    }
    @Override
    public void Hien(ArrayList<Nguoi> nguois) {
        System.out.println("╔══════════╦═════════════════════════╦═══════════════╦══════════╦═══════════════╦═══════════════╦═══════════════╗");
        System.out.printf("║%10s║%25s║%15s║%10s║%15s║%15s║%15s║\n","Mã thẻ","Họ tên","Lớp","Mã sách","Ngày mượn","Ngày trả","Số lượng");
        System.out.println("╠══════════╬═════════════════════════╬═══════════════╬══════════╬═══════════════╬═══════════════╬═══════════════║");
        for (Nguoi ng:
             nguois) {
            Hien1nguoi(ng);
        }
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

    }

    @Override
    public void Tim(ArrayList<Nguoi> nguois, String ma) {
        System.out.println("╔══════════╦═════════════════════════╦═══════════════╦══════════╦═══════════════╦═══════════════╦═══════════════╗");
        System.out.printf("║%10s║%25s║%15s║%10s║%15s║%15s║%15s║\n","Mã thẻ","Họ tên","Lớp","Mã sách","Ngày mượn","Ngày trả","Số lượng");
        System.out.println("╠══════════╬═════════════════════════╬═══════════════╬══════════╬═══════════════╬═══════════════╬═══════════════║");
        for (Nguoi ng:
             nguois) {
            if(ng.getMaThe().equalsIgnoreCase(ma)||ng.getHoTen().toUpperCase().indexOf(ma.toUpperCase())>=0)
            {
                Hien1nguoi(ng);
            }
        }
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }

    @Override
    public void Xoa(ArrayList<Nguoi> nguois, String ma) {
        boolean kt=false;
        for (int i=0;i<nguois.size();i++)
        {
            if(nguois.get(i).getMaThe().equalsIgnoreCase(ma))
            {
                nguois.remove(i);
                kt=true;
                break;
            }
        }
        if(kt)
        {
            System.out.println("Xóa thành công");
        }
    }

    @Override
    public void Sua(ArrayList<Nguoi> nguois, String ma) {
        for (Nguoi ng:
             nguois) {
            if(ng.getMaThe().equalsIgnoreCase(ma))
            {
                System.out.println("╔══════════════════════════════════════════════════════════════╗");
                System.out.println("║                         Sửa người mượn                       ║");
                System.out.println("╠══════════════════════════════════════════════════════════════╬");
                System.out.print("║         Sửa mã thẻ: ");
                ng.setMaThe(sc.nextLine());
                System.out.print("║         Sửa họ tên: ");
                ng.setHoTen(sc.nextLine());
                System.out.print("║         Sửa mã lớp: ");
                ng.setMaLop(sc.nextLine());
                System.out.println("╚══════════════════════════════════════════════════════════════╝");
            }
        }
    }

    @Override
    public void Tra(ArrayList<Nguoi> nguois, String ma,String masach) {
        boolean kt=false;
        for (Nguoi ng:
             nguois) {
            if(ng.getMaThe().equalsIgnoreCase(ma)&&ng.getMaSach().equalsIgnoreCase(masach))
            {
                kt=true;
                System.out.print("Nhập ngày trả: ");
                ng.setNgayTra(sc.nextLine());
            }
        }
        if(kt)
        {
            System.out.println("Trả sách thành công");
        }
    }

    @Override
    public void Thongke(ArrayList<Nguoi> nguois) {
        int dem=0;
        System.out.println("╔══════════╦═════════════════════════╦═══════════════╦══════════╦═══════════════╦═══════════════╦═══════════════╗");
        System.out.printf("║%10s║%25s║%15s║%10s║%15s║%15s║%15s║\n","Mã thẻ","Họ tên","Lớp","Mã sách","Ngày mượn","Ngày trả","Số lượng");
        System.out.println("╠══════════╬═════════════════════════╬═══════════════╬══════════╬═══════════════╬═══════════════╬═══════════════║");
        for (Nguoi ng:
             nguois) {
            if(ng.getNgayTra().equalsIgnoreCase(" "))
            {
                Hien1nguoi(ng);
                dem++;
            }
        }
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("Có "+dem+" người chưa trả sách");
    }
}
