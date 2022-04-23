package az.kq.l02.controller;

import az.kq.l03.backend.Delete;
import az.kq.l03.backend.Insert;
import az.kq.l03.backend.Select;
import az.kq.l03.backend.Update;
import az.kq.l04.entity.Masin;

public class Controller {
	
	public static Masin controller(String type,Masin masin) {
		
		switch (type) {
		
		case "insert":
			Insert.insertMasin(masin);
			break;
		case "delete":
			Delete.deleteMasin(masin);
			break;
		case "update":
			Update.updateMasin(masin);
			break;	
		case "select":
			Select.selectMasin(masin);
			break;
		default:
			System.out.println("Type müəyyən deyil");
			break;
		}
		
		
		return masin;
		
	}

}
