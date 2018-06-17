

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