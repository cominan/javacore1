CREATE TABLE user (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(500),
    enable BOOLEAN
);
CREATE TABLE authorities (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    FOREIGN KEY (username) REFERENCES user(username) ON DELETE CASCADE
);
