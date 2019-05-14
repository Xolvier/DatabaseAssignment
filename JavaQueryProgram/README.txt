-------------------------------------------------
George Andy Mechalakos---------------------------
CS 623 Prof. Brooks------------------------------


LINK TO SCREENCAST OF ME USING THE PROGRAM - https://www.youtube.com/watch?v=c14jOdovd-A&feature=youtu.be

HOW TO USE JAVA QUERY PROGRAM

NOTE : BEFORE DOING THESE STEPS MAKE SURE YOU'VE INSTALLED THE JDBC_DRIVER
AND LOADED IT INTO AN ECLIPSE PROJECT

1. First thing you need to do in order to use this SQL query program
is to setup the database with the SQL files I have provided. Please
go to the UPDATED_SQL_FILES folder and install all the provided SQL
files to your database. Refer to the main readme on how to install
the files.

2. After all the files are installed to your database, take note
of your databases name, your username and password.

3. Download PaperReviewDriver.java and open the file in eclipse.

4. You will want to edit the following lines of code

  static final String DataBaseURL = "jdbc:mysql://localhost/YOUR DATABASE NAME"; 
  static final String USERNAME = ""YOUR DATABASE USERNAME"; 
  static final String PASSWORD = "YOUR DATABASE PASSWORD";

5. Assuming you have completed all the steps above, running the program should print
out all the requested querys of the assignment


DESCRIPTION OF PROGRAM -

The program is comprised of a number of methods in order to perform the queries.

getPaperCount() - Prints the number of paper rows in the database

createPaperandAuthor() - Adds entries to both the paper and author tables with your desired parameters

deleteAuthor() - Deletes the first entry in the author table

printAuthor() - prints author table

printPaper() - prints paper table

getReviews() - fetches all reviews with a given ID and prints them if they are recommended

getAuthorDetails() - prints an author and paper submission as one row.  