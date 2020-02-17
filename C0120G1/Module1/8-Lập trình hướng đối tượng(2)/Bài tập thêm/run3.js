let danhSachCanBo = [];


function hienThiDanhSach() {
    let nhapthongtin = prompt("1.Thêm thông tin cán bộ" +
        "\n2.Hiển thị danh sách cán bộ" +
        "\n3.Hiển thị danh sách cán bộ được tăng lương" +
        "\n4.Hiển thị số lượng cán bộ nữ" +
        "\n5.Hiển thị cán bộ có chuyên môn về CNTT");
        switch(nhapthongtin){
            case "1":
                themCanBo();
                break;
            case "2":
                hienThiCanBo();
                break;
            case "3":
                hienThiCanBoTangLuong();
                break;
            case "4":
                hienThiCanBoNu();
                break;
            case "5":
                hienThiCanBoCNTT();
                break;
            default:
                alert("nhập lỗi");
                hienThiDanhSach();
        }
}
function themCanBo() {
    let canbo=new CanBo();
    canbo.setTen(prompt("nhập thông tin tên"));
    canbo.setGioiTinh(prompt("nhập thông tin giới tính"));
    canbo.setQueQuan(prompt("nhập thông tin quê quán"));
    canbo.setNamSinh(prompt("nhập thông tin năm sinh"));
    canbo.setTrinhDo(prompt("nhập thông tin trình độ"));
    canbo.setHeSoLuong(prompt("nhập thông tin hệ số lương"));
    canbo.setPhuCap(prompt("nhập thông tin phụ cấp"));
    danhSachCanBo.push(canbo);
    hienThiDanhSach()
}
function hienThiCanBo() {
    let ketqua = "Danh sách cán bộ:";
    for (let i = 0; i < danhSachCanBo.length; i++) {
        ketqua+="\n"+(i+1)+"."+danhSachCanBo[i].getTen();
    }
    ketqua+= "\n" + (danhSachCanBo.length+1) + "." + "Quay về hiển thị chính";
    let chon = prompt(ketqua);
    if (chon != (danhSachCanBo.length + 1)) {
        hienThiDanhSachCanBo()
    }else{
        hienThiDanhSach();
    }
}
hienThiDanhSach();