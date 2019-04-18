CREATE TABLE Reviewer
(
  EmailAddr       VARCHAR(150) NOT NULL,       
  FirstName            VARCHAR(150) NOT NULL,  
  AuthorFeedback          VARCHAR(150) NOT NULL, 
  LastName          VARCHAR(150) NOT NULL,     
  CommiteeFeedback          VARCHAR(150) NOT NULL, 
  PhoneNum          INT(150) NOT NULL, 
  Affiliation          VARCHAR(150) NOT NULL, 
  PRIMARY KEY     (EmailAddr)                 
);