class SweetTester
{
public static void main(String a[])
{
Sweet sw = new Sweet();
sw.sweetName = "Khaju Barfi";
sw.price = 225;
sw.address = "Rajajinagar";
System.out.println(sw.sweetName+"  "+sw.price+"  "+sw.address);
sw.ingrediantsUsed();


Sweet sw1 = new Sweet();
sw1.sweetName = "Jalebi";
sw1.price = 120;
sw1.address = "Rajajinagar";
System.out.println(sw1.sweetName+"  "+sw1.price+"  "+sw1.address);
sw1.ingrediantsUsed();


Sweet sw2 = new Sweet();
sw2.sweetName = "Laddoo";
sw2.price = 180;
sw2.address = "Rajajinagar";
System.out.println(sw2.sweetName+"  "+sw2.price+"  "+sw2.address);
sw2.ingrediantsUsed();


Sweet sw3 = new Sweet();
sw3.sweetName = "Rasmalai";
sw3.price = 220;
sw3.address = "Rajajinagar";
System.out.println(sw3.sweetName+"  "+sw3.price+"  "+sw3.address);
sw3.ingrediantsUsed();
}
}