DROP TABLE IF EXISTS iot.customer;

CREATE TABLE  iot.customer (
  CUST_ID Bigserial  PRIMARY KEY NOT NULL,
  NAME varchar(100) NOT NULL,
  AGE smallint NOT NULL
);
