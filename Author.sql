CREATE TABLE Author
(
  EmailAddr       VARCHAR(150) NOT NULL,       # Authors email addr
  firstname            VARCHAR(150) NOT NULL,  # Author Name
  LastName          VARCHAR(150) NOT NULL,     # Author Last Name
  PRIMARY KEY     (EmailAddr)                  # Assigning PK
);