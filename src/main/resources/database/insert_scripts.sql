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