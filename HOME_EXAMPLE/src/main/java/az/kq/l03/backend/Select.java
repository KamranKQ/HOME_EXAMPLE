package az.kq.l03.backend;

import az.kq.l04.entity.Masin;
import az.kq.l05.connect.OperationSQL;
import az.kq.l06.Label.Label;

public class Select {

	public static Masin selectMasin(Masin masin) {
		Masin masin1=null;
		String selectSQL=Label.selectMasin+ masin.getId();
		
		OperationSQL operationsql= new OperationSQL();
		masin1=operationsql.select(selectSQL);
		
		return masin1;
		
		
		
		}

	
		
	

}

