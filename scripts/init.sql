-- Create the database
CREATE DATABASE test_db;

-- Switch to the newly created database
\c test_db;

-- Create a user and grant privileges
CREATE USER dev WITH PASSWORD 'dev';
GRANT ALL PRIVILEGES ON DATABASE test_db TO dev;
