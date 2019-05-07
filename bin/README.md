# inciclo-backend
Incliclo project backend

### API
http://inciclo.us-east-2.elasticbeanstalk.com


#### Endpoints

`GET` */podas*

  	*Response:*
			
-  200 OK:

		 {Array<Object>:{
		 		area:Array<Object>:{
		 			x: Double,
		 			y: Double
		 		} 
		 		
		 		posts:Array<Object>{
		 			identificator:Int
			      	location:Object:{
			      		x:Double,
			      		y:Double
			      	};
			      	impact:int;
		 		}
		 		step:Enum:{
		 			  GROWING,
			        NEXT_TO_CABLE,
			        IN_INPECTION,
			        CHECKED_TO_CUT;
		 		}
		 		status:Enum:{
		 			DELAYED,
			      	DONE,
			      SCHEDULED;
		 		}
		 		cLevel:Enum:{
		 			LOW,
			    	MEDIUM,
			    	HIGH;
		 		}
		 	}
		}
