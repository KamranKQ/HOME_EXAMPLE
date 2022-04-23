package az.kq.l06.Label;

public class Label {
	
	private static String 	schemaTableName= "java_lesson_kq.masin";
	
	public static  String 	insertMasin="Insert into "+schemaTableName+" (ID,MARKA,MODEL,RENG,IL,ISTEHSAL_OLKESI,ISTEHSAL_SAYI,SATIS_SAYI) VALUES";
	
	public static  String 	deleteMasin="Delete from "+schemaTableName+" where id = ";
	
	public static  String 	updateMasin="Update  "+schemaTableName+ " set marka='ZIL' where id ="  ;
	
	public static  String 	selectMasin="Select * from "+schemaTableName+" where id = ";

}
