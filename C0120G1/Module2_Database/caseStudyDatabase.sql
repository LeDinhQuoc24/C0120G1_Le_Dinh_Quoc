drop database if exists furama_resort;
create database furama_resort;
use furama_resort;
-- Task 1:Tạo Bảng
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
idLoaiDichVu int auto_increment primary key,
tenLoaiDichVu varchar(45) not null
);
create table kieu_thue(
idKieuThue int auto_increment primary key,
tenKieuThue varchar(45) not null,
gia int not null
);
create table dich_vu(
idDichVu int auto_increment primary key,
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
idLoaiKhach int auto_increment primary key,
tenLoaiKhach varchar(45) not null
);
create table khach_hang(
idKhachHang	int auto_increment primary key,
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
idHopDong int auto_increment primary key,
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
idDichVuDiKem int auto_increment primary key,
tenDichVuDiKem varchar(45) not null,
gia int not null,
donVi int not null,
trangThaiKhaDung varchar(45) not null
);
CREATE TABLE hop_dong_chi_tiet (
    idHopDongChiTiet INT auto_increment PRIMARY KEY,
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

-- Task 3:
-- Tạo thông tin cho bảng loại khách mà khóa ngoại của bảng khách hàng tham chiếu đến,sau đó tạo bảng khách hàng
insert into loai_khach(tenLoaiKhach) value ('Diamond'),('Silver'),('Gold'),('Diamond'),('Iron'),('Wood');
insert into khach_hang(idLoaiKhach,hoTen,ngaySinh,soCMTND,sDT,email,diaChi) value
(001,'Nguyễn Anh Đức','1965-01-01','205001','0905001','naduc@gmail.com','Quảng Trị'),
(002,'Nguyễn Đức Thông','2000-02-02','205002','0905002','ndthong@gmail.com','Đà Nẵng'),
(003,'Phạm Minh Hưng','2006-03-03','205003','0905003','pmhung@gmail.com','Đà Nẵng'),
(004,'Võ Minh Hùng','1998-04-04','205004','0905004','vmhung@gmail.com','Quảng Trị'),
(005,'Nguyễn Đình Hòa','2002-05-05','205005','0905005','ndhoa@gmail.com','Quảng Trị'),
(006,'Trần Ngọc Tân','1969-06-06','205006','0905006','tntan@gmail.com','Đà Nẵng');
-- Task 3:Lệnh truy xuất
-- select *from khach_hang where (year(now())-year(ngaySinh)) between 18 and 50 and 
-- (diaChi='Quảng Trị' or diaChi='Đà Nẵng');
-- Task 4:
-- Tạo bảng loại dịch vụ,kiểu thuê mà khóa ngoại của bảng dịch vụ tham chiếu đến
insert into loai_dich_vu(tenLoaiDichVu) value ('massage'),('aj'),('bj'),('hj');
insert into kieu_thue(tenKieuThue,gia) value ('oneshot',30000),('longshot',200000),('a-z',1000000);	
-- Tạo bảng dịch vụ mà khóa ngoại của bảng hợp đồng tham chiếu đến
insert into dich_vu(tenDichVu,dienTich,soTang,soNguoiToiDa,chiPhiThue,idKieuThue,idLoaiDichVu,trangThai) value
('java1',10,8,2,'30000',1,3,'high'),('java2',20,10,4,'500000',2,1,'feed'),('java3',15,3,3,'300000',3,4,'crazy');
-- Tạo thông tin tại bảng hợp đồng,sau đó từ bảng khách hàng join đến để hiển thị thông tin khách đặt phòng
insert into hop_dong(idNhanVien,idKhachHang,idDichVu,ngayLamHopDong,ngayKetThuc,tienDatCoc,tongTien) value
(5,1,3,'1980-01-01','1980-03-03',10,200),
(4,4,1,'2000-02-02','2000-04-04',50,1000),
(2,1,2,'1985-05-05','1985-10-10',18,420),
(3,3,2,'2019-02-02','2019-3-1',100,900);
-- Lệnh hiển thị tất cả thông tin nối các bảng hợp đồng,khách hàng, loại khách
-- select  * from (khach_hang join hop_dong on khach_hang.idKhachHang=hop_dong.idKhachHang)
-- join loai_khach on khach_hang.idLoaiKhach=loai_khach.idLoaiKhach;
-- Task 4: Lệnh truy xuất
-- select hoTen,count(hop_dong.idKhachHang) as Số_Lần_Đặt_Phòng from 
-- (khach_hang join hop_dong on khach_hang.idKhachHang=hop_dong.idKhachHang)
-- join loai_khach on khach_hang.idLoaiKhach=loai_khach.idLoaiKhach
-- where loai_khach.tenLoaiKhach='Diamond'
-- group by hoTen order by Số_Lần_Đặt_Phòng;
-- Task 5:
-- Tạo thông tin bảng dịch vụ đi kèm, và bảng hợp đồng chi tiết
insert into dich_vu_di_kem(tenDichVuDiKem,gia,donVi,trangThaiKhaDung) value
('football',50,1,'empty'),('cinemar3D',200,10,'full'),('boilling',20,4,'half-full');
insert into hop_dong_chi_tiet(idHopDong,idDichVuDiKem,soLuong) value
(4,2,1),(2,3,10),(2,1,5);
-- Task 5:Lệnh truy xuất
-- select khach_hang.idKhachHang,khach_hang.hoTen,loai_khach.tenLoaiKhach,hop_dong.idHopDong,
-- dich_vu.tenDichVu,hop_dong.ngayLamHopDong,hop_dong.ngayKetThuc,(dich_vu.chiPhiThue+
-- hop_dong_chi_tiet.soLuong*dich_vu_di_kem.gia) as Tổng_tiền
-- from
-- ((((khach_hang left join loai_khach on khach_hang.idLoaiKhach=loai_khach.idLoaiKhach)
-- left join hop_dong on khach_hang.idKhachHang=hop_dong.idKhachHang)
-- left join dich_vu on hop_dong.idDichVu=dich_vu.idDichVu)
-- left join hop_dong_chi_tiet on hop_dong.idHopDong=hop_dong_chi_tiet.idHopDong)
-- left join dich_vu_di_kem on hop_dong_chi_tiet.idDichVuDiKem=dich_vu_di_kem.idDichVuDiKem;

-- Task 6:Lệnh truy xuất
-- select dich_vu.idDichVu,dich_vu.tenDichVu,dich_vu.dienTich,dich_vu.soNguoiToiDa,dich_vu.chiPhiThue,
-- loai_dich_vu.tenLoaiDichVu
-- from dich_vu join loai_dich_vu on dich_vu.idLoaiDichVu=loai_dich_vu.idLoaiDichVu
-- where not exists
-- (select hop_dong.idDichVu from hop_dong where (hop_dong.ngayLamHopDong between '2019-01-01' and 
-- '2019-03-03') and hop_dong.idDichVu=dich_vu.idDichVu);












 


