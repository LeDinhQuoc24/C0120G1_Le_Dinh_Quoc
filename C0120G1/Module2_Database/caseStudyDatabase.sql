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
-- Task 2
-- Tạo thông tin cho 3 thông tin bảng mà khóa ngoại của bảng nhân viên tham chiếu đến,sau đó tạo bảng nhân viên
insert into vi_tri(idViTri,tenViTri) value (01,"Hoa Quả Sơn"),(02,"Thủy Liêm Động"),(03,"Cao Lão Trang"),(04,"Nữ Nhi Quốc"),(05,"Tây Trúc");
insert into trinh_do(idTrinhDo,trinhDo) value (01,"Bạch Mã Ôn"),(02,"Thiên Bồng Nguyên Soái"),(03,"Đấu Chiến Thắng Phật"),(04,"Mỹ Hầu Vương"),(05,"Đường Trưởng Lão");
insert into bo_phan(idBoPhan,tenBoPhan) value (01,"Ngộ Không"),(02,"Đường Huyền Trang"),(03,"Trư Ngộ Năng"),(04,"Sa Ngộ Tĩnh"),(05,"Tiểu Long Mã");
insert into nhan_vien(hoTen,idViTri,idTrinhDo,idBoPhan,ngaySinh,soCMTND,luong,sDT,email,diaChi)
value ("Đông Phương Bất Bại",01,01,01,"1998-12-24","20501","2000000","0905000001","batbai@gmail.com","Quảng Nam"),
 ("Tần Thủy Hoàng",02,02,02,"1999-02-01","20502","10","0905000002","doanhchinh@gmail.com","Quế Xuân"),
  ("Võ Tắc Thiên",03,03,03,"2000-04-03","20503","400000","0905000003","tacthien@gmail.com","Đà Nẵng"),
 ("Tây Môn Khánh",04,04,04,"1990-05-04","20504","750000","0905000004","monkhanh@gmail.com","Huế"),
  ("Trương Vô Kỵ",05,05,05,"1985-06-07","20505","3600000","0905000005","voky@gmail.com","Quảng Ngãi");
  select * from nhan_vien where (hoTen like 'H%' or hoTen like'T%' or hoTen like'K%')and length(hoTen)<=40;
 

 


