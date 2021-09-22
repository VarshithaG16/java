class IceCreamTester
{
public static void main(String a[])
{
IceCream ice = new IceCream();
ice.iceCreamName = "BlackCurrent";
ice.price = 60;
ice.type = "Cone";
System.out.println(ice.iceCreamName+"  "+ice.price+"  "+ice.type);
ice.behaviour();


IceCream ice1 = new IceCream();
ice1.iceCreamName = "Pista";
ice1.price = 30;
ice1.type = "Cup";
System.out.println(ice1.iceCreamName+"  "+ice1.price+"  "+ice1.type);
ice1.behaviour();


IceCream ice2 = new IceCream();
ice2.iceCreamName = "Mango";
ice2.price = 20;
ice2.type = "Candy";
System.out.println(ice2.iceCreamName+"  "+ice2.price+"  "+ice2.type);
ice2.behaviour();

}
}