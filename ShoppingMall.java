class ShoppingMall{

static String shoppingMall[]=new String[6];

static int noOfBrands[]=new int[6];

public static void main(String a[]){

  shoppingMall[0]="Orion";
  shoppingMall[1]="Mantri Mall";
  shoppingMall[2]="City Center";
  shoppingMall[3]="Reliance";
  shoppingMall[4]="Westgate Value";
  shoppingMall[5]="GlobalMall";

  noOfBrands[0]=40;
  noOfBrands[1]=53;
  noOfBrands[2]=80;
  noOfBrands[3]=48;
  noOfBrands[4]=50;
  noOfBrands[5]=20;
  
  getShoppingMalls();
}
  
  public static void getShoppingMalls()
  {
 
  for(int b=0;b<shoppingMall.length;b++)
  {
 
     System.out.println(shoppingMall[b]);
  }
  
  for(int c=0;c<noOfBrands.length;c++)
  {

     System.out.println(noOfBrands[c]);
  }

 }

}