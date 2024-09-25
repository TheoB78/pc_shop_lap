drop database if exists pc_shop;
create database pc_shop;
use pc_shop;

create table pc (
id int not null auto_increment,
pc_name varchar(255) not null,
base_price decimal(10, 2) not null,
ram int not null,
processor varchar(255) not null,
pc_memory int not null,
image_path varchar(255),
primary key (id)
);

insert into pc
(pc_name, base_price, ram, processor, pc_memory, image_path)
values
("Home Basis", 599.99, 8, "i5", 500, "home_basis.jpg"),
("Home Pro", 799.99, 8, "i7", 500, "home_pro.jpg"),
("Home Chef", 999, 40, "i9", 500, "home_chef.jpg");

create table addition (
id int not null auto_increment,
addition_name varchar(255) not null,
price decimal(10, 2),
primary key (id)
);

insert into addition
(addition_name, price)
values
("Grafikkarte", 89),
("1TB SSD", 99),
("8 GB Ram", 59);

create table reseller (
id int not null auto_increment,
reseller_name varchar(255) not null,
primary key (id)
);

insert into reseller
(reseller_name)
values
("PC Händler"),
("Media Markt"),
("Toms Elektrohaus"),
("Feste Platten");

create table shipment (
id int not null auto_increment,
reseller_id int not null,
date date not null,
primary key (id),
foreign key (reseller_id) references reseller(id)
);

insert into shipment
(reseller_id, date)
values
(1, "2024-06-12"),
(1, "2024-07-22"),
(1, "2024-06-02"),
(2, "2024-07-12"),
(2, "2024-03-08"),
(2, "2024-04-25"),
(3, "2024-04-05"),
(3, "2024-08-17"),
(3, "2024-07-29");

select * from shipment;

create table shipment_item (
id int not null auto_increment,
shipment_id int not null,
pc_id int not null,
quantity int not null,
primary key (id),
foreign key (pc_id) references pc(id),
foreign key (shipment_id) references shipment(id)
);

insert into shipment_item
(shipment_id, pc_id, quantity)
values
(1, 1, 19),
(1, 1, 10),
(4, 3, 5),
(4, 2, 10),
(9, 2, 20),
(9, 3, 15);

select * from shipment_item;

create table shipment_item2addition(
addition_id int not null,
shipment_item_id int not null,
primary key (addition_id, shipment_item_id),
foreign key (addition_id) references addition(id),
foreign key (shipment_item_id) references shipment_item(id)
);

insert into shipment_item2addition
(addition_id, shipment_item_id)
values
(1, 2),
(2, 3),
(1, 3),
(2, 6);

select * from shipment_item2addition;


