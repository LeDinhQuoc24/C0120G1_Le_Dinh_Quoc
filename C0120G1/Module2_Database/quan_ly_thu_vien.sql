drop database if exists quan_ly_thu_vien;
create database quan_ly_thu_vien;
use quan_ly_thu_vien;

create table loai_sach(
id_loai_sach int auto_increment primary key,
ten_loai_sach varchar(50) not null,
vi_tri varchar(50) 
);
create table sach(
ma_sach int auto_increment primary key,
ten_sach varchar(50) not null,
nha_xuat_ban varchar(50) not null,
tac_gia varchar(50) not null,
nam_xuat_ban date not null,
so_lan_xuat_ban int not null,
gia double not null,
id_loai_sach int,
foreign key (id_loai_sach) references loai_sach (id_loai_sach)
);
create table sinh_vien(
ma_sinh_vien int auto_increment primary key,
ten_sinh_vien varchar(50) not null,
ngay_sinh date not null,
dia_chi varchar(50) not null,
email varchar(50) not null,
so_dien_thoai int(40) not null
);
create table lich_su_muon_sach(
id_lich_su_muon int primary key,
ma_sach int,
ma_sinh_vien int,
ngay_muon_sach date not null,
ngay_tra_sach date,
foreign key (ma_sach) references sach (ma_sach),
foreign key (ma_sinh_vien) references sinh_vien (ma_sinh_vien)
);
-- 1:Hiển thị tất cả các sách trong thư viện
select * from sach;
-- 2:Hiển thị tất cả các sách lập trình trong thư viện
select * from sach where id_loai_sach 
in(select id_loai_sach from loai_sach where ten_loai_sach='Lập Trình');
-- 3:Hiển thị các sách đang được mượn
select * from sach join lich_su_muon_sach on sach.ma_sach=lich_su_muon_sach.ma_sach 
where ngay_tra_sach = null;
-- 4:Hiển thị tất cả học viên mượn sách nhưng chưa trả 
select sinh_vien.ma_sinh_vien,sinh_vien.ma_sinh_vien from sinh_vien join lich_su_muon_sach
on sinh_vien.ma_sinh_vien=lich_su_muon_sach.ma_sinh_vien where ngay_tra_sach = null;