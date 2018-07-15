
--Spring Security tables
CREATE  TABLE users (
  username character varying  NOT NULL ,
  password character varying  NOT NULL ,
  enabled integer NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username)
);
CREATE TABLE user_roles (
  user_role_id integer NOT NULL,
  username character varying NOT NULL REFERENCES users (username),
  role character varying  NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE (role,username) 
);

  
--Purchase register
  
create table vehicle_details(
id serial PRIMARY KEY,
vehicle_no character varying(20) not null,
weight_slip character varying(20) not null,
empty_weight numeric(10,3) not null,
load_weight numeric(10,3),
tare_weight numeric(10,3),
created_date TIMESTAMP,
updated_date TIMESTAMP,
retired boolean
);

create table purchase_adjustments(
id serial PRIMARY KEY,
bags_cost numeric(10,3),
weight_bridge_cost numeric(10,3),
kulli numeric(10,3),
misc_cost numeric(10,3),
labour_cost numeric(10,3)
);

create table product_type(
type character varying(20) PRIMARY KEY,
retired boolean
);



create table purchase_register(
id serial PRIMARY KEY,
sno character varying(20) not null,
vehicle_id integer UNIQUE  REFERENCES Vehicle_details (id),
aasami_name character varying(30) not null,
broker_name character varying(30) ,
product_name character varying(20) not null REFERENCES product_type(type) ,
bags_count numeric,
quantity numeric,
quantity_unit character varying(10) not null,
price_per_quintals numeric(7,3),
purcahse_adj_id integer REFERENCES purchase_adjustments (id),
final_settlement numeric(10,3),
status character varying(10) not null, 
created_date TIMESTAMP,
updated_date TIMESTAMP,
retired boolean
);