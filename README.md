# DatabaseAssignment

George Andy Mechalakos
CS 623
Prof. Brooks



Instructions on how to use SQL scripts

1. First and foremost, make sure your MYSQL service is up and running before proceeding. 

2. Open up the MYSQL 8.0 Command Line client, login with your password and create a new database with a name of your choice.
You can do this by using the following command : CREATE DATABASE nameofdatabase

3. To use the database you created type the following command : USE nameofdatabase

4. Navigate to the folder containing all of the SQL files you downloaded.

5. Run all of the SQL files with Create in their names.
 
How to run SQL Script in command line : source path to file/file.sql 
Here is an example of how to run a SQL script from the command line client : source C:/Users/andym/Desktop/SqlScripts/CreateScripts

6. Repeat step 5 but with the INSERT files from downloaded files

7. Check and verify that the database tables are populated and present by running the VerifyTables.SQL and  VerifyData.SQL files
respectively

# -----------------------------------------------------------------------------------------------------------------
# Description 
# -----------------------------------------------------------------------------------------------------------------
 This set of files are designed to be a MySQL implementation of exercise 3.34 paper review database. I opted to go
for a multiple file approach of 5 respective CREATE and INSERT scripts to implement the database. I also created
verification scripts for the purpose of checking the database to make sure it was populated with data properly.
