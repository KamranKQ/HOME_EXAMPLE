package az.kq.l03.backend;

import az.kq.l02.controller.Controller;
import az.kq.l04.entity.Masin;
import az.kq.l05.connect.OperationSQL;
import az.kq.l06.Label.Label;

public class Update {
	
	public static void updateMasin (Masin masin) {
		
		String updateSQL=Label.updateMasin + masin.getId();
		
		OperationSQL operationsql= new OperationSQL();
		operationsql.update(updateSQL);
		
		
	}

}
