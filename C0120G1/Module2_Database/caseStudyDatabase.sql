drop database if exists furama_resort_le_dinh_quoc;
create database furama_resort_le_dinh_quoc;
use furama_resort_le_dinh_quoc;
-- Task 1:Tạo Bảng
create table vi_tri(
id_vi_tri int primary key,
ten_vi_tri varchar(45) not null
);
create table trinh_do(
id_trinh_do int primary key,
trinh_do varchar(45) not null
);
create table bo_phan(
id_bo_phan int primary key,
ten_bo_phan varchar(45) not null
);
create table nhan_vien(
id_nhan_vien int auto_increment primary key,
ho_ten varchar(50) not null,
id_vi_tri int not null,
id_trinh_do int not null,
id_bo_phan int not null,
ngay_sinh date not null,
so_cmtnd varchar(45) not null,
luong varchar(45) not null,
sdt varchar(45) not null,
email varchar(45) not null,
dia_chi varchar(45) not null,
foreign key (id_vi_tri) references vi_tri(id_vi_tri),
foreign key (id_trinh_do) references trinh_do(id_trinh_do),
foreign key (id_bo_phan) references bo_phan(id_bo_phan)
);
create table loai_dich_vu(
id_loai_dich_vu int auto_increment primary key,
ten_loai_dich_vu varchar(45) not null
);
create table kieu_thue(
id_kieu_thue int auto_increment primary key,
ten_kieu_thue varchar(45) not null,
gia int not null
);
create table dich_vu(
id_dich_vu int auto_increment primary key,
ten_dich_vu varchar(45) not null,
dien_tich int not null,
so_tang int not null,
so_nguoi_toi_da varchar(45) not null,
chi_phi_thue varchar(45) not null,
id_kieu_thue int not null,
id_loai_dich_vu int(45) not null,
trang_thai varchar(45) not null,
foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue),
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu)
);
create table loai_khach(
id_loai_khach int auto_increment primary key,
ten_loai_khach varchar(45) not null
);
create table khach_hang(
id_khach_hang	int auto_increment primary key,
id_loai_khach int not null,
ho_ten varchar(45) not null,
ngay_sinh date not null,
so_cmtnd varchar(45) not null,
sdt varchar(45) not null,
email varchar(45) not null,
dia_chi varchar(45) not null,
foreign key (id_loai_khach) references loai_khach(id_loai_khach)
);
create table hop_dong(
id_hop_dong int auto_increment primary key,
id_nhan_vien int not null,
id_khach_hang int not null,
id_dich_vu int not null,
ngay_lam_hop_dong date not null,
ngay_ket_thuc date not null,
tien_dat_coc int not null,
tong_tien int not null,
foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien),
foreign key (id_khach_hang) references khach_hang(id_khach_hang),
foreign key (id_dich_vu) references dich_vu(id_dich_vu)
);
create table dich_vu_di_kem(
id_dich_vu_di_kem int auto_increment primary key,
ten_dich_vu_di_kem varchar(45) not null,
gia int not null,
don_vi int not null,
trang_thai_kha_dung varchar(45) not null
);
CREATE TABLE hop_dong_chi_tiet (
    id_hop_dong_chi_tiet INT auto_increment PRIMARY KEY,
    id_hop_dong INT NOT NULL,
    id_dich_vu_di_kem INT NOT NULL,
    so_luong INT NOT NULL,
    FOREIGN KEY (id_hop_dong)
        REFERENCES hop_dong (id_hop_dong),
    FOREIGN KEY (id_dich_vu_di_kem)
        REFERENCES dich_vu_di_kem (id_dich_vu_di_kem)
);
-- Task 2
-- Tạo thông tin cho 3 thông tin bảng mà khóa ngoại của bảng nhân viên tham chiếu đến,sau đó tạo bảng nhân viên
insert into vi_tri(id_vi_tri,ten_vi_tri) value (85,"XVSR497"),(90,"WANZ-468"),(91,"SSPD-130"),(93,"ABP-145"),(86,"LLR-008");
insert into trinh_do(id_trinh_do,trinh_do) value (60,"HUNTA-316"),(56,"MIAD-758"),(58,"DV-1602"),(65,"ABP-171"),(61,"NTR-003");
insert into bo_phan(id_bo_phan,ten_bo_phan) value (90,"HUNTA-127"),(85,"TMHP-051​​​​​​​"),(86,"SNIS-851"),(94,"ABP-138"),(88,"APAA-280");
insert into nhan_vien(ho_ten,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,so_cmtnd,luong,sdt,email,dia_chi)
value ("HSuzumiya Kotone",85,60,90,"1992-06-27","Java01"," 157","XVSR-491","kotone@gmail.com","Japan"),
 ("Abe Mikako",90,56,85,"1994-02-21","Java02","160","JUY-863","mikako@gmail.com","Tokyo"),
  ("Tsukasa Aoi",91,58,86,"1990-08-14","Java03","163","SNIS-519","tsukasa@gmail.com","Osaka"),
 ("Erika Momotani",93,65,94,"1994-06-15","Java04","165","ABP-159","erika@gmail.com","Tokyo"),
  ("KEmiri Suzuhara",86,61,88,"1994-04-20","Java05","161","HBAD-267","suzuhara@gmail.com","Japan");
  
  -- Task 2:Lệnh truy xuất
