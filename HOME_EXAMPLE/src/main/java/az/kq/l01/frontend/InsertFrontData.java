package az.kq.l01.frontend;

import az.kq.l02.controller.Controller;
import az.kq.l04.entity.Masin;

public class InsertFrontData {
	
	public static void main(String[] args) {
	
		Masin masin = new Masin();
		masin.setId(1);
		masin.setMarka("BMW");
		masin.setModel("530");
		masin.setReng("Qara");
		masin.setIl(2015);
		masin.setIstehsalOlkesi("ALMANIYA");
		masin.setIstehsalSay(100);
		masin.setSatisSay(60);
		
		Controller.controller("insert", masin);
	}
	

}
