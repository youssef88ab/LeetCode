SELECT customer_id , count(customer_id) as count_no_trans
FROM Visits 
LEFT JOIN Transactions ON Transactions.visit_id = Visits.visit_id  
WHERE Transactions.transaction_id is null
GROUP BY customer_id
