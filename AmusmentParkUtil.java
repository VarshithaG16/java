class AmusmentParkUtil
{
public static void main(String a[])
{
AmusmentPark amus = new AmusmentPark();
amus.name = "Wonder La";
amus.entryPrice = 1200;
amus.place = "Bangalore";
System.out.println(amus.name+"  "+amus.entryPrice+"  "+amus.place);
amus.enjoy();


AmusmentPark amus1 = new AmusmentPark();
amus1.name = "GRS Fantasy Park";
amus1.entryPrice = 800;
amus1.place = "Bangalore";
System.out.println(amus1.name+"  "+amus1.entryPrice+"  "+amus1.place);
amus1.enjoy();


AmusmentPark amus2 = new AmusmentPark();
amus2.name = "Imagicaa";
amus2.entryPrice = 1800;
amus2.place = "Maharashtra";
System.out.println(amus2.name+"  "+amus2.entryPrice+"  "+amus2.place);
amus2.enjoy();
}
}