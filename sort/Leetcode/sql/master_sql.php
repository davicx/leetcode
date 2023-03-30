<?php
//SELECT
"SELECT * FROM Customers;"

//Select Distinct
"SELECT DISTINCT Country FROM Customers;"

//Select Distinct with Count
"SELECT COUNT(DISTINCT Country) FROM Customers;"

//WHERE
"SELECT * FROM Customers WHERE CustomerID=1;"

//Filter
"AND OR NOT"

//Order By
"SELECT * FROM Customers ORDER BY Country;" 

//Limit 
"SELECT * FROM Customers LIMIT 3;"

//Max or Min
"SELECT MIN(Price) AS SmallestPrice FROM Products;"

//Count, Avg, Sum
"SELECT AVG(Price) FROM Products;"

//Patterns
"SELECT * FROM Customers WHERE CustomerName LIKE 'a%';"

//INSERT
//Insert Into
"INSERT INTO Customers (CustomerName, City, Country) VALUES ('Cardinal', 'Stavanger', 'Norway');"

//Null Values
"SELECT CustomerName, ContactName, Address FROM Customers WHERE Address IS NULL;"

//UPDATE
"UPDATE Customers SET ContactName = 'Alfred Schmidt', City= 'Frankfurt' WHERE CustomerID = 1;"

//INNER JOIN
"SELECT friends.user_name, friends.friend_user_name, friends.friend_id, friends.request_pending, user_login.user_name, 
			user_login.user_id, user_login.account_deleted
			FROM user_login INNER JOIN friends
			ON user_login.user_name = friends.friend_user_name
			WHERE friends.user_name = '$userName'
			AND friends.request_pending = 0
			AND user_login.account_deleted = 0"
			
//UNION Combine Two or More Queries
"SELECT City FROM Customers
UNION
SELECT City FROM Suppliers 
ORDER BY City;"

//GROUP BY
"SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country;"

//HAVING
"SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country
HAVING COUNT(CustomerID) > 5;"

//EXISTS
"SELECT SupplierName
FROM Suppliers
WHERE EXISTS (SELECT ProductName FROM Products WHERE Products.SupplierID = Suppliers.supplierID AND Price < 20);"

//ANY and ALL
//Any returns true if any subqueries met
//All returns true if all subqueries met
"SELECT ProductName
FROM Products
WHERE ProductID = ANY
  (SELECT ProductID
  FROM OrderDetails
  WHERE Quantity = 10);"

//CASE
"SELECT OrderID, Quantity,
CASE
    WHEN Quantity > 30 THEN 'The quantity is greater than 30'
    WHEN Quantity = 30 THEN 'The quantity is 30'
    ELSE 'The quantity is under 30'
END AS QuantityText
FROM OrderDetails;"

?>

