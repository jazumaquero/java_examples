

-- Distinct example
SELECT DISTINCT(names) from my_table;

-- Insert example
INSERT OVERWRITE INTO my_table (name, city, age, salary) VALUES ("Foo","Malaga",2,200);

-- INNER Join example
SELECT *
FROM my_table
JOIN my_other_table
ON my_table.name = my_other_table.name;