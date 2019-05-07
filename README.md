# inciclo-backend
Incliclo project backend

### API
http://inciclo.us-east-2.elasticbeanstalk.com


#### Endpoints

`GET` */podas*

  Response:
			
-  200 OK:



     {Array<Object>:{
            id:Int,
            posts:Array<Object>{
                id:Int
                identificator:Int
                xPosition:Int,
                yPosition:Int,
                impact:int;
                trees:Array<Object>{
                    id:Int,
                    growTime:Int,
                    lastPoda:Date("yyyy-mm-dd"),
                    especie:String
                }
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
		
		
		
		
`POST` */podas*

   Body example:
    
        {
        	"step":"GROWING",
        	"status":"DELAYED",
        	"cLevel":"LOW",
        	"posts":[
        		{
                        "identificator":12,
                        "xPosition":3122,
                        "yPosition":1022,
                        "impact":10,
                        "trees":[
                            {
                                "growTime":4000,
                                "lastPoda":"2012-10-01T09:45:00.000+02:00",
                                "especie":"araucaria"
                            }
                         ]
                    }
        	]
        	
        }
        
