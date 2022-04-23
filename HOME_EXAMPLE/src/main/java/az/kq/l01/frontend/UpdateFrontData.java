package az.kq.l01.frontend;

import az.kq.l02.controller.Controller;
import az.kq.l04.entity.Masin;

public class UpdateFrontData {
	
	public static void main(String[] args) {
		
		Masin masin=new Masin();
		masin.setId(1);
		
		Controller.controller("update", masin);
	}

}
