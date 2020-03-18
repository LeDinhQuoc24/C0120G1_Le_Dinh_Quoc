drop database if exists furama_resort_le_dinh_quoc;
create database furama_resort_le_dinh_quoc;
use furama_resort_le_dinh_quoc;
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
-- SELECT 
--     *
-- FROM
--     nhan_vien
-- WHERE
--     (hoTen LIKE 'H%' OR hoTen LIKE 'T%'
--         OR hoTen LIKE 'K%')
--         AND LENGTH(hoTen) <= 40;

-- Task 3:
-- Tạo thông tin cho bảng loại khách mà khóa ngoại của bảng khách hàng tham chiếu đến,sau đó tạo bảng khách hàng
insert into loai_khach(tenLoaiKhach) value ('Platinium'),('Silver'),('Gold'),('Diamond'),('Iron'),('Wood');
insert into khach_hang(idLoaiKhach,hoTen,ngaySinh,soCMTND,sDT,email,diaChi) value
(1,'Nguyễn Anh Đức','1965-01-01','205001','0905001','naduc@gmail.com','Quảng Trị'),
(2,'Nguyễn Đức Thông','2000-02-02','205002','0905002','ndthong@gmail.com','Đà Nẵng'),
(3,'Phạm Minh Hưng','2006-03-03','205003','0905003','pmhung@gmail.com','Đà Nẵng'),
(4,'Võ Minh Hùng','1998-04-04','205004','0905004','vmhung@gmail.com','Quảng Ngãi'),
(5,'Nguyễn Đình Hòa','2002-05-05','205005','0905005','ndhoa@gmail.com','Quảng Trị'),
(6,'Trần Ngọc Tân','1969-06-06','205006','0905006','tntan@gmail.com','Đà Nẵng'),
(4,'Nguyễn Anh Đức','1986-09-09','205007','0905007','anhduc@gmail.com','Vinh');
-- Task 3:Lệnh truy xuất
-- SELECT 
--     *
-- FROM
--     khach_hang
-- WHERE
--     (YEAR(NOW()) - YEAR(ngaySinh)) BETWEEN 18 AND 50
--         AND (diaChi = 'Quảng Trị'
--         OR diaChi = 'Đà Nẵng');
-- Task 4:
-- Tạo bảng loại dịch vụ,kiểu thuê mà khóa ngoại của bảng dịch vụ tham chiếu đến
insert into loai_dich_vu(tenLoaiDichVu) value ('massage'),('aj'),('bj'),('hj');
insert into kieu_thue(tenKieuThue,gia) value ('oneshot',30000),('longshot',200000),('a-z',1000000);	
-- Tạo bảng dịch vụ mà khóa ngoại của bảng hợp đồng tham chiếu đến
insert into dich_vu(tenDichVu,dienTich,soTang,soNguoiToiDa,chiPhiThue,idKieuThue,idLoaiDichVu,trangThai) value
('java1',10,8,2,'30000',1,3,'high'),('java2',20,10,4,'500000',2,1,'feed'),('java3',15,3,3,'300000',3,4,'crazy');
-- Tạo thông tin tại bảng hợp đồng,sau đó từ bảng khách hàng join đến để hiển thị thông tin khách đặt phòng
insert into hop_dong(idNhanVien,idKhachHang,idDichVu,ngayLamHopDong,ngayKetThuc,tienDatCoc,tongTien) value
(5,1,3,'2019-03-01','2019-12-28',10,200),
(5,4,1,'2019-10-07','2019-11-04',50,1000),
(2,1,2,'2019-12-24','2019-12-25',18,420),
(3,3,2,'2019-011-02','2019-12-27',100,900),
(5,1,3,'2019-03-01','2019-12-28',10,200),
(5,4,1,'2019-10-07','2019-11-04',50,1000),
(2,1,2,'2020-12-24','2020-12-25',18,420),
(3,3,2,'2020-011-02','2020-12-27',100,900);
-- Lệnh hiển thị tất cả thông tin nối các bảng hợp đồng,khách hàng, loại khách
-- SELECT 
--     *
-- FROM
--     (khach_hang
--     JOIN hop_dong ON khach_hang.idKhachHang = hop_dong.idKhachHang)
--         JOIN
--     loai_khach ON khach_hang.idLoaiKhach = loai_khach.idLoaiKhach;
-- Task 4: Lệnh truy xuất
-- SELECT 
--     hoTen,
--     COUNT(hop_dong.idKhachHang) AS Số_Lần_Đặt_Phòng
-- FROM
--     (khach_hang
--     JOIN hop_dong ON khach_hang.idKhachHang = hop_dong.idKhachHang)
--         JOIN
--     loai_khach ON khach_hang.idLoaiKhach = loai_khach.idLoaiKhach
-- WHERE
--     loai_khach.tenLoaiKhach = 'Diamond'
-- GROUP BY hoTen
-- ORDER BY Số_Lần_Đặt_Phòng;
-- Task 5:
-- Tạo thông tin bảng dịch vụ đi kèm, và bảng hợp đồng chi tiết
insert into dich_vu_di_kem(tenDichVuDiKem,gia,donVi,trangThaiKhaDung) value
('football',50,1,'empty'),('cinemar3D',200,10,'full'),('boilling',20,4,'half-full');
insert into hop_dong_chi_tiet(idHopDong,idDichVuDiKem,soLuong) value
(4,2,1),(2,3,10),(2,1,5),(1,1,5);
-- Task 5:Lệnh truy xuất
-- SELECT 
--     khach_hang.idKhachHang,
--     khach_hang.hoTen,
--     loai_khach.tenLoaiKhach,
--     hop_dong.idHopDong,
--     dich_vu.tenDichVu,
--     hop_dong.ngayLamHopDong,
--     hop_dong.ngayKetThuc,
--     (dich_vu.chiPhiThue + hop_dong_chi_tiet.soLuong * dich_vu_di_kem.gia) AS Tổng_tiền
-- FROM
--     ((((khach_hang
--     LEFT JOIN loai_khach ON khach_hang.idLoaiKhach = loai_khach.idLoaiKhach)
--     LEFT JOIN hop_dong ON khach_hang.idKhachHang = hop_dong.idKhachHang)
--     LEFT JOIN dich_vu ON hop_dong.idDichVu = dich_vu.idDichVu)
--     LEFT JOIN hop_dong_chi_tiet ON hop_dong.idHopDong = hop_dong_chi_tiet.idHopDong)
--         LEFT JOIN
--     dich_vu_di_kem ON hop_dong_chi_tiet.idDichVuDiKem = dich_vu_di_kem.idDichVuDiKem;

