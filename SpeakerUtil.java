class SpeakerUtil
{
public static void main(String a[])
{
boolean isConnected = Speaker.onOrOff();
System.out.println("The speaker is connected :"+isConnected);
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
boolean connected = Speaker.onOrOff();
System.out.println("The speaker is connected :"+connected);
Speaker.increaseVolume();
}
}