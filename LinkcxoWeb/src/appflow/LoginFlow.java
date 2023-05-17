package appflow;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class LoginFlow extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
        
		
		//JobApply jobs = new JobApply();
		//jobs.main(null);

		//Job create
				//JobCreate job = new JobCreate();
				//job.main(null);

	}

}

