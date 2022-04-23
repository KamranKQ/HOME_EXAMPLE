package az.kq.l05.connect;

import az.kq.l04.entity.Masin;


public class OperationSQL implements IOperationSQL {

	@Override
	public void insert(String sql) {
		OpenCloseConnect.insertDeleteUpdateData(sql);
		
	}

	@Override
	public void update(String sql) {
		OpenCloseConnect.insertDeleteUpdateData(sql);
		
		
	}

	@Override
	public void delete(String sql) {
		OpenCloseConnect.insertDeleteUpdateData(sql);
		
		
	}

	@Override
	public Masin select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	


}
