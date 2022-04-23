package az.kq.l03.backend;

import az.kq.l04.entity.Masin;
import az.kq.l05.connect.OperationSQL;
import az.kq.l06.Label.Label;

public class Delete {
	
	
		public static void deleteMasin(Masin masin ) {
			
		String deleteSQL= Label.deleteMasin + masin.getId();
		
		OperationSQL operationSQL= new OperationSQL();
		operationSQL.delete(deleteSQL);
		
		
		}

	


}
