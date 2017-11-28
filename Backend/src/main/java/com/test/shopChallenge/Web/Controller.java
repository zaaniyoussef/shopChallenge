package com.test.shopChallenge.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.shopChallenge.Domain.Shops;
import com.test.shopChallenge.Domain.User;
import com.test.shopChallenge.Service.*;

@RestController
public class Controller {
	
	@Autowired
	private UserService us;
	@Autowired
	private ShopsService sh;	
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(method = RequestMethod.POST,value="/user/register")
	public String register(@RequestBody User u){
		if(us.registre(u)){
			return "GOOD";
		}else{
			return "email not available";
		}
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping("/user/login/{email}/{password}")
	public User login(@PathVariable String email,@PathVariable String password){
		return us.login(email, password);
	}
		
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping("/shops")
	public List<Shops> AllShops(){
		return  sh.getAll();
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping("/user/shops/{status}")
	public List<Shops> allShopsByStatus(@PathVariable String status){
		return  sh.getAllByStatus(status);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(method = RequestMethod.PUT,value="/shop/Update")
	public void updateShops(@RequestBody Shops e){
		sh.Update(e);
	}

}
