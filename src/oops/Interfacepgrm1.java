package oops;

interface tvremote
{
	public void volumeup();
	public void volumedown();
}
interface smarttvremote extends tvremote
{
	public void bluetooth();

	
}
class TV implements smarttvremote
{

	@Override
	public void bluetooth() {
		System.out.println("bluetooth");
		
	}

	@Override
	public void volumeup() {
		System.out.println("volumeup");		
	}

	@Override
	public void volumedown() {
		System.out.println("volumedown");
		
	}

	
		
	}

public class Interfacepgrm1 {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.bluetooth();
		ob.volumeup();
		ob.volumedown();
		

	}

}
