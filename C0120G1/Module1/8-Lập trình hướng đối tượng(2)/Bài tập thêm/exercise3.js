let CanBo=function () {
    this.setTen=function (ten) {
        this.ten = ten;
    };
    this.getTen=function () {
        return this.ten;
    };
    this.setGioiTinh=function (gioitinh) {
        this.gioitinh=gioitinh;
    };
    this.getGioiTinh=function () {
        return this.gioitinh;
    };
    this.setQueQuan=function (quequan) {
        this.quequan=quequan;
    };
    this.getQueQuan=function () {
        return this.quequan;
    };
    this.setNamSinh=function (namsinh) {
        this.namsinh=namsinh;
    };
    this.getNamSinh=function () {
        return this.namsinh;
    };
    this.setChuyenMon=function (chuyenmon) {
        this.chuyenmon=chuyenmon;
    };
    this.setTrinhDo=function (trinhdo) {
        this.trinhdo=trinhdo;
    };
    this.getTrinhDo=function () {
        return this.trinhdo;
    };
    this.setHeSoLuong=function (hesoluong) {
        this.hesoluong=hesoluong;
    };
    this.getHeSoLuong=function () {
        return this.hesoluong;
    };
    this.setPhuCap=function (phucap) {
        this.phucap=phucap;
    };
    this.getPhuCap=function () {
        return this.phucap;
    };
    this.thuclinh=function () {
        return (this.hesoluong+this.phucap)*450000;
    };



}