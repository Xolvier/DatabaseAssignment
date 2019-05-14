CREATE TABLE Author
(
  EmailAddr       VARCHAR(100) NOT NULL,       
  FirstName            VARCHAR(50),  
  LastName          VARCHAR(50),    
  ROWID             INT(50),
  PRIMARY KEY     (EmailAddr)                  
);