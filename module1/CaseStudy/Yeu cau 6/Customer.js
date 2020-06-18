// noinspection UnterminatedStatementJS
let Customer = function () {
    this.setName=function (name) {
        this.name=name;
    }
    this.getName=function () {
        return this.name

    }
    this.setCMND=function (CMND) {
        this.CMND=CMND;

    }
    this.getCMND=function () {
        return this.CMND

    }
    this.setNgaySinh=function (ngaysinh){
        this.ngaysinh=ngaysinh

    }
    this.getNgaySinh=function () {
        return this.ngaysinh
    }
    this.setDiaChi=function (diaChi) {
        this.diachi=diaChi;

    }
    this.getDiachi=function () {
        return this.diachi

    }
    this.getLoaiKhachHang=function () {
        return this.loaikhachhang

    }
    this.setLoaiKhachHang=function (loaiKhachHang) {
        this.loaikhachhang=loaiKhachHang;

    }
    this.getGiamgia=function () {
        return this.giamgia

    }
    this.setGiamgia=function (giamGia) {
        this.giamgia=giamGia

    }
    this.getSoNgayThue=function () {
        return this.songaythue

    }
    this.setSoNgayThue=function (soNgayThue) {
        this.songaythue=soNgayThue;

    }
    this.getLoaiDichVu=function () {
        return this.loaidichvu

    }
    this.setLoaiDichVu=function (loaiDichVu) {
        this.loaidichvu=loaiDichVu;

    }
    this.getLoaiPhong=function () {
        return this.loaiphong

    }
    this.setLoaiPhong=function (loaiPhong) {
        this.loaiphong=loaiPhong;

    }
    this.totalPay= function () {
        let money=0;
        if (this.loaidichvu==='Villa'){
            money=500;
        }
        else if (this.loaidichvu==='House'){
            money=300;
        }
        else  if(this.loaidichvu==='Room'){
            money=200;
        }
        return this.getSoNgayThue*money*(1-this.getGiamgia/100)

    }


};