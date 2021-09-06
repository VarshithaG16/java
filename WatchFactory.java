class WatchFactory{

 static String watchCompany[]=new String[6];
 
 static String brandName[]=new String[6];

public static void main(String a[]){

  watchCompany[0]="TAG Heuer";
  watchCompany[1]="Breitling";
  watchCompany[2]="Seiko";
  watchCompany[3]="Panerai";
  watchCompany[4]="Tissot";
  watchCompany[5]="Rado";

  brandName[0]="Fastrack";
  brandName[1]="Titan";
  brandName[2]="Casio";
  brandName[3]="Fossil";
  brandName[4]="Timex";
  brandName[5]="Xiaomi";
  
  getWatchFactories();
}
  
  public static void getWatchFactories()
{

    for(int b=0;b<watchCompany.length;b++)
	{
       System.out.println(watchCompany[b]);
    }

    for(int c=0;c<brandName.length;c++)
	{ 
    System.out.println(brandName[c]);
	}

}

}