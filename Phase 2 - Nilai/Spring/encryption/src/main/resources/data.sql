insert into users (username, password, enabled) values ('bob', '$2a$10$bTUrchitgkU509GfOM3QYe/uMnbInWFJCJ.YHBrlLkPgMmbfPKaQ6', true);
insert into authorities (username, authority) values ('bob', 'ROLE_USER');

insert into users (username, password, enabled) values ('sara', '$2a$10$8gAyO9msfPO4ehZN1GMtxO6VvIAuhfVSMOP..IB/cuWtJEtqsHkv2',true);
insert into authorities (username, authority) values ('sara', 'ROLE_ADMIN');