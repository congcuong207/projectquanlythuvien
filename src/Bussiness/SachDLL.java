package Bussiness;

import Bussiness.Interface.ISach;
import Entities.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class SachDLL implements ISach {
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
    public void Them(ArrayList<Sach> saches) {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║                           Thêm sách                          ║");
        System.out.println("╠══════════════════════════════════════════════════════════════╬");
        System.out.print("║         Nhập mã sách: ");
        String masach=Rangbuocstring();
        System.out.print("║         Nhập tên sách: ");
        String tensach=Rangbuocstring();
        System.out.print("║         Nhâp tên tác giả: ");
        String tentg=Rangbuocstring();
        System.out.print("║         Nhập nhà xuất bản: ");
        String nxb=Rangbuocstring();
        System.out.print("║         Nhập ngày sản xuất: ");
        String ngaysx=Rangbuocstring();
        System.out.print("║         Nhập số lượng sách: ");
        int soluong=Rangbuocint();
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        Sach s= new Sach(masach,tensach,tentg,nxb,ngaysx,soluong);
        saches.add(s);
    }
    public void Hien1sach(Sach s)
    {
        System.out.printf("║%10s║%20s║%25s║%20s║%20s║%15s║\n",s.getMaSach(),s.getTenSach(),s.getTenTg(),s.getNhaXb(),s.getNgaySx(),s.getSoLuong());
    }

    @Override
    public void Hien(ArrayList<Sach> saches) {
        System.out.println("╔══════════╦════════════════════╦═════════════════════════╦════════════════════╦════════════════════╦═══════════════╗");
        System.out.printf("║%10s║%20s║%25s║%20s║%20s║%15s║\n","Mã sách","Tên sách","Tên tác giả","Nhà xuất bản","Ngày sản xuất","Số lượng");
        System.out.println("╠══════════╬════════════════════╬═════════════════════════╬════════════════════╬════════════════════╬═══════════════║");
        for (Sach s:
             saches) {
            Hien1sach(s);}
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }

    @Override
    public void Sua(ArrayList<Sach> saches, String ma) {
        for (Sach s:
             saches) {
            if(s.getMaSach().equalsIgnoreCase(ma))
            {
                System.out.println("╔══════════════════════════════════════════════════════════════╗");
                System.out.println("║                           Thêm sách                          ║");
                System.out.println("╠══════════════════════════════════════════════════════════════╬");
                System.out.print("║         Sửa mã sách: ");
                s.setMaSach(sc.nextLine());
                System.out.print("║         Sửa tên sách: ");
                s.setTenSach(sc.nextLine());
                System.out.print("║         Sửa tên tác giả: ");
                s.setTenTg(sc.nextLine());
                System.out.print("║         Sửa nhà xuất bản: ");
                s.setNhaXb(sc.nextLine());
                System.out.print("║         Sửa ngày sản xuất: ");
                s.setNgaySx(sc.nextLine());
                System.out.print("║         Sửa số lượng sách: ");
                s.setSoLuong(Integer.parseInt(sc.nextLine()));
                System.out.println("╚══════════════════════════════════════════════════════════════╝");
            }
        }
    }

    @Override
    public void Tim(ArrayList<Sach> saches, String ma) {
        boolean kt=false;
        System.out.println("╔══════════╦════════════════════╦═════════════════════════╦════════════════════╦════════════════════╦═══════════════╗");
        System.out.printf("║%10s║%20s║%25s║%20s║%20s║%15s║\n","Mã sách","Tên sách","Tên tác giả","Nhà xuất bản","Ngày sản xuất","Số lượng");
        System.out.println("╠══════════╬════════════════════╬═════════════════════════╬════════════════════╬════════════════════╬═══════════════╬");
        for (Sach s:
             saches) {
            if(ma.equalsIgnoreCase(s.getMaSach())||s.getTenSach().toUpperCase().indexOf(ma.toUpperCase())>=0)
            {
                kt=true;
                Hien1sach(s);
            }
        }
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        if(!kt)
        {
            System.out.println("Không có sách hoặc mã sách cần tìm");
        }
    }

    @Override
    public void Xoa(ArrayList<Sach> saches, String ma) {
        boolean kt=false;
        for (int i=0;i<saches.size();i++)
        {
            if (saches.get(i).getMaSach().equalsIgnoreCase(ma))
            {
                kt=true;
                saches.remove(i);
            }
        }
        if(kt)
        {
            System.out.println("Xóa thành công");
        }
    }
}
