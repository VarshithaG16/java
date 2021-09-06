class IPL{
	static String[] teamName={"RCB","MI","CSK","K1XP","KKR","RR","DC"};


    static String listOfCaptains[]={"Virat Kohli","Rohith Sharma","MS DHoni","KL Rahul","Eon Morgan","Sanju Samson","Rishab Pant"};


public static void main(String a[])
   {
	  getIplTeams();
   } 
 public static void getIplTeams()
 {
	 System.out.println("IPL Teams are"); 
	 
	 for(int b=0;b<teamName.length;b++)
	 {
        System.out.println(teamName[b]);
     }
	 
	 System.out.println("Captains are");

    for(int c=0;c<teamName.length;c++)
	{
       System.out.println(listOfCaptains[c]);
    }
 }
  

}