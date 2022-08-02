CREATE TABLE IF NOT EXISTS department (
 id  bigserial NOT NULL PRIMARY KEY,
 name varchar(20)
);

ALTER TABLE employee ADD department int;
