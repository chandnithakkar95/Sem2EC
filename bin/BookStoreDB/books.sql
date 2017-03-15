DROP TABLE books;
CREATE TABLE books (
  isbn varchar(10),
  title varchar(50),
  price numeric(10,2),
  stock int
)

INSERT INTO books VALUES('1001', 'Database Systems', 450, 10 );
INSERT INTO books VALUES('1002', 'Object Oriented Design and Patterns', 339,8);
INSERT INTO books VALUES('1003', 'Core J2EE™ Patterns', 2250, 2);
INSERT INTO books VALUES('1004', 'Big Java', 450, 3);