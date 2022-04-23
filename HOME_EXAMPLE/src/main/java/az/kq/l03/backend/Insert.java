package az.kq.l03.backend;

import az.kq.l04.entity.Masin;
import az.kq.l05.connect.OperationSQL;
import az.kq.l06.Label.Label;

public class Insert {
	
	public static void insertMasin(Masin masin ) {
		
	String insertSQL= Label.insertMasin + "\n"+
				"("+masin.getId()+",'"+masin.getMarka()+"','"+masin.getModel()+"',"+masin.getIl()+","
						+ "'"+masin.getIstehsalOlkesi()+"',"+masin.getIstehsalSay()+","+masin.getSatisSay()+")";
		
		OperationSQL operationsql= new OperationSQL();
		operationsql.insert(insertSQL);
	
	}

}
