use Banking;

SELECT NAME as 'Product', PRODUCT_TYPE_CD as 'Type' FROM product;

SELECT b.NAME as 'Branch Name', b.CITY as 'City', e.LAST_NAME as 'Last Name', e.TITLE as 'Title'
from branch as b
JOIN employee as e on b.BRANCH_ID = e.ASSIGNED_BRANCH_ID;

SELECT UNIQUE title FROM employee;

SELECT e.LAST_NAME as 'Last Name', e.TITLE as 'Title', z.Last_NAME as 'Superior Last Name', z.TITLE as 'Superior Title' from employee as e
LEFT JOIN employee as z on z.EMP_ID = e.SUPERIOR_EMP_ID;

SELECT p.NAME as 'Product Name', a.AVAIL_BALANCE as 'Available Balance', i.LAST_NAME 'Customer Last Name'
FROM account as a
JOIN product as p on a.PRODUCT_CD = p.PRODUCT_CD 
JOIN individual as i on i.CUST_ID = a.CUST_ID;

SELECT a.* FROM acc_transaction as t
JOIN account as a on a.ACCOUNT_ID = t.ACCOUNT_ID
JOIN individual as i on a.CUST_ID = i.CUST_ID
WHERE i.LAST_NAME LIKE 'T%'; 

