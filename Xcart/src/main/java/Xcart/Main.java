package Xcart;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FirebaseDB firebase = new FirebaseDB();
//		firebase.addData();
		firebase.fetchUserData();
	}

}
