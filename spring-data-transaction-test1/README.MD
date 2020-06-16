
# postgresql data base

CREATE DATABASE test;

create table foo (
	id SERIAL primary key,
	name varchar
);

---OU---

CREATE SEQUENCE foo_id_seq;

create table foo (
	id int primary key NOT NULL DEFAULT nextval('foo_id_seq'),
	name varchar
);

ALTER SEQUENCE foo_id_seq OWNED BY foo.id;

----