package com.test.shopChallenge.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.shopChallenge.Domain.User;
import com.test.shopChallenge.Domain.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository ur;
	
	public boolean registre(User u){
		if(ur.findOneByEmail(u.getEmail()) != null){
			return false;
		}else{
			ur.save(u);
			return true;
		}
	}
	
		public User login(String email,String password){
			return ur.findOneByEmailAndPassword(email,password);
		}
		
		public User byId(String id){
			return ur.findOne(id);
		}
	

}
