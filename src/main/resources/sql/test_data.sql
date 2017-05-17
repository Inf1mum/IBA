INSERT INTO details (name, email, address) VALUES ('mkyong0', 'aaa@gmail.com','ul. Sovet, 3');

INSERT INTO invoice (status, date, details_id) VALUES ('Pending', to_date('2012-1-1', 'YYYY-MM-DD'), 0);
INSERT INTO invoice (status, date, details_id) VALUES ('Pending', to_date('2012-2-2', 'YYYY-MM-DD'), 0);

INSERT INTO good (goodName, cost,invoice_id) VALUES ('Book', 5,0);
INSERT INTO good (goodName, cost,invoice_id) VALUES ('Sofa', 155,0);
INSERT INTO good (goodName, cost,invoice_id) VALUES ('Book', 50,1);
INSERT INTO good (goodName, cost,invoice_id) VALUES ('Sofa', 130,1);
INSERT INTO good (goodName, cost,invoice_id) VALUES ('Book', 50,1);
INSERT INTO good (goodName, cost,invoice_id) VALUES ('Sofa', 30,1);