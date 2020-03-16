drop database if exists furama_resort;
create database furama_resort;
use furama_resort;
create table vi_tri(
idViTri int primary key,
tenViTri varchar(45) not null
);
create table trinh_do(
idTrinhDo int primary key,
trinhDo varchar(45) not null
);
create table bo_phan(
idBoPhan int primary key,
tenBoPhan varchar(45) not null
);
create table nhan_vien(
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
foreign key (idViTri) references vi_tri(idViTri),
foreign key (idTrinhDo) references trinh_do(idTrinhDo),
foreign key (idBoPhan) references bo_phan(idBoPhan)
);
create table loai_dich_vu(
idLoaiDichVu int primary key,
tenLoaiDichVu varchar(45) not null
);
create table kieu_thue(
idKieuThue int primary key,
tenKieuThue varchar(45) not null,
gia int not null
);
create table dich_vu(
idDichVu int primary key,
tenDichVu varchar(45) not null,
dienTich int not null,
soTang int not null,
soNguoiToiDa varchar(45) not null,
chiPhiThue varchar(45) not null,
idKieuThue int not null,
idLoaiDichVu int(45) not null,
trangThai varchar(45) not null,
foreign key (idKieuThue) references kieu_thue(idKieuThue),
foreign key (idLoaiDichVu) references loai_dich_vu(idLoaiDichVu)
);
create table loai_khach(
idLoaiKhach int primary key,
tenLoaiKhach varchar(45) not null
);
create table khach_hang(
idKhachHang	int primary key,
idLoaiKhach int not null,
hoTen varchar(45) not null,
ngaySinh date not null,
soCMTND varchar(45) not null,
sDT varchar(45) not null,
email varchar(45) not null,
diaChi varchar(45) not null,
foreign key (idLoaiKhach) references loai_khach(idLoaiKhach)
);
create table hop_dong(
idHopDong int primary key,
idNhanVien int not null,
idKhachHang int not null,
idDichVu int not null,
ngayLamHopDong date not null,
ngayKetThuc date not null,
tienDatCoc int not null,
tongTien int not null,
foreign key (idNhanVien) references nhan_vien(idNhanVien),
foreign key (idKhachHang) references khach_hang(idKhachHang),
foreign key (idDichVu) references dich_vu(idDichVu)
);
create table dich_vu_di_kem(
idDichVuDiKem int primary key,
tenDichVuDiKem varchar(45) not null,
gia int not null,
donVi int not null,
trangThaiKhaDung varchar(45) not null
);
create table hop_dong_chi_tiet(
idHopDongChiTiet int primary key,
idHopDong int not null,
idDichVuDiKem int not null,
soLuong int not null,
foreign key (idHopDong) references hop_dong(idHopDong),
foreign key (idDichVuDiKem) references dich_vu_di_kem(idDichVuDiKem)
);


