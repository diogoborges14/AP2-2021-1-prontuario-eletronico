package modelServices;

import java.util.ArrayList;
import java.util.List;

import entities.User;
import gui.CadastroViewController;

public class FindUsers {
	public List<User> findAll(){
		List<User> list = new ArrayList<>();
		list.add(new User("Luiz", "fhellipe", "034151", 1.70, 20, "Rua das camélias", 99250095));
		return list;
	}
	public CadastroViewController user;
}
