let danhSachCanBo = [];

function hienThiDanhSach() {
    let nhapthongtin = prompt("1.Thêm thông tin cán bộ" +
        "\n2.Hiển thị danh sách cán bộ" +
        "\n3.Hiển thị danh sách cán bộ được tăng lương" +
        "\n4.Hiển thị số lượng cán bộ nữ" +
        "\n5.Hiển thị cán bộ có chuyên môn về CNTT" +
        "\n6.Hiển thị Lương");
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
            case "6":
                hienThiLuong();
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
    canbo.setChuyenMon(prompt("nhập thông tin chuyên môn"));
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
        hienThiDanhSachCanBo(parseInt(chon) - 1);
    }else{
        hienThiDanhSach();
    }
}

function hienThiDanhSachCanBo(index) {
    alert("Thông tin chi tiết cán bộ " + danhSachCanBo[index].getTen()+
        "\n1.Tên cán bộ "+danhSachCanBo[index].getTen()+
        "\n2.Giới tính "+danhSachCanBo[index].getGioiTinh()+
        "\n3.Quê quán "+danhSachCanBo[index].getQueQuan()+
        "\n4.Năm sinh "+danhSachCanBo[index].getNamSinh()+
        "\n5Chuyên môn "+danhSachCanBo[index].getChuyenMon()+
        "\n6.Trình độ "+danhSachCanBo[index].getTrinhDo()+
        "\n7.Hệ số lương "+danhSachCanBo[index].getHeSoLuong()+
        "\n8.Phụ cấp "+danhSachCanBo[index].getPhuCap()
    );
    hienThiCanBo();
}
function hienThiCanBoTangLuong() {
    let ketqua = "Danh sách cán bộ được tăng lương";
    for (let i = 0; i < danhSachCanBo.length; i++) {
        if (danhSachCanBo[i].getNamSinh() < 1985) {
            ketqua += "\n" + danhSachCanBo[i].getTen();
        }
    }
    alert(ketqua);
    hienThiDanhSach()
}

function hienThiCanBoNu() {
    let ketqua = "Danh sách cán bộ nữ";
    for (let i = 0; i < danhSachCanBo.length; i++) {
        if (danhSachCanBo[i].getGioiTinh() === "nu") {
            ketqua += "\n" + danhSachCanBo[i].getTen();
        }
    }
    alert(ketqua);
    hienThiDanhSach()
}
function hienThiCanBoCNTT() {
    let ketqua = "Danh sách cán bộ CNTT";
    for (let i = 0; i < danhSachCanBo.length; i++) {
        if (danhSachCanBo[i].getChuyenMon() === "cntt") {
            ketqua += "\n" + danhSachCanBo[i].getTen();
        }
    }
    alert(ketqua);
    hienThiDanhSach();
}
function hienThiLuong() {
    let ketqua="Hiển thị Lương:"
    for (let i = 0; i < danhSachCanBo.length; i++) {
        ketqua+="\n"+(i+1)+"."+danhSachCanBo[i].getTen()+":"+
        danhSachCanBo[i].thuclinh();
    }
    alert(ketqua);
    hienThiDanhSach();
}

hienThiDanhSach();