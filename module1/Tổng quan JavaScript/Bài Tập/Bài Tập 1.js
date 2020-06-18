function diemTb() {
    let diemHoa = parseInt(document.getElementById('hoaHoc').value);
    let diemLy = parseInt(document.getElementById('vatLy').value);
    let diemSinh = parseInt(document.getElementById('sinhHoc').value);

    let tb =(diemHoa + diemLy + diemSinh);
alert('Điểm trung bình của bạn là :'+ tb);
}

