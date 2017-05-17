create table details (
id INTEGER IDENTITY PRIMARY KEY,
name VARCHAR(45),
email VARCHAR(45),
address VARCHAR(45)
);

create table invoice (
id INTEGER IDENTITY PRIMARY KEY,
status VARCHAR(45),
date DATE,
details_id INTEGER,
FOREIGN KEY (details_id) REFERENCES details (id)
);

create table good (
id INTEGER IDENTITY PRIMARY KEY,
goodName VARCHAR(45),
cost INTEGER,
invoice_id INTEGER,
FOREIGN KEY (invoice_id) REFERENCES invoice (id)
);



