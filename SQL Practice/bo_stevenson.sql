USE classicmodels;

SELECT productName, productLine, buyPrice FROM products;

SELECT contactFirstName, contactLastName, city FROM customers WHERE country ="Germany";

SELECT UNIQUE DISTINCT status FROM orders;

SELECT * FROM payments WHERE paymentDate >= '2005-01-01' ORDER BY paymentDate ASC ;

SELECT lastName, firstName, email, jobTitle FROM employees WHERE officeCode = 1 ORDER BY lastName ASC;

SELECT productName, productLine, productScale, productVendor FROM products 
WHERE productLine = "Classic Cars" OR productLine = "Vintage Cars"
ORDER BY productName ASC;