SELECT 
    *
FROM
    nhan_vien
WHERE
    (ho_ten LIKE 'H%' OR ho_ten LIKE 'T%'
        OR ho_ten LIKE 'K%')
        AND LENGTH(ho_ten) <= 40;
-- Task 3:
-- Tạo thông tin cho bảng loại khách mà khóa ngoại của bảng khách hàng tham chiếu đến,sau đó tạo bảng khách hàng
insert into loai_khach(ten_loai_khach) value ('Platinium'),('Silver'),('Gold'),('Diamond'),('Iron'),('Wood');
insert into khach_hang(id_loai_khach,ho_ten,ngay_sinh,so_cmtnd,sdt,email,dia_chi) value
(1,'Nguyễn Anh Đức','1965-01-01','205001','0905001','naduc@gmail.com','Quảng Trị'),
(1,'Nguyễn Đức Thông','2000-02-02','205002','0905002','ndthong@gmail.com','Đà Nẵng'),
(3,'Phạm Minh Hưng','2006-03-03','205003','0905003','pmhung@gmail.com','Đà Nẵng'),
(4,'Võ Minh Hùng','1998-04-04','205004','0905004','vmhung@gmail.com','Quảng Ngãi'),
(5,'Nguyễn Đình Hòa','2002-05-05','205005','0905005','ndhoa@gmail.com','Quảng Trị'),
(1,'Trần Ngọc Tân','1969-06-06','205006','0905006','tntan@gmail.com','Đà Nẵng'),
(4,'Nguyễn Anh Đức','1986-09-09','205007','0905007','anhduc@gmail.com','Vinh'),
(4,'Văn Nhân Lam','1970-02-02','205008','0905008','vnnhnlm@gmail.com','Vinh');
-- Task 3:Lệnh truy xuất
SELECT 
    *
FROM
    khach_hang
WHERE
	((YEAR(NOW()) - YEAR(ngay_sinh)) BETWEEN 19 AND 49)
    and (YEAR(NOW())-YEAR(ngay_sinh))=18 and MONTH(NOW())>MONTH(ngay_sinh) or 
    (MONTH(NOW())=MONTH(ngay_sinh) and DAY(NOW())>DAY(ngay_sinh))
    or (YEAR(NOW())-YEAR(ngay_sinh))=50 and MONTH(NOW())<MONTH(ngay_sinh) or 
    (MONTH(NOW())=MONTH(ngay_sinh) and DAY(NOW())<DAY(ngay_sinh))
