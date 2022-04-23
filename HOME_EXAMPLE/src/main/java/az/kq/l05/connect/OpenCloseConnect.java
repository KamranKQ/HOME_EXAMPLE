package az.kq.l05.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import az.kq.l04.entity.Masin;

public class OpenCloseConnect{
	
	public static final String connJDBS = "jdbc:mysql://localhost/java_lesson_kq";
    public static final String connUser = "root";
    public static final String connPass = "root";
    public static final String dataBaseName = "java_lesson_kq.";
    
    
    public static Connection openConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance ();
            conn = (Connection) DriverManager.getConnection(connJDBS,connUser,connPass);
        }
        catch(Exception ex){
            System.err.println("Connection Open Error: " + ex.getMessage());
        }
        return conn;
    }
    public static void closeConnection(Connection conn){
        try{
            if(!conn.isClosed())
            conn.close();
        }catch(Exception ex){
            System.err.println("Connection Close Error: " + ex.getMessage());
        }
    }
    
    public static PreparedStatement openPreparedStatement(Connection conn,String sql){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(sql);
        }
        catch(Exception ex){
            System.err.println("PreparedStatement Open Error: " + ex.getMessage());
        }
        return ps;
    }
    public static void closePreparedStatement(Connection conn,PreparedStatement ps){
        try{
            if(!conn.isClosed()){
                ps.close();
                closeConnection(conn);
            }
        }catch(Exception ex){
            System.err.println("PreparedStatement Close Error: " + ex.getMessage());
        }
    }    
	
    public static void insertDeleteUpdateData(String sql) {
    	 Connection conn = openConnection();
         PreparedStatement ps = openPreparedStatement(conn,sql);
         try{
             if(!conn.isClosed()){
                 ps.executeUpdate();
                 closePreparedStatement(conn, ps);
             }
         }
         catch(Exception ex){
             System.err.println("insertData Error : " + ex.getMessage());
    }
	

}
    
}
