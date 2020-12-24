package Entities;

public class Nguoi {
    private String maThe;
    private String hoTen;
    private String maLop;
    private String maSach;
    private String ngayMuon;
    private String ngayTra;
    private int soLuong;

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Nguoi(String maThe, String hoTen, String maLop, String maSach, String ngayMuon, String ngayTra, int soLuong) {
        this.maThe = maThe;
        this.hoTen = hoTen;
        this.maLop = maLop;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return maThe+"#"+hoTen+"#"+maLop+"#"+maSach+"#"+ngayMuon+"#"+ngayTra+"#"+soLuong+"\n";
    }
}
