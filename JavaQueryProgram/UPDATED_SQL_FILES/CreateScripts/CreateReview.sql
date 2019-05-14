CREATE TABLE Review
(
  Id       INT NOT NULL,       
  Recommendation    VARCHAR (1000),
  MeritScore    INT,
  PaperID   INT,
  ReadabilityScore    INT,
  ReviewerID    INT,
  OriginalityScore    INT,
  RelevanceScore    INT,
  PRIMARY KEY     (Id)             
);