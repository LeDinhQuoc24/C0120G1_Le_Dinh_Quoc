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
idNhanVien int auto_increment primary key,
hoTen varchar(50) not null,
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
CREATE TABLE hop_dong_chi_tiet (
    idHopDongChiTiet INT PRIMARY KEY,
    idHopDong INT NOT NULL,
    idDichVuDiKem INT NOT NULL,
    soLuong INT NOT NULL,
    FOREIGN KEY (idHopDong)
        REFERENCES hop_dong (idHopDong),
    FOREIGN KEY (idDichVuDiKem)
        REFERENCES dich_vu_di_kem (idDichVuDiKem)
);
-- Tạo thông tin cho 3 thông tin bảng mà khóa ngoại của bảng nhân viên tham chiếu đến,sau đó tạo bảng nhân viên
insert into vi_tri(idViTri,tenViTri) value (85,"XVSR497"),(90,"WANZ-468"),(91,"SSPD-130"),(93,"ABP-145"),(86,"LLR-008");
insert into trinh_do(idTrinhDo,trinhDo) value (60,"HUNTA-316"),(56,"MIAD-758"),(58,"DV-1602"),(65,"ABP-171"),(61,"NTR-003");
insert into bo_phan(idBoPhan,tenBoPhan) value (90,"HUNTA-127"),(85,"TMHP-051​​​​​​​"),(86,"SNIS-851"),(94,"ABP-138"),(88,"APAA-280");
insert into nhan_vien(hoTen,idViTri,idTrinhDo,idBoPhan,ngaySinh,soCMTND,luong,sDT,email,diaChi)
value ("HSuzumiya Kotone",85,60,90,"1992-06-27","Java01"," 157","XVSR-491","kotone@gmail.com","Japan"),
 ("Abe Mikako",90,56,85,"1994-02-21","Java02","160","JUY-863","mikako@gmail.com","Tokyo"),
  ("Tsukasa Aoi",91,58,86,"1990-08-14","Java03","163","SNIS-519","tsukasa@gmail.com","Osaka"),
 ("Erika Momotani",93,65,94,"1994-06-15","Java04","165","ABP-159","erika@gmail.com","Tokyo"),
  ("KEmiri Suzuhara",86,61,88,"1994-04-20","Java05","161","HBAD-267","suzuhara@gmail.com","Japan");
  -- Task 2:Lệnh truy xuất
-- select * from nhan_vien where (hoTen like 'H%' or hoTen like'T%' or hoTen like'K%')and length(hoTen)<=40;

 

 