-- Task 6:Lệnh truy xuất
-- SELECT 
--     dich_vu.idDichVu,
--     dich_vu.tenDichVu,
--     dich_vu.dienTich,
--     dich_vu.soNguoiToiDa,
--     dich_vu.chiPhiThue,
--     loai_dich_vu.tenLoaiDichVu
-- FROM
--     dich_vu
--         JOIN
--     loai_dich_vu ON dich_vu.idLoaiDichVu = loai_dich_vu.idLoaiDichVu
-- WHERE
--     NOT EXISTS( SELECT 
--             hop_dong.idDichVu
--         FROM
--             hop_dong
--         WHERE
--             (hop_dong.ngayLamHopDong BETWEEN '2019-01-01' AND '2019-03-03')
--                 AND hop_dong.idDichVu = dich_vu.idDichVu);

-- Task 7:Lệnh truy xuất
-- SELECT 
--     dich_vu.idDichVu,
--     dich_vu.tenDichVu,
--     dich_vu.dienTich,
--     dich_vu.soNguoiToiDa,
--     dich_vu.chiPhiThue,
--     loai_dich_vu.tenLoaiDichVu
-- FROM
--     dich_vu
--         JOIN
--     loai_dich_vu ON dich_vu.idLoaiDichVu = loai_dich_vu.idLoaiDichVu
-- WHERE
--     EXISTS( SELECT 
--             hop_dong.idDichVu
--         FROM
--             hop_dong
--         WHERE
--             (hop_dong.ngayLamHopDong BETWEEN '2018-01-01' AND '2018-12-31')
--                 AND hop_dong.idDichVu = dich_vu.idDichVu)
--         AND NOT EXISTS( SELECT 
--             hop_dong.idDichVu
--         FROM
--             hop_dong
--         WHERE
--             (hop_dong.ngayLamHopDong BETWEEN '2019-01-01' AND '2019-12-31')
--                 AND hop_dong.idDichVu = dich_vu.idDichVu);