-- Nếu xài câu lệnh 145 thay cho các câu lệnh (138-142) sẽ thêm trường hợp
-- Nguyễn Đình Hòa Ngày sinh 2002-05-05
--  (YEAR(NOW()) - YEAR(ngay_sinh)) BETWEEN 18 AND 50
        AND (dia_chi = 'Quảng Trị'
        OR dia_chi = 'Đà Nẵng');
-- Task 4:
-- Tạo bảng loại dịch vụ,kiểu thuê mà khóa ngoại của bảng dịch vụ tham chiếu đến
insert into loai_dich_vu(ten_loai_dich_vu) value ('massage'),('caj'),('cbj'),('chj');
insert into kieu_thue(ten_kieu_thue,gia) value ('oneshot',30000),('longshot',200000),('a-z',1000000);	
-- Tạo bảng dịch vụ mà khóa ngoại của bảng hợp đồng tham chiếu đến
insert into dich_vu(ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai) value
('java1',10,8,2,'30000',1,3,'high'),('java2',20,10,4,'500000',2,1,'feed'),('java3',15,3,3,'300000',3,4,'crazy');
-- Tạo thông tin tại bảng hợp đồng,sau đó từ bảng khách hàng join đến để hiển thị thông tin khách đặt phòng
insert into hop_dong(id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,tong_tien) value
(5,1,1,'2019-03-01','2019-12-28',10,200),
(5,4,1,'2019-10-07','2019-11-04',50,1200),
(2,1,2,'2018-12-24','2019-12-25',18,820),
(3,2,2,'2018-011-02','2019-12-27',100,1200),
(5,1,1,'2019-03-01','2019-12-28',10,200),
(5,4,1,'2019-10-07','2019-11-04',50,1000),
(2,6,2,'2019-12-24','2019-12-25',18,2020),
(3,3,3,'2018-011-02','2020-12-27',100,900),
(3,8,1,'2015-011-02','2015-12-27',300,800);
-- Lệnh hiển thị tất cả thông tin nối các bảng hợp đồng,khách hàng, loại khách
SELECT 
    *
FROM
    (khach_hang
    JOIN hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang)
        JOIN
    loai_khach ON khach_hang.id_loai_khach = loai_khach.id_loai_khach;
-- Task 4: Lệnh truy xuất
SELECT 
    ho_ten,
    COUNT(hop_dong.id_khach_hang) AS Số_Lần_Đặt_Phòng
FROM
    (khach_hang
    JOIN hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang)
        JOIN
    loai_khach ON khach_hang.id_loai_khach = loai_khach.id_loai_khach
WHERE
    loai_khach.ten_loai_khach = 'Diamond'
GROUP BY ho_ten
ORDER BY Số_Lần_Đặt_Phòng;
-- Task 5:
-- Tạo thông tin bảng dịch vụ đi kèm, và bảng hợp đồng chi tiết
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai_kha_dung) value
('football',50,1,'empty'),('cinemar3D',200,10,'full'),('boilling',20,4,'half-full');
insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong) value
(4,2,1),(2,2,10),(2,1,5),(1,1,5),(8,3,3);
-- Task 5:Lệnh truy xuất
SELECT 
    khach_hang.id_khach_hang,
    khach_hang.ho_ten,
    loai_khach.ten_loai_khach,
    hop_dong.id_hop_dong,
    dich_vu.ten_dich_vu,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
    (dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia) AS Tổng_tiền
FROM
    ((((khach_hang
    LEFT JOIN loai_khach ON khach_hang.id_loai_khach = loai_khach.id_loai_khach)
    LEFT JOIN hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang)
    LEFT JOIN dich_vu ON hop_dong.id_dich_vu = dich_vu.id_dich_vu)
    LEFT JOIN hop_dong_chi_tiet ON hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong)
        LEFT JOIN
    dich_vu_di_kem ON hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem;

-- Task 6:Lệnh truy xuất
SELECT 
    dich_vu.id_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.so_nguoi_toi_da,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
FROM
    dich_vu
        JOIN
    loai_dich_vu ON dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
