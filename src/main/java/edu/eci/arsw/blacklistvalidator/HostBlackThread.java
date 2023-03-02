package edu.eci.arsw.blacklistvalidator;

public class HostBlackThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int N;
	private String ipaddress;
	
	public  HostBlackThread(String ipaddress, int N ) {
		super();
		this.N = N;
		this.ipaddress = ipaddress;
	}
	
	@Override
	public void run() {
		for(int i= 0; i <= N; i++) {
			HostBlackListsValidator.checkHost(ipaddress, i);
			System.out.println(i + this.getName());
		}
	}
}


