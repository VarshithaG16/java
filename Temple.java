class Temple{

static String templeName[]=new String[6];

static String templePlace[]=new String[6];

public static void main(String a[]){

  templeName[0]="Chamundeshwari Temple";
  templeName[1]="Annapoorneshwari Temple";
  templeName[2]="Sharada Temple";
  templeName[3]="Bhanashankari Temple";
  templeName[4]="Marikambha Temple";
  templeName[5]="Mookambike Temple";

  templePlace[0]="Mysore";
  templePlace[1]="Varnadu";
  templePlace[2]="Shringeri";
  templePlace[3]="Bhadami";
  templePlace[4]="Sirsi";
  templePlace[5]="Kolluru";
  
  getTempleNames();
}
public static void getTempleNames()
{

    for(int b=0;b<templeName.length;b++){

       System.out.println(templeName[b]);
      }

    for(int c=0;c<templePlace.length;c++){ 

       System.out.println(templePlace[c]);
     }
}

}