package az.kq.l01.frontend;

import az.kq.l04.entity.Masin;
import az.kq.l02.controller.*;
public class SelectFrontData {

	public static void main(String[] args) {
		
		Masin masin = new Masin();
		masin.setId(1);
		
		Controller.controller("select", masin);

	}

}
