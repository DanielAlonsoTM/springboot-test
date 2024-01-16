-- Create the database
CREATE DATABASE test_db;

-- Switch to the newly created database
\c test_db;

-- Create a user and grant privileges
CREATE USER dev WITH PASSWORD 'dev';
GRANT ALL PRIVILEGES ON DATABASE test_db TO dev;

-- Create Schema
CREATE SCHEMA IF NOT EXISTS ayc AUTHORIZATION dev;

-- Create tables
CREATE TABLE IF NOT EXISTS ayc.commerce (
  id                BIGSERIAL     NOT NULL,
  commerce_rut      VARCHAR (15)  NOT NULL,
  commerce_name     VARCHAR (50)  NOT NULL,
  commerce_address  VARCHAR (60)  NOT NULL,
  creation_date     TIMESTAMP     NOT NULL DEFAULT NOW(),
  update_date       TIMESTAMP     NOT NULL DEFAULT NOW(),

  CONSTRAINT commerce_id_pk PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ayc.branch (
  id                BIGSERIAL     NOT NULL,
  commerce_id       INTEGER       NOT NULL,
  branch_address    VARCHAR (20)  NOT NULL,
  creation_date     TIMESTAMP     NOT NULL DEFAULT NOW(),
  update_date       TIMESTAMP     NOT NULL DEFAULT NOW(),

  CONSTRAINT branch_id_pk    PRIMARY KEY (id),
  CONSTRAINT commerce_id_fk  FOREIGN KEY (commerce_id) REFERENCES ayc.commerce(id)
);

CREATE TABLE IF NOT EXISTS ayc.terminal (
  id                      BIGSERIAL     NOT NULL,
  branch_id               INTEGER       NOT NULL,
  terminal_serial_number  VARCHAR (20)  NOT NULL,
  creation_date           TIMESTAMP     NOT NULL DEFAULT NOW(),
  update_date             TIMESTAMP     NOT NULL DEFAULT NOW(),

  CONSTRAINT terminal_id_pk  PRIMARY KEY (id),
  CONSTRAINT branch_id_fk    FOREIGN KEY (branch_id) REFERENCES ayc.branch(id)
);