-- Task 8:Lệnh truy xuất
-- SELECT DISTINCT
--     hoTen
-- FROM
--     khach_hang;
-- SELECT 
--     hoTen
-- FROM
--     khach_hang
-- GROUP BY hoTen;
-- Task 9:Lệnh truy xuất
-- SELECT 
--     MONTH(ngayLamHopDong) AS Tháng,
--     COUNT(MONTH(ngayLamHopDong)) AS Số_Lượng_Khách,
--     ngayLamHopDong
-- FROM
--     hop_dong
-- WHERE
--     YEAR(ngayLamHopDong) = 2019 
-- GROUP BY Tháng
-- ORDER BY Tháng;
-- Task 9:Tham khảo
-- drop table if exists Temp;
-- create temporary table Temp
-- select 1 as Month
-- union
-- select 2 as Month
-- union
-- select 3 as Month
-- union
-- select 4 as Month
-- union
-- select 5 as Month
-- union
-- select 6 as Month
-- union
-- select 7 as Month
-- union
-- select 8 as Month
-- union
-- select 9 as Month
-- union
-- select 10 as Month
-- union
-- select 11 as Month
-- union
-- select 12 as Month;
-- Select Month, count(month(ngayLamHopDong)) as 'Số lần đặt'
-- From Temp
-- Left join hop_dong on month(ngayLamHopDong) = Month
-- and year(ngayLamHopDong) = 2019
-- group by Month
-- order by Month;

-- Task 10:Lệnh truy xuất
-- Cách 1:
-- SELECT 
--     hop_dong.idHopDong,
--     ngayLamHopDong,
--     ngayKetThuc,
--     tienDatCoc,
--     COUNT(hop_dong_chi_tiet.idDichVuDiKem) AS Số_lượng_dịch_vụ_đi_kèm
-- FROM
--     hop_dong
--         JOIN
--     hop_dong_chi_tiet ON hop_dong.idHopDong = hop_dong_chi_tiet.idHopDong
-- GROUP BY hop_dong.idHopDong; 
-- Cách 2:
-- SELECT 
--     hop_dong.idHopDong,
--     ngayLamHopDong,
--     ngayKetThuc,
--     tienDatCoc,
--     COUNT(hop_dong_chi_tiet.idDichVuDiKem) AS Số_lượng_dịch_vụ_đi_kèm
-- FROM
--     hop_dong,
--     hop_dong_chi_tiet
-- WHERE
--     hop_dong.idHopDong = hop_dong_chi_tiet.idHopDong
-- GROUP BY hop_dong.idHopDong; 

-- Task 11:
-- Cách 1:
-- SELECT 
--     *
-- FROM
--     dich_vu_di_kem
-- WHERE
--     idDichVuDiKem IN (SELECT 
--             idDichVuDiKem
--         FROM
--             hop_dong_chi_tiet
--         WHERE
--             idHopDong IN (SELECT 
--                     idHopDong
--                 FROM
--                     hop_dong
--                 WHERE
--                     idKhachHang IN (SELECT 
--                             idKhachHang
--                         FROM
--                             khach_hang,
--                             loai_khach
--                         WHERE
--                             loai_khach.idLoaiKhach = khach_hang.idKhachHang
--                                 AND (khach_hang.diaChi = 'Quảng Ngãi'
--                                 OR khach_hang.diaChi = 'Vinh')
--                                 AND tenLoaiKhach = 'Diamond')));
-- Cách 2:
-- SELECT 
--     *
-- FROM
--     (((dich_vu_di_kem
--     JOIN hop_dong_chi_tiet ON dich_vu_di_kem.idDichVuDiKem = hop_dong_chi_tiet.idDichVuDiKem)
--     JOIN hop_dong ON hop_dong.idHopDong = hop_dong_chi_tiet.idHopDong)
--     JOIN khach_hang ON khach_hang.idKhachHang = hop_dong.idKhachHang)
--         JOIN
--     loai_khach ON loai_khach.idLoaiKhach = khach_hang.idLoaiKhach
--         AND (khach_hang.diaChi = 'Quảng Ngãi'
--         OR khach_hang.diaChi = 'Vinh')
--         AND tenLoaiKhach = 'Diamond'; 
-- Task 12:
-- SELECT 
--     hop_dong.idHopDong,
--     nhan_vien.hoTen,
--     khach_hang.hoTen,
--     khach_hang.sDT,
--     dich_vu.tenDichVu,
--     COUNT(idHopDongChiTiet) AS Số_Lượng_Dịch_Vụ_Đi_Kèm,
--     hop_dong.ngayLamHopDong
-- FROM
--     (((hop_dong
--     JOIN dich_vu ON hop_dong.idDichVu = dich_vu.idDichVu)
--     JOIN hop_dong_chi_tiet ON hop_dong.idHopDong = hop_dong_chi_tiet.idHopDong)
--     JOIN nhan_vien ON hop_dong.idNhanVien = nhan_vien.idNhanVien)
--         JOIN
--     khach_hang ON khach_hang.idKhachHang = hop_dong.idKhachHang
-- WHERE
--     EXISTS( SELECT 
--             khach_hang.hoTen
--         FROM
--             khach_hang
--         WHERE
--             ngayLamHopDong BETWEEN '2019-9-1' AND '2019-12-31')
--         AND NOT EXISTS( SELECT 
--             khach_hang.hoTen
--         FROM
--             khach_hang
--         WHERE
--             ngayLamHopDong BETWEEN '2019-1-1' AND '2019-6-31')
-- GROUP BY khach_hang.hoTen;
-- Task 13:
-- SELECT 
--     *, COUNT(dich_vu_di_kem.idDichVuDiKem) AS Số_lần_đặt
-- FROM
--     ((dich_vu_di_kem
--     JOIN hop_dong_chi_tiet ON dich_vu_di_kem.idDichVuDiKem = hop_dong_chi_tiet.idDichVuDiKem)
--     JOIN hop_dong ON hop_dong_chi_tiet.idHopDong = hop_dong.idHopDong)
--         JOIN
--     khach_hang ON khach_hang.idKhachHang = hop_dong.idKhachHang
-- GROUP BY dich_vu_di_kem.idDichVuDiKem
-- ORDER BY COUNT(dich_vu_di_kem.idDichVuDiKem) DESC
-- LIMIT 1;
-- Task 14:
-- SELECT 
--     *
-- FROM
--     ((dich_vu_di_kem
--     JOIN hop_dong_chi_tiet ON dich_vu_di_kem.idDichVuDiKem = hop_dong_chi_tiet.idDichVuDiKem)
--     JOIN hop_dong ON hop_dong_chi_tiet.idHopDong = hop_dong.idHopDong)
--         JOIN
--     khach_hang ON khach_hang.idKhachHang = hop_dong.idKhachHang
-- WHERE
--     dich_vu_di_kem.idDichVuDiKem IN (SELECT 
--             idDichVuDiKem
--         FROM
--             hop_dong_chi_tiet
--         GROUP BY idDichVuDiKem
--         HAVING COUNT(idDichVuDiKem) = 1)
-- ;
-- Task 15:
-- SELECT 
--     nhan_vien.idNhanVien,
--     nhan_vien.hoTen,
--     trinh_do.trinhDo,
--     bo_phan.tenBoPhan,
--     nhan_vien.sDT,
--     nhan_vien.diaChi,
--     idHopDong,
--     hop_dong.ngayLamHopDong,
--     COUNT(idHopDong)
-- FROM
--     ((nhan_vien
--     JOIN bo_phan ON nhan_vien.idBoPhan = bo_phan.idBoPhan)
--     JOIN hop_dong ON nhan_vien.idNhanVien = hop_dong.idNhanVien)
--         JOIN
--     trinh_do ON nhan_vien.idTrinhDo = trinh_do.idTrinhDo
-- WHERE
--     YEAR(ngayLamHopDong) BETWEEN 2018 AND 2019
-- GROUP BY hoTen
-- HAVING COUNT(idHopDong) <= 3;
-- Task 16:
-- SET SQL_SAFE_UPDATES=0;
-- DELETE FROM nhan_vien 
-- WHERE
--     idNhanVien NOT IN (SELECT 
--         idNhanVien
--     FROM
--         hop_dong
--     
--     WHERE
--         YEAR(ngayLamHopDong) BETWEEN 2017 AND 2019);
-- Kiểm tra nhân viên trước và sau khi xóa
-- select * from nhan_vien;
-- Task 17:
-- select * from khach_hang join loai_khach on khach_hang.idLoaiKhach=loai_khach.idLoaiKhach
-- update loai_khach set tenLoaiKhach='Diamond' where tenLoaiKhach='Platinium' and idLoaiKhach in
-- (select idLoaiKhach from 


 















 


