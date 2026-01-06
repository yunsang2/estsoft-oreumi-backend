-- SQLite
CREATE TABLE products (
    id              BIGINT NOT NULL,
    name            VARCHAR(20) NOT NULL,
    stock           INT DEFAULT 0,
    price           VARCHAR(20) NOT NULL,
    manufactuter    VARCHAR(20),

    PRIMARY KEY(id),
    CHECK(stock >= 0 AND stock <= 10000)
);
