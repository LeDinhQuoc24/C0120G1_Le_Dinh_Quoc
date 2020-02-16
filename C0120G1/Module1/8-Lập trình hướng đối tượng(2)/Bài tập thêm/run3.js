let arrCanBo = [];

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
function themcanbo() {
    let

}
hienThiDanhSach();