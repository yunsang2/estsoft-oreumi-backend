-- SQLite
CREATE TABLE orders (
    id              BIGINT NOT NULL,
    customer_id     INT,
    product_id      INT,
    quantity        INT NOT NULL,
    address         VARCHAR(250) NOT NULL,
    ordered_at      DATETIME,
    
    PRIMARY KEY(id),
    FOREIGN KEY (customer_id) REFERENCES customers(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);
