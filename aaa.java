package aaa;
import java.util.*;

public class aaa {

	Vector userv;
	Vector passv;
	Vector Statisv;
	
	Information _user[] = {
			new Information(1, "Kim", "processing", 100),
			new Information(2, "LEE", "processing", 100),
			new Information(3, "choe", "analysis", 200),
			new Information(4, "brus", "processing", 100),
			new Information(5, "gochap", "analysis", 200),

	};
	
	Pass _pass[] = {
			new Pass(1, 40, 50, 90),
			new Pass(2, 80, 70, 90),
			new Pass(3, 70, 30, 80),
			new Pass(4, 30, 70, 80),
			new Pass(5, 90, 80, 100)				
	};
	
	Statistics _statis[] =  {
			new Statistics(100, 2, 1),
			new Statistics(200, 1, 1)
	};

	
	public aaa() {
		
		userv = new Vector();
		passv = new Vector();
		Statisv = new Vector();
		
		setAllUser();
		setAllpass();
		setAllstatis();
		
		getAllUser();

		System.out.println("");
		getAllPass();

		System.out.println("");
		
		getAllstatis();
		System.out.println("");
		
		updateUser(3, "processing", 100);
		getAllUser();

		System.out.println("");
		
		
		System.out.println("search user");
		getPortfolio("Kim");
		
		
	}
	
	//특정 유저 정보 출력
	private void getPortfolio(String name) {
		// TODO Auto-generated method stub
		for(int i=0; i < userv.size(); i++) {
			Information user = (Information)userv.get(i);
			 for(int j=0; j < passv.size(); j++) {
				 Pass pass = (Pass)passv.get(j);
				

				 if(user.name == name && user.id == pass.id) {
					 System.out.println( user.id + " (" + user.name + ")" +" "+ 
							 user.subject + " "+user.testid +" "+ pass.flag);
				 }
			}
		 }
	}	
		
	
	
	
	private void getPass(int id) {
		// TODO Auto-generated method stub
		for(int i=0; i < passv.size(); i++) {
			Pass ps = (Pass)passv.get(i);
			 for(int j=0; j < userv.size(); j++) {
				 Information user = (Information)userv.get(j);
				 if(ps.id == id && ps.id == user.id) {
					 System.out.println( ps.id + "(" + user.name + ")" + ps.flag + " ");
				 }

			}
		 }
	}	
		
	

	
	private void updateUser(int id, String subject, int testid) {
		// TODO Auto-generated method stub
		for (int i = 0; i < userv.size(); i++) {
			Information obj = (Information)userv.get(i);
			if(obj.id == id) {
				obj.subject = subject;
				obj.testid = testid;
			}
		}		
	}
	 
	private void deleteUser(String name) {
		// TODO Auto-generated method stub
		for (int i = 0; i < userv.size(); i++) {
			Information obj = (Information)userv.get(i);
			if(obj.name == name) {	userv.remove(i);	}
		}
	}

	
	private void getAllUser() {
		// TODO Auto-generated method stub
		for (int i = 0; i < userv.size(); i++) {
			Information obj = (Information)userv.get(i);
			System.out.println(obj.toString());
		}		
	}

	private void getAllPass() {
		// TODO Auto-generated method stub
		for (int i = 0; i < passv.size(); i++) {
			Pass obj = (Pass)passv.get(i);
			System.out.println(obj.toString());
		}		
		
	}

	private void getAllstatis() {
		// TODO Auto-generated method stub
		for (int i = 0; i < Statisv.size(); i++) {
			Statistics obj = (Statistics)Statisv.get(i);
			System.out.println(obj.toString());
		}		
		
	}

	
	
	private void setAllUser() {
		// TODO Auto-generated method stub
		for (int i = 0; i < _user.length; i++) {
			userv.add( _user[i] );
		}			
		
	}
	

	private void setAllpass() {
	// TODO Auto-generated method stub
		for (int i = 0; i < _pass.length; i++) {
			passv.add( _pass[i] );
		}	
	}

	private void setAllstatis() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < _statis.length; i++) {
			Statisv.add( _statis[i] );
		}
	}	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new aaa();

	}
}
