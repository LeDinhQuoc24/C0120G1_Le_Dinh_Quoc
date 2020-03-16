create database demo;
use demo;
create table productlines1(
productLine varchar(50) primary key,
textDescription text,
image varchar(50)
);
create table products1(
productCode varchar(15) primary key,
productName varchar(70) not null,
productScale varchar(10) not null,
productVendor varchar(50) not null,
productDescription text not null,
quantityInStock int(40) not null,
buyPrice double	not null,
MSRP double	not null,
productLine varchar(50),
foreign key(productLine) references productLines1(productLine)
);
create table offices1(
officeCode varchar(10) primary key,
city varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50) not null,
state varchar(50) not null,
country varchar(50) not null,
postalCode varchar(15) not null
);
create table employees1(
employeeNumber int(40) primary key,
lastName varchar(50) not null,
firstName varchar(50) not null,
email varchar(100) not null,
jobTitle varchar(50) not null,
reportTo int(40),
officeCode varchar(10),
salesRepEmployeeNumber int(40),
foreign key (officeCode) references offices1(officeCode),
foreign key (reportTo) references employees1(employeeNumber),
foreign key (salesRepEmployeeNumber) references employees1(employeeNumber)
);
create table customers1(
customerNumber int(40) primary key,
customeName varchar(50) not null,
contactLastName varchar(50) not null,
contactFirstName varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50),
city varchar(50) not null,
state varchar(50) not null,
postalCode varchar(15) not null,
country varchar(50) not null,
creditLimit double,
salesRepEmployeeNumber int(40)
);
create table orders1(
orderNumber int(40) primary key,
orderDate date not null,
requiredDate date not null,
shippedDate date not null,
status varchar(15) not null,
comments text,
quantityOrdered int(40) not null,
priceEach double not null,
customerNumber int(40),
foreign key (customerNumber) references customers1(customerNumber)
);
create table payments1(
customerNumber int(40) primary key,
checkNumber varchar(50) not null,
paymentDate date not null,
amount double not null,
foreign key (customerNumber) references customers1(customerNumber)
);
create table oderDetails1(
productCode varchar(15) not null,
ordernumber int(40) not null,
foreign key (productCode) references products1(productCode),
foreign key (ordernumber) references orders1(ordernumber)
);


