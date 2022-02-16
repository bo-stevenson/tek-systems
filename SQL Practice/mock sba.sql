use mock_sba_db;

-- Question 1

SELECT u.USER_ID, s.STORE_ID, o.ORDER_ID, oi.QUANTITY FROM order_items as oi
JOIN orders as o on oi.ORDER_ID = o.ORDER_ID
JOIN users as u on u.USER_ID = o.USER_ID
JOIN stores as s on s.STORE_ID = o.STORE_ID
WHERE u.FIRST_NAME = "Marion"
GROUP BY o.ORDER_ID;

-- Question 2

SELECT * FROM users
WHERE USER_ID NOT IN (SELECT USER_ID FROM orders);

-- QUESTION 3

SELECT * FROM items as i
JOIN order_items as oi on i.ITEM_ID = oi.ITEM_ID
GROUP BY i.ITEM_ID
	HAVING COUNT(oi.ORDER_ID) > 1;

-- QUESTION 4

SELECT o.ORDER_ID, i.NAME, i.PRICE, oi.QUANTITY FROM items as i
JOIN order_items as oi on i.ITEM_ID = oi.ITEM_ID
JOIN orders as o on oi.ORDER_ID = o.ORDER_ID
JOIN stores as s on o.STORE_ID = s.STORE_ID
WHERE s.CITY = "New York"
ORDER BY ORDER_ID ASC;

-- QUESTION 5

SELECT i.NAME as 'ITEM_NAME', SUM(i.PRICE * oi.QUANTITY) as "REVENUE"
FROM items as i
JOIN order_items as oi on i.ITEM_ID = oi.ITEM_ID
GROUP BY i.ITEM_ID 
ORDER BY "REVENUE";

-- QUESTION 6

SELECT s.NAME, COUNT(o.ORDER_ID) as "ORDER_QUANTITY",
 (CASE
 	WHEN COUNT(o.ORDER_ID) > 3 THEN "High"
 	WHEN COUNT(o.ORDER_ID) > 1 AND COUNT(o.ORDER_ID <= 3) THEN "Medium"
 	ELSE "Low"
 END) AS "SALES_FIGURE"
FROM stores as s
JOIN orders as o on s.STORE_ID = o.STORE_ID 
GROUP BY s.NAME 
ORDER BY COUNT(o.ORDER_ID) DESC;
