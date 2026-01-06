-- SQLite
CREATE TABLE customers (
    id              BIGINT NOT NULL,
    name            VARCHAR(50) NOT NULL,
    age             INT CHECK (age >= 0),
    rank            VARCHAR(20) NOT NULL,
    occupation      VARCHAR(50),
    saving          INT DEFAULT 0,

    PRIMARY KEY(id)
);
