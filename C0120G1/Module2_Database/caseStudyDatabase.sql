create database caseStudy;
use caseStudy;
create table viTri(
idViTri int primary key,
tenViTri varchar(45) not null
);
create table trinhDo(
idTrinhDo int primary key,
trinhDo varchar(45) not null
);
create table boPhan(
idBoPhan int primary key,
tenBoPhan varchar(45) not null
);
create table nhanVien(
idNhanVien int primary key,
hoTen int not null,
idViTri int not null,
idTrinhDo int not null,
idBoPhan int not null,
ngaySinh date not null,
soCMTND varchar(45) not null,
luong varchar(45) not null,
sDT varchar(45) not null,
email varchar(45) not null,
diaChi varchar(45) not null,
foreign key (idViTri) references viTri(idViTri),
foreign key (idTrinhDo) references trinhDo(idTrinhDo),
foreign key (idBoPhan) references boPhan(idBoPhan)
);
create table loaiDichVu(
idLoaiDichVu int primary key,
tenLoaiDichVu varchar(45) not null
);
create table kieuThue(
idKieuThue int primary key,
tenKieuThue varchar(45) not null,
gia int not null
);
create table dichVu(
idDichVu int primary key,
tenDichVu varchar(45) not null,
dienTich int not null,
soTang int not null,
soNguoiToiDa varchar(45) not null,
chiPhiThue varchar(45) not null,
idKieuThue int not null,
idLoaiDichVu int(45) not null,
trangThai varchar(45) not null,
foreign key (idKieuThue) references kieuThue(idKieuThue),
foreign key (idLoaiDichVu) references loaiDichVu(idLoaiDichVu)
);
create table loaiKhach(
idLoaiKhach int primary key,
tenLoaiKhach varchar(45) not null
);
create table khachHang(
idKhachHang	int primary key,
idLoaiKhach int not null,
hoTen varchar(45) not null,
ngaySinh date not null,
soCMTND varchar(45) not null,
sDT varchar(45) not null,
email varchar(45) not null,
diaChi varchar(45) not null,
foreign key (idLoaiKhach) references loaiKhach(idLoaiKhach)
);
create table hopDong(
idHopDong int primary key,
idNhanVien int not null,
idKhachHang int not null,
idDichVu int not null,
ngayLamHopDong date not null,
ngayKetThuc date not null,
tienDatCoc int not null,
tongTien int not null,
foreign key (idNhanVien) references nhanVien(idNhanVien),
foreign key (idKhachHang) references khachHang(idKhachHang),
foreign key (idDichVu) references dichVu(idDichVu)
);
create table dichVuDiKem(
idDichVuDiKem int primary key,
tenDichVuDiKem varchar(45) not null,
gia int not null,
donVi int not null,
trangThaiKhaDung varchar(45) not null
);
create table hopDongChiTiet(
idHopDongChiTiet int primary key,
idHopDong int references hopDong(idHopDong),
idDichVuDiKem int not null,
soLuong int not null,
foreign key (idDichVuDiKem) references dichVuDiKem(idDichVuDiKem)
);


