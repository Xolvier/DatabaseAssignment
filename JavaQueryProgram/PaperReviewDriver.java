
import java.io.IOException;
import java.sql.*;
public class PaperReviewDriver {
//CS 623 DATABASE MANAGEMENT SYSTEMS
//PROGRAM BY GEORGE ANDY MECHALAKOS
	
	
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  //DRIVER LOCATION
	   static final String DataBaseURL = "jdbc:mysql://localhost/JavaAppV2"; //ENTER NAME OF DATABASE
	   static final String USERNAME = "root"; //ENTER YOUR DB USERNAME
	   static final String PASSWORD = "add43t2fefWEFWa"; //ENTER YOUR DBPASSWORD
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		    Connection connect = null;
		    Statement state = null;

        	System.out.println("EXECUTING SQL QUERYS");
        	System.out.println("--------------------");
        	System.out.println("-----RESULTS--------");
        	System.out.println("--------------------");
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    //*******************************************
		    //FETCHES ALL REVIEWS THAT ARE RECOMMENDED***
		    //*******************************************
		    getReviews(connect,state,"2");
		    //*************************************************
		    //FETCHES AUTHOR INFORMATION AND PAPER INFORMATION*
		    //*************************************************
            getAuthorDetails(connect, state, "John293@gmail.com");
            //*******************************************
            //FETCHES NUMBER OF PAPERS SUBMITTED*********
            //*******************************************
		    getPaperCount(connect, state);
		    //********************************************************
		    //CREATES PAPER AND AUTHOR ENTRIES INTO RESPECTIVE TABLES*
		    //********************************************************
		    createPaperandAuthor(connect, state, "adv3@gmail.com", "Max", "Doe", "8", "Wowzer Paper", "asdsadadasddd", "InterestdingPaper" );
		    printPaper(connect, state);	
		    printAuthor(connect, state);	
		    //*******************************************
		    //DELETES FIRST ROW IN AUTHOR TABLE**********
		    //*******************************************
		    deleteAuthor(connect, state);
		    printAuthor(connect, state);	  
		   
	
	}
            
	static void getPaperCount(Connection cn, Statement st) {
		 try {
		      cn = DriverManager.getConnection(DataBaseURL,USERNAME,PASSWORD);
		      st = cn.createStatement();
		      String statement;
		      statement = "SELECT COUNT(*) AS paperCount FROM Paper";		      			      
		      ResultSet DATA = st.executeQuery(statement);		     
		      while(DATA.next()){	
		      System.out.println("---------------getPaperCount-------------------");
		      System.out.println("Number of Papers : " + DATA.getInt("paperCount"));
		      System.out.println("-----------------------------------------------");
		      }
		      
		      DATA.close();
		      st.close();
		      cn.close();
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(st!=null)
		            st.close();
		      }catch(SQLException se2){

		      try{
		         if(cn!=null)
		            cn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }

		   }
}
	
	
	
	static void createPaperandAuthor(Connection cn, Statement st, String EmailAddr, String FirstName, String LastName,String ID, String Title, String Abstract, String FileName) {
		 try {
		      cn = DriverManager.getConnection(DataBaseURL,USERNAME,PASSWORD);
		      st = cn.createStatement();
		      String statement;
		      statement = "INSERT INTO Author (EmailAddr, FirstName, LastName, RowID) VALUES ('"+ EmailAddr + "','"+ FirstName + "','"+ LastName + "',"+ ID + ")";
		      st.executeUpdate(statement);	
		      statement =  "INSERT INTO Paper ( Id, Title, Abstract, FileName) VALUES ("+ ID + ",'"+ Title + "','"+ Abstract + "','"+ FileName + "');";
		      st.executeUpdate(statement);	
		      
		      statement = "SELECT * FROM Author;";
		      
	      		
		      ResultSet DATA = st.executeQuery(statement);		
		      
		      
		      st.close();
		      cn.close();
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(st!=null)
		            st.close();
		      }catch(SQLException se2){

		      try{
		         if(cn!=null)
		            cn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		   System.out.println("Paper and Author values inserted!");
		   }
}

	static void deleteAuthor(Connection cn, Statement st) {
		 try {
		      cn = DriverManager.getConnection(DataBaseURL,USERNAME,PASSWORD);
		      st = cn.createStatement();
		      String statement;
		      statement = "DELETE FROM Author LIMIT 1";
		      st.executeUpdate(statement);	
		    		      		      		     	     		     
		      st.close();
		      cn.close();
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(st!=null)
		            st.close();
		      }catch(SQLException se2){

		      try{
		         if(cn!=null)
		            cn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		   }
		 System.out.println("---------------deleteAuthor()------------------");
		 System.out.println("DELETED FIRST ROW IN AUTHORS");
		 System.out.println("-----------------------------------------------");
}
    static void printAuthor(Connection cn, Statement st) {
		 try {
		      cn = DriverManager.getConnection(DataBaseURL,USERNAME,PASSWORD);
		      st = cn.createStatement();
		      String statement;
		      
		   
		      
		      
		      statement = "SELECT * FROM Author;";
		      	
		      		
		      ResultSet DATA = st.executeQuery(statement);		
		         System.out.println("-------------------------------------");
		    	 System.out.println("--------printAuthor()----------------");
		      while(DATA.next()){		
		    	  String FN = DATA.getString("FirstName");		         
			         System.out.println("FirstName: " + FN);
			         String LastName = DATA.getString("LastName");		         
			         System.out.println("LastName: " + LastName);
			         String EA = DATA.getString("EmailAddr");		         
			         System.out.println("Email Address: " + EA);
		         System.out.println("");
		         System.out.println("-------------------------------------");
		      }
		      
		      DATA.close();
		      st.close();
		      cn.close();
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(st!=null)
		            st.close();
		      }catch(SQLException se2){

		      try{
		         if(cn!=null)
		            cn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		   }
    }
    static void printPaper(Connection cn, Statement st) {
		 try {
		      cn = DriverManager.getConnection(DataBaseURL,USERNAME,PASSWORD);
		      st = cn.createStatement();
		      String statement;
		      
		   
		      
		      
		      statement = "SELECT * FROM Paper";
		      	
		      		
		      ResultSet DATA = st.executeQuery(statement);		  
		         System.out.println("-------------------------------------");
		    	 System.out.println("--------printPaper()-----------------");
		      while(DATA.next()){				  
		    	 System.out.println("-------------------------------------");
		         String PaperTitle = DATA.getString("Title");		         
		         System.out.println("Title: " + PaperTitle);
		         String ID = DATA.getString("Id");		         
		         System.out.println("Paper ID: " + ID);
		         String _abstract = DATA.getString("Abstract");		         
		         System.out.print("Abstract: " + _abstract);
		         System.out.println("");
		         System.out.println("-------------------------------------");
		      }
		      
		      DATA.close();
		      st.close();
		      cn.close();
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(st!=null)
		            st.close();
		      }catch(SQLException se2){

		      try{
		         if(cn!=null)
		            cn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		   }
     }
    
    
	static void getReviews(Connection cn, Statement st, String id) {
		 try {
		      cn = DriverManager.getConnection(DataBaseURL,USERNAME,PASSWORD);
		      st = cn.createStatement();
		      String statement;
		      statement = "SELECT * FROM Review WHERE PaperId =" + id + "";
		      	
		      //Searches through recommendations and outputs when the recommendation column is not empty
		      
		      ResultSet DATA = st.executeQuery(statement);		     
		      while(DATA.next() && DATA.getString("Recommendation") != ""){	
		    	 System.out.println("-------------------------------------");
		    	 System.out.println("----------getReviews()---------------");
		         String Id = DATA.getString("Id");		         
		         System.out.println("ID: " + Id);
		         String Recommendation = DATA.getString("Recommendation");		         
		         System.out.println("Recommendation: " + Recommendation);
		         String MeritScore = DATA.getString("MeritScore");		         
		         System.out.println("MeritScore: " + MeritScore);
		         String PaperID = DATA.getString("PaperID");		         
		         System.out.println("PaperID: " + PaperID);
		         String ReadabilityScore = DATA.getString("ReadabilityScore");		         
		         System.out.println("ReadabilityScore: " + ReadabilityScore);
		         String ReviewerID = DATA.getString("ReviewerID");		         
		         System.out.println("ReviewerID: " + ReviewerID);
		         String OriginalityScore = DATA.getString("OriginalityScore");		         
		         System.out.println("OriginalityScore: " + OriginalityScore);
		         String RelevanceScore = DATA.getString("RelevanceScore");		         
		         System.out.println("RelevanceScore: " + RelevanceScore);
		         System.out.println("-------------------------------------");
		      }
		      
		      DATA.close();
		      st.close();
		      cn.close();
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(st!=null)
		            st.close();
		      }catch(SQLException se2){

		      try{
		         if(cn!=null)
		            cn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		   }
}
	
	static void getAuthorDetails(Connection cn, Statement st, String authorEmail) {
		 try {
		      cn = DriverManager.getConnection(DataBaseURL,USERNAME,PASSWORD);
		      st = cn.createStatement();
		      String statement;
		      
		   
		      
		      
		      statement = "SELECT * FROM Paper INNER JOIN Author ON Paper.Id = Author.RowID WHERE EmailAddr ='"+ authorEmail +"';";
		      	
		      		
		      ResultSet DATA = st.executeQuery(statement);		     
		      while(DATA.next()){		
		    	 System.out.println("-------------------------------------");
		    	 System.out.println("--------getAuthorDetails()-----------");
		         String FN = DATA.getString("FirstName");		         
		         System.out.println("FirstName: " + FN);
		         String LastName = DATA.getString("LastName");		         
		         System.out.println("LastName: " + LastName);
		         String EA = DATA.getString("EmailAddr");		         
		         System.out.println("Email Address: " + EA);
		         String PaperTitle = DATA.getString("Title");		         
		         System.out.println("Title: " + PaperTitle);
		         String ID = DATA.getString("Id");		         
		         System.out.println("Paper ID: " + ID);
		         String _abstract = DATA.getString("Abstract");		         
		         System.out.print("Abstract: " + _abstract);
		         System.out.println("");
		         System.out.println("-------------------------------------");
		      }
		      
		      DATA.close();
		      st.close();
		      cn.close();
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(st!=null)
		            st.close();
		      }catch(SQLException se2){

		      try{
		         if(cn!=null)
		            cn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		   }
}}
