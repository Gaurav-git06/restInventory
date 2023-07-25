CREATE TABLE IF NOT EXISTS guitar
(
 id bigserial NOT NULL,
 serial_number character varying(40) NOT NULL UNIQUE,
 price double precision,
 builder character varying(20) NULL DEFAULT NULL,
 type character varying(20) NULL DEFAULT NULL,
 back_wood character varying(20) NULL DEFAULT NULL,
 top_wood character varying(20) NULL DEFAULT NULL,
 PRIMARY KEY (id)
);