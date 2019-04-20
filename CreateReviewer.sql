CREATE TABLE Reviewer
(
  EmailAddr       VARCHAR (100) NOT NULL,       
  FirstName            VARCHAR (100),  
  AuthorFeedback          VARCHAR (500), 
  LastName          VARCHAR (100),     
  CommiteeFeedback          VARCHAR (500), 
  PhoneNum          INT, 
  Affiliation          VARCHAR (50), 
  PRIMARY KEY     (EmailAddr)                 
);