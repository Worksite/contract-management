--liquibase formatted sql

--changeset timols:1
CREATE TABLE contracts (
  id               INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  project_id       INT,
  code             VARCHAR(100)                   NOT NULL,
  description      TEXT,
  vendor           TEXT,
  percent_complete NUMERIC                        NOT NULL DEFAULT 0,
  budget           NUMERIC                        NOT NULL DEFAULT 0,
  paid             NUMERIC                        NOT NULL DEFAULT 0,
  forecast         NUMERIC                        NOT NULL DEFAULT 0,
  committed        NUMERIC                        NOT NULL DEFAULT 0,
  created_at       TIMESTAMP AS CURRENT_TIMESTAMP NOT NULL
);

INSERT INTO contracts (code, description, vendor, percent_complete, budget, paid, forecast, committed) VALUES ('CON-001', 'Contract 1', 'ACME Inc', 0.0, 10000.0, 0, 10000.0, 10000.0);
INSERT INTO contracts (code, description, vendor, percent_complete, budget, paid, forecast, committed) VALUES ('CON-002', 'Contract 2', 'ACME Inc', 0.0, 10000.0, 0, 10000.0, 10000.0);
INSERT INTO contracts (code, description, vendor, percent_complete, budget, paid, forecast, committed) VALUES ('CON-003', 'Contract 3', 'ACME Inc', 0.0, 10000.0, 0, 10000.0, 10000.0);
INSERT INTO contracts (code, description, vendor, percent_complete, budget, paid, forecast, committed) VALUES ('CON-004', 'Contract 4', 'ACME Inc', 0.0, 10000.0, 0, 10000.0, 10000.0);

--rollback DROP TABLE contracts;
