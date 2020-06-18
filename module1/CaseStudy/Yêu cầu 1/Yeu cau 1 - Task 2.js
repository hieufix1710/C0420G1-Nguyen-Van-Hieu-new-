

if (loaiDichVu=='Villa'){
    if (diaChi=='Đà Nẵng')
        if (soNgayThue>7)
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-30
        else if (5 <soNgayThue<7 )
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-20
        else if (2<soNgayThue<4)
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-10
    else if (diaChi=='Huế')
        if (soNgayThue>7)
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-30
        else if (5 <soNgayThue<7 )
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-20
        else if (2<soNgayThue<4)
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-10
    else if (diaChi=='Quảng Nam')
        if (soNgayThue>7)
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-30
        else if (5 <soNgayThue<7 )
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-20
        else if (2<soNgayThue<4)
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-10
}

else if (loaiDichVu=='House'){
    if (diaChi=='Đà Nẵng')
        if (soNgayThue>7)
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-30
        else if (5 <soNgayThue<7 )
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-20
        else if (2<soNgayThue<4)
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-10
    else if (diaChi=='Huế')
        if (soNgayThue>7)
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-30
        else if (5 <soNgayThue<7 )
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-20
        else if (2<soNgayThue<4)
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-10
    else if (diaChi=='Quảng Nam')
        if (soNgayThue>7)
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-30
        else if (5 <soNgayThue<7 )
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-20
        else if (2<soNgayThue<4)
                tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-10
}
else if (loaiDichVu=='Room'){
    if (diaChi=='Đà Nẵng')
        if (soNgayThue>7)
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-30
        else if (5 <soNgayThue<7 )
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-20
        else if (2<soNgayThue<4)
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-10
    if (diaChi=='Huế')
        if (soNgayThue>7)
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-30
        else if (5 <soNgayThue<7 )
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-20
        else if (2<soNgayThue<4)
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-10
    if (diaChi=='Quảng Nam')
            if (soNgayThue>7)
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-30
        else if (5 <soNgayThue<7 )
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-20
        else if (2<soNgayThue<4)
            tongTien=((500-20)*soNgayThue*(1-(giamGia/100)))-10
}

alert('Tên Khách Hàng: '+ten +
    '\n CMND: '+CMND+
    '\nNgày sinh :'+ngaySinh+
    '\nĐịa Chỉ :'+diaChi+
    '\nLoại Khách Hàng :'+loaiKhachHang+
    '\nGiảm giá :' + ''+giamGia+'' +
    '\nSố ngày thuê :' +''+soNgayThue+'' +
    '\nLoại dịch vụ :'+loaiDichVu+'' +
    '\nLoại phòng :'+loaiPhong+
    '\nTổng tiền : '+tongTien);