WHERE
    NOT EXISTS( SELECT 
            hop_dong.id_dich_vu
        FROM
            hop_dong
        WHERE
            (hop_dong.ngay_lam_hop_dong BETWEEN '2019-01-01' AND '2019-03-03')
                AND hop_dong.id_dich_vu = dich_vu.id_dich_vu);

-- Task 7:Lệnh truy xuất
SELECT 
    dich_vu.id_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.so_nguoi_toi_da,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
FROM
    dich_vu
        JOIN
    loai_dich_vu ON dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
WHERE
    EXISTS( SELECT 
            hop_dong.id_dich_vu
        FROM
            hop_dong
        WHERE
            (hop_dong.ngay_lam_hop_dong BETWEEN '2018-01-01' AND '2018-12-31')
                AND hop_dong.id_dich_vu = dich_vu.id_dich_vu)
        AND NOT EXISTS( SELECT 
            hop_dong.id_dich_vu
        FROM
            hop_dong
        WHERE
            (hop_dong.ngay_lam_hop_dong BETWEEN '2019-01-01' AND '2019-12-31')
                AND hop_dong.id_dich_vu = dich_vu.id_dich_vu);

-- Task 8:Lệnh truy xuất
SELECT DISTINCT
    ho_Ten as Họ_Tên_Khách_Hàng
FROM
    khach_hang;
SELECT 
    ho_ten as Họ_Tên_Khách_Hàng
FROM
    khach_hang
GROUP BY ho_ten;
-- Task 9:Lệnh truy xuất
SELECT 
    MONTH(ngay_lam_hop_dong) AS Tháng,
    COUNT(MONTH(ngay_lam_hop_dong)) AS Số_Lượng_Khách,
    ngay_lam_hop_dong AS Ngày_Làm_Hợp_Đồng
FROM
    hop_dong
WHERE
    YEAR(ngay_lam_hop_dong) = 2019 
GROUP BY Tháng
ORDER BY Tháng;
-- Task 9:Tham khảo
drop table if exists Temp;
create temporary table Temp
select 1 as Month
union
select 2 as Month
union
select 3 as Month
union
select 4 as Month
union
select 5 as Month
union
select 6 as Month
union
select 7 as Month
union
select 8 as Month
union
select 9 as Month
union
select 10 as Month
union
select 11 as Month
union
select 12 as Month;
Select Month, count(month(ngay_lam_hop_dong)) as Số_lần_đặt
From Temp
Left join hop_dong on month(ngay_lam_hop_dong) = Month
and year(ngay_lam_hop_dong) = 2019
group by Month
order by Month;

-- Task 10:Lệnh truy xuất
-- Cách 1:
SELECT 
    hop_dong.id_hop_dong,
    ngay_lam_hop_dong,
    ngay_ket_thuc,
    tien_dat_coc,
    COUNT(hop_dong_chi_tiet.id_dich_vu_di_kem) AS Số_lượng_dịch_vụ_đi_kèm
FROM
    hop_dong
        JOIN
    hop_dong_chi_tiet ON hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
GROUP BY hop_dong.id_hop_dong; 
-- Cách 2:
SELECT 
    hop_dong.id_hop_dong,
    ngay_lam_hop_dong,
    ngay_ket_thuc,
    tien_dat_coc,
    COUNT(hop_dong_chi_tiet.id_dich_vu_di_kem) AS Số_lượng_dịch_vụ_đi_kèm
FROM
    hop_dong,
    hop_dong_chi_tiet
WHERE
    hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
GROUP BY hop_dong.id_hop_dong; 
-- Task 11:
-- Cách 1:
SELECT 
    *
FROM
    dich_vu_di_kem
WHERE
    id_dich_vu_di_kem IN (SELECT 
            id_dich_vu_di_kem
        FROM
            hop_dong_chi_tiet
        WHERE
            id_hop_dong IN (SELECT 
                    id_hop_dong
                FROM
                    hop_dong
                WHERE
                    id_khach_hang IN (SELECT 
                            id_khach_hang
                        FROM
                            khach_hang,
                            loai_khach
                        WHERE
                            loai_khach.id_loai_khach = khach_hang.id_khach_hang
                                AND (khach_hang.dia_chi = 'Quảng Ngãi'
                                OR khach_hang.dia_chi = 'Vinh')
                                AND ten_loai_khach = 'Diamond')));
-- Cách 2:
SELECT 
    *
FROM
    (((dich_vu_di_kem
    JOIN hop_dong_chi_tiet ON dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem)
    JOIN hop_dong ON hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong)
    JOIN khach_hang ON khach_hang.id_khach_hang = hop_dong.id_khach_hang)
        JOIN
    loai_khach ON loai_khach.id_loai_khach = khach_hang.id_loai_khach
        AND (khach_hang.dia_chi = 'Quảng Ngãi'
        OR khach_hang.dia_chi = 'Vinh')
        AND ten_loai_khach = 'Diamond'; 
-- Task 12:
SELECT 
    hop_dong.id_hop_dong,
    nhan_vien.ho_ten,
    khach_hang.ho_ten,
    khach_hang.sdt,
    dich_vu.ten_dich_vu,
    COUNT(id_hop_dong_chi_tiet) AS Số_Lượng_Dịch_Vụ_Đi_Kèm,
    hop_dong.ngay_lam_hop_dong
FROM
    (((hop_dong
    JOIN dich_vu ON hop_dong.id_dich_vu = dich_vu.id_dich_vu)
    JOIN hop_dong_chi_tiet ON hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong)
    JOIN nhan_vien ON hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien)
        JOIN
    khach_hang ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
WHERE
    EXISTS( SELECT 
            khach_hang.ho_ten
        FROM
            khach_hang
        WHERE
            ngay_lam_hop_dong BETWEEN '2019-9-1' AND '2019-12-31')
        AND NOT EXISTS( SELECT 
            khach_hang.ho_ten
        FROM
            khach_hang
        WHERE
            ngay_lam_hop_dong BETWEEN '2019-1-1' AND '2019-6-31')
GROUP BY khach_hang.ho_ten;
-- Task 13:
SELECT 
    *, COUNT(dich_vu_di_kem.id_dich_vu_di_kem) AS Số_lần_đặt
FROM
    ((dich_vu_di_kem
    JOIN hop_dong_chi_tiet ON dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem)
    JOIN hop_dong ON hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong)
        JOIN
    khach_hang ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
GROUP BY dich_vu_di_kem.id_dich_vu_di_kem
ORDER BY COUNT(dich_vu_di_kem.id_dich_vu_di_kem) DESC
LIMIT 1;
-- Task 14:
SELECT 
    *
FROM
    ((dich_vu_di_kem
    JOIN hop_dong_chi_tiet ON dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem)
    JOIN hop_dong ON hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong)
        JOIN
    khach_hang ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
WHERE
    dich_vu_di_kem.id_dich_vu_di_kem IN (SELECT 
            id_dich_vu_di_kem
        FROM
            hop_dong_chi_tiet
        GROUP BY id_dich_vu_di_kem
        HAVING COUNT(id_dich_vu_di_kem) = 1);
-- Task 15:
SELECT 
    nhan_vien.id_nhan_vien,
    nhan_vien.ho_ten,
    trinh_do.trinh_do,
    bo_phan.ten_bo_phan,
    nhan_vien.sdt,
    nhan_vien.dia_chi,
    id_hop_dong,
    hop_dong.ngay_lam_hop_dong,
    COUNT(id_hop_dong)
FROM
    ((nhan_vien
    JOIN bo_phan ON nhan_vien.id_bo_phan = bo_phan.id_bo_phan)
    JOIN hop_dong ON nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien)
        JOIN
    trinh_do ON nhan_vien.id_trinh_do = trinh_do.id_trinh_do
WHERE
    YEAR(ngay_lam_hop_dong) BETWEEN 2018 AND 2019
GROUP BY ho_ten
HAVING COUNT(id_hop_dong) <= 3;
-- Task 16:
SET SQL_SAFE_UPDATES=0;
DELETE FROM nhan_vien 
WHERE
    id_nhan_vien NOT IN (SELECT 
        id_nhan_vien
    FROM
        hop_dong
    WHERE
        YEAR(ngay_lam_hop_dong) BETWEEN 2017 AND 2019);
-- Kiểm tra nhân viên trước và sau khi xóa
select * from nhan_vien;
-- Task 17:
-- Lệnh update comment 473-485,comment lại để dễ kiểm tra
-- UPDATE khach_hang 
-- SET 
--     id_loai_khach = 4
-- WHERE
--     id_loai_khach = 1
--         AND id_khach_hang IN (SELECT 
--             id_khach_hang
--         FROM
--             hop_dong
--         WHERE
--             YEAR(ngay_lam_hop_dong) = 2019
--         GROUP BY hop_dong.id_khach_hang
--         HAVING SUM(tong_tien) > 1200);
-- Kiểm tra thông tin khách hàng trước và khi update
-- Trần Ngọc Tân set từ Platium->Diamond
-- SELECT 
--     khach_hang.id_khach_hang,
--     khach_hang.ho_ten,
--     khach_hang.ngay_sinh,
--     sum(tong_tien),
--     loai_khach.ten_loai_khach,
--     year(hop_dong.ngay_lam_hop_dong) as Năm_làm_hợp_đồng
-- FROM
--     (khach_hang
--     JOIN loai_khach ON khach_hang.id_loai_khach = loai_khach.id_loai_khach)
--         JOIN
--     hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
-- GROUP BY id_khach_hang,Year(ngay_lam_hop_dong);
-- Task 18(Chưa hoàn thành)
-- Không xóa được khách hàng có năm làm hợp đồng <2016
-- ALTER TABLE `furama_resort_le_dinh_quoc`.`khach_hang` 
-- DROP FOREIGN KEY `khach_hang_ibfk_1`;
-- ALTER TABLE `furama_resort_le_dinh_quoc`.`khach_hang` 
-- ADD CONSTRAINT `khach_hang_ibfk_1`
--   FOREIGN KEY (`id_loai_khach`)
--   REFERENCES `furama_resort_le_dinh_quoc`.`loai_khach` (`id_loai_khach`);
--   delete from khach_hang where id_khach_hang in (select id_khach_hang from hop_dong
-- where  year(ngay_lam_hop_dong)<2016);
  -- Kiểm tra danh sách khách hàng trước và sau khi xóa
SELECT 
    khach_hang.ho_ten,
    YEAR(hop_dong.ngay_lam_hop_dong) AS Năm_làm_hợp_đồng
FROM
    khach_hang
        JOIN
    hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang;
-- Task 19
-- Kiểm tra trước và sau khi update
SELECT 
    dich_vu_di_kem.ten_dich_vu_di_kem,
    dich_vu_di_kem.gia,
    hop_dong.ngay_lam_hop_dong,
    dich_vu_di_kem.id_dich_vu_di_kem
FROM
    (dich_vu_di_kem
    JOIN hop_dong_chi_tiet ON dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem)
        JOIN
    hop_dong ON hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong;
    -- Xài lệnh update ở bên dưới
-- UPDATE dich_vu_di_kem 
-- SET 
--     gia = gia * 2
-- WHERE
--     id_dich_vu_di_kem IN (SELECT 
--             id_dich_vu_di_kem
--         FROM
--             hop_dong_chi_tiet
--                 JOIN
--             hop_dong ON hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
--         WHERE
--             YEAR(ngay_lam_hop_dong) = 2019
--         GROUP BY id_dich_vu_di_kem
--         HAVING COUNT(ten_dich_vu_di_kem) > 1);
-- Task 20
SELECT 
    id_nhan_vien AS ID, ho_ten, email, sdt, ngay_sinh, dia_chi
FROM
    nhan_vien 
UNION ALL SELECT 
    id_khach_hang AS ID, ho_ten, email, sdt, ngay_sinh, dia_chi
FROM
    khach_hang


 















 


