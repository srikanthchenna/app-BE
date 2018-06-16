
CREATE  TABLE users (
  username character varying  NOT NULL ,
  password character varying  NOT NULL ,
  enabled integer NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));
  
  
CREATE TABLE user_roles (
  user_role_id integer NOT NULL,
  username character varying NOT NULL REFERENCES users (username),
  role character varying  NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE (role,username) );