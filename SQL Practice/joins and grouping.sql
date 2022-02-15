use classicmodels;

SELECT c.customerName as 'Customer Name', CONCAT(e.firstName," ", e.LastName) as 'Sales Rep'
FROM customers as c
JOIN employees as e on c.salesRepEmployeeNumber = e.employeeNumber
ORDER BY customerName;

SELECT p.productName as 'Product Name', SUM(quantityOrdered) as 'Total # Ordered', SUM(o.quantityOrdered * o.priceEach) as 'Total Sale'
FROM products as p
JOIN orderdetails as o on p.productCode = o.productCode
GROUP BY p.productName
ORDER BY 'Total Sale' DESC;


SELECT o.status as 'Status', d.quantityordered as '# Orders'
FROM orders as o
JOIN orderdetails as d on o.orderNumber = d.orderNumber 
GROUP BY status;

SELECT p.productLine as "Product Line", d.quantityOrdered as "# Sold"
FROM products as p
JOIN orderdetails as d on p.productCode = d.productCode
GROUP BY p.productLine
ORDER BY 2 DESC;

SELECT CONCAT(e.lastName, ", ", e.firstName) as "Sales Rep", SUM(d.quantityOrdered) as "# Orders",
	if (SUM(d.quantityOrdered) IS NULL, 0.00, SUM(d.quantityOrdered * d.priceEach)) as "Total Sales"
FROM employees as e
LEFT JOIN customers as c on e.employeeNumber = c.salesRepEmployeeNumber
LEFT JOIN orders as o on c.customerNumber = o.customerNumber
LEFT JOIN orderdetails as d on o.orderNumber = d.orderNumber
WHERE e.jobTitle = "Sales Rep"
GROUP BY e.employeeNumber
ORDER BY SUM(d.quantityOrdered * d.priceEach) DESC;

SELECT MONTHNAME(p.paymentDate) as "Month", YEAR(p.paymentDate) as "Year",
	format (SUM(p.amount), 2) as "Payments Received"
FROM payments as p
GROUP BY 2, 1
ORDER BY paymentDate; 


