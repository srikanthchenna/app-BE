INSERT INTO users(username,password,enabled)
VALUES ('srikanth','srikanth', 1);
INSERT INTO users(username,password,enabled)
VALUES ('sandeep','sandeep', 1);
INSERT INTO users(username,password,enabled)
VALUES ('raghu','raghu', 1);
INSERT INTO users(username,password,enabled)
VALUES ('vishnu','vishnu', 1);


INSERT INTO user_roles (user_role_id,username, role)
VALUES (1,'srikanth', 'ROLE_USER');
INSERT INTO user_roles (user_role_id,username, role)
VALUES (2,'srikanth', 'ROLE_ADMIN');
INSERT INTO user_roles (user_role_id,username, role)
VALUES (3,'sandeep', 'ROLE_USER');

insert into product_type(type,retired) values('Paddy',false);
insert into product_type(type,retired) values('Rice',false);
insert into product_type(type,retired) values('Bran',false);
insert into product_type(type,retired) values('Husk',false);
insert into product_type(type,retired) values('Broken Rice',false);

insert into vehicle_details(vehicle_no,weight_slip,empty_weight,load_weight,tare_weight,created_date,updated_date,retired) 
	values('TS 05 AA 1234','1',100,150,50,current_date,current_date,false);
insert into vehicle_details(vehicle_no,weight_slip,empty_weight,load_weight,tare_weight,created_date,updated_date,retired) 
	values('TS 05 AB 1234','1',101,150,49,current_date,current_date,false);
insert into vehicle_details(vehicle_no,weight_slip,empty_weight,load_weight,tare_weight,created_date,updated_date,retired) 
	values('TS 05 AC 1234','1',102,150,48,current_date,current_date,false);
insert into vehicle_details(vehicle_no,weight_slip,empty_weight,load_weight,tare_weight,created_date,updated_date,retired) 
	values('TS 05 AD 1234','1',103,250,147,current_date,current_date,false);
insert into vehicle_details(vehicle_no,weight_slip,empty_weight,load_weight,tare_weight,created_date,updated_date,retired) 
	values('TS 05 AE 1234','1',104,200,96,current_date,current_date,false);
	
insert into purchase_adjustments(bags_cost,weight_bridge_cost,kulli,misc_cost,labour_cost) values(10,100,100,200,1000);
insert into purchase_adjustments(bags_cost,weight_bridge_cost,kulli,misc_cost,labour_cost) values(10,100,200,250,1100);
insert into purchase_adjustments(bags_cost,weight_bridge_cost,kulli,misc_cost,labour_cost) values(10,150,300,300,1200);
insert into purchase_adjustments(bags_cost,weight_bridge_cost,kulli,misc_cost,labour_cost) values(10,100,400,350,1300);
insert into purchase_adjustments(bags_cost,weight_bridge_cost,kulli,misc_cost,labour_cost) values(10,200,500,500,1400);


insert into purchase_register(sno,vehicle_id,aasami_name,broker_name,product_name,bags_count,quantity,quantity_unit,price_per_quintals,
purcahse_adj_id,final_settlement,status,created_date,updated_date,retired) 
values('1',1,'srikanth','vishnu','Paddy',100,50,'Quintals',1500,1,75000,'Purchased',current_date,current_date,false);
insert into purchase_register(sno,vehicle_id,aasami_name,broker_name,product_name,bags_count,quantity,quantity_unit,price_per_quintals,
purcahse_adj_id,final_settlement,status,created_date,updated_date,retired) 
values('1',2,'sandeep','vishnu','Paddy',110,55,'Quintals',1500,2,82500,'Purchased',current_date,current_date,false);
insert into purchase_register(sno,vehicle_id,aasami_name,broker_name,product_name,bags_count,quantity,quantity_unit,price_per_quintals,
purcahse_adj_id,final_settlement,status,created_date,updated_date,retired) 
values('1',3,'raghu','vishnu','Paddy',120,60,'Quintals',1500,3,90000,'Purchased',current_date,current_date,false);
insert into purchase_register(sno,vehicle_id,aasami_name,broker_name,product_name,bags_count,quantity,quantity_unit,price_per_quintals,
purcahse_adj_id,final_settlement,status,created_date,updated_date,retired) 
values('1',4,'rahul','vishnu','Paddy',130,50,'Quintals',1500,4,150000,'Purchased',current_date,current_date,false);
insert into purchase_register(sno,vehicle_id,aasami_name,broker_name,product_name,bags_count,quantity,quantity_unit,price_per_quintals,
purcahse_adj_id,final_settlement,status,created_date,updated_date,retired) 
values('1',5,'suman','vishnu','Paddy',140,50,'Quintals',1500,5,150000,'Purchased',current_date,current_date,false);