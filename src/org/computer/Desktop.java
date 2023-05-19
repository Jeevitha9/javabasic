package org.computer;

public class Desktop extends Computer {
	private void desktopSize() {
		System.out.println("Desktop Size is = 32");

	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}

	
}
