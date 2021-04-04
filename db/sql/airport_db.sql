use airport_db;
create table pilots(
id int,
first_name varchar(150) not null,
last_name varchar(150) not null,
pilot_rank varchar(150) not null,
code_pilot varchar(150) unique not null,
primary key(id));

create table airplanes(
id int,
brand_planes varchar(100) not null,
model_planes varchar(150) not null,
capasity int,
check(capasity>=0),
board_number varchar(150)  unique not null,
primary key(id));

create table flights(
id int auto_increment,
airplane_id int,
foreign key (airplane_id) references airplanes(id),
pilot_id int,
foreign key(pilot_id) references pilots(id),
take_off_date date not null,
take_off_time time not null,
flight_number varchar(150) unique not null,
primary key(id));