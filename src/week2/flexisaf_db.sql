CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    address VARCHAR(100),
    occupation VARCHAR(50),
    created_date DATE DEFAULT CURRENT_DATE
);

INSERT INTO employee (firstname, lastname, address, occupation, created_date)
VALUES
    ('Usman', 'Yahaya Baba', 'Abuja', 'Backend Engineer', '2025-09-22'),
    ('Anas', 'Yakubu', 'Kaduna', 'Backend Engineer', '2025-09-22'),
    ('Mustapha', 'Sanusi', 'Zaria', 'Frontend Engineer', '2025-09-23');

--Updating an Employee's occupation
UPDATE employee
SET occupation = 'Surgeon'
WHERE id = 2;

-- Deleting an employee with ID
DELETE FROM employee
WHERE id = 1;




