package az.kq.l05.connect;

import az.kq.l04.entity.Masin;

public interface IOperationSQL {
	
	public void insert(String sql);
	public void update(String sql);
	public void delete(String sql);
	public Masin select(String sql);

}
