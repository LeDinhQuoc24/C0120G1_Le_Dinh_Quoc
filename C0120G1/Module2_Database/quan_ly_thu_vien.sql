drop database if exists quan_ly_thu_vien;
create database quan_ly_thu_vien;
use quan_ly_thu_vien;

create table loai_sach(
ten_loai_sach varchar(50) primary key,
vi_tri varchar(50) primary key
);
create table sach(
ma_sach int auto_increment primary key,
ten_sach varchar(50) not null,
nha_xuat_ban varchar(50) not null,
tac_gia varchar(50) not null,
nam_xuat_ban date not null,
so_lan_xuat_ban int not null,
gia double not null,
ten_loai_sach varchar(50),
foreign key (ten_loai_sach) references loai_sach (ten_loai_sach)
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
ngay_tra_sach date not null,
foreign key (ma_sach) references sach (ma_sach),
foreign key (ma_sinh_vien) references sinh_vien (ma_sinh_vien)

);