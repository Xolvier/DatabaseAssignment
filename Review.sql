CREATE TABLE Review
(
  Id       INT(150) NOT NULL,       
  Recommendation    VARCHAR(150) NOT NULL,
  MeritScore    INT(150) NOT NULL,
  PaperID   INT(150) NOT NULL,
  ReadabilityScore    INT(150) NOT NULL,
  ReviewerID    INT(150) NOT NULL,
  OriginalityScore    INT(150) NOT NULL,
  RelevanceScore    INT(150) NOT NULL,
  PRIMARY KEY     (Id)                 
);