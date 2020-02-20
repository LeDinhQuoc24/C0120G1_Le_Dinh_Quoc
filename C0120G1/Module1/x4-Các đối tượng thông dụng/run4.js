let listNhanVien = [];
let validateEmail=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;




function hienThiDanhSach() {
    let chon=prompt("Lựa chọn tính năng"+
    "\n1.Login" +
        "\n2.Register"+
    "\n3.Hiển thị"+
    "\n4.Thoát");
    switch (chon) {
        case "1":
            dangNhap();
            break;
        case "2":
            dangKy();
            break;
        case "3":
            hienThi();
            break;
        case "4":
            thoat();
            break;
        case "5":
            alert("vui lòng nhập 1-3 để chọn tính năng");
            hienThiDanhSach();
    }
}
function dangKy() {
    let nhanvien = new Employee();
    let checkEmail=false;
    nhanvien.setTenDangNhap(prompt("nhập tên đăng nhập"));
    nhanvien.setTenNhanVien(prompt("nhập vào tên nhân viên"));
    nhanvien.setMatKhau(prompt("nhập vào mật khẩu"));
    nhanvien.setNgaySinh(prompt ("nhập vào ngày sinh"));
    nhanvien.setSoCMND(prompt("nhập vào số CMND"));
    nhanvien.setGioiTinh(prompt("nhập vào giới tính"));
    nhanvien.setDiaChi(prompt("nhập vào địa chỉ"));
    nhanvien.setSoDienThoai(prompt("nhập vào số điện thoại"));
    do {
        nhanvien.setEmail(prompt("nhập vào địa chỉ Email"));
        if (validateEmail.test(nhanvien.getEmail())) {
            checkEmail = true;
        } else {
            alert("Nhập địa chỉ email không hợp lệ");
        }
    }while (!checkEmail);

    listNhanVien.push(nhanvien);


    hienThiDanhSach();
}
function hienThi() {
    let ketqua = "";
    for (let i = 0; i < listNhanVien.length; i++) {
        ketqua+="\n"+(i+1)+"."+"Tên nhân viên "+listNhanVien[i].getTenNhanVien()+
            ";CMND: "+listNhanVien[i].getSoCMND();
    }
    ketqua += "\n" + (listNhanVien.length + 1) + " .Quay lại giao diện";
    let chonHienThi = prompt(ketqua);
    if (chonHienThi.toString() !== (listNhanVien.length + 1).toString()) {
        hienThiNhanVienCuThe(Number.parseInt(chonHienThi)-1);

    }else{
        hienThiDanhSach();
    }
}
function hienThiNhanVienCuThe(index) {
    alert("Tên đăng nhập " +listNhanVien[index].getTenDangNhap()+
        "\nTên nhân viên "+listNhanVien[index].getTenNhanVien()+
    "\nMật khẩu "+listNhanVien[index].getMatKhau()+
    "\nNgày sinh "+listNhanVien[index].getNgaySinh()+
"\nSố CMND "+listNhanVien[index].getSoCMND()+
    "\nGiới Tính "+listNhanVien[index].getGioiTinh()+
    "\nĐịa chỉ "+listNhanVien[index].getDiaChi()+
    "\nSố điện thoai "+listNhanVien[index].getSoDienThoai()+
    "\nEmail "+listNhanVien[index].getEmail());
}
function thoat() {
    alert("cảm ơn bạn đã sử dụng dịch vụ");
}
function dangNhap() {
    let nhapID = prompt("nhập vào tên đăng nhập");
    let nhapMatKhau = prompt("nhập vào mật khẩu");
    for (let i = 0; i < listNhanVien.length; i++) {
        if((listNhanVien[i].getTenDangNhap()===nhapID)&&(listNhanVien[i].getMatKhau()===nhapMatKhau)){
    alert("nhập  đúng");
         }else{
            alert("nhập sai")
            dangNhap();
        }
    }
    alert("làm không kịp");
}

hienThiDanhSach();


