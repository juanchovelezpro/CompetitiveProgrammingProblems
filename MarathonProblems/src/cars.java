import java.awt.Rectangle;
import java.util.Scanner;

public class cars {

	private String d;
	private int x;
	private int y;
	private int s;
	private int w;
	private int l;

	public cars(String d, int x, int y, int s, int w, int l) {
		
		this.d = d;
		this.x = x;
		this.y = y;
		this.s = s;
		this.w = w;
		this.l = l;
	}

	public void go() {

		if (d.equals("E")) {

			goE();
		}

		if (d.equals("W")) {

			goW();

		}

		if (d.equals("S")) {

			goS();
		}

		if (d.equals("N")) {

			goN();

		}

	}

	public void goW() {

		x = x - s;

	}

	public void goE() {

		x = x + s;
	}

	public void goS() {

		y = y - s;

	}

	public void goN() {

		y = y + s;

	}

	public boolean colision(Rectangle carTwo) {

		boolean colision = false;

		if (this.getBounds().intersects(carTwo.getBounds())) {

			colision = true;

		}

		return colision;

	}
	
	@Override
	public String toString() {
		
		return ""+x+", "+y+", "+s+","+w+", "+l;
		
	}
	
	public Rectangle getBounds() {
		
		Rectangle bounds = null;
		
		if(d.equals("E") || d.equals("W"))
		bounds= new Rectangle(x,y,w,l);
		else
		bounds = new Rectangle(x,y,l,w);
		
		return bounds;
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dur = Integer.parseInt(scan.nextLine());

		String[] carOne = scan.nextLine().split(" ");
		String[] carTwo = scan.nextLine().split(" ");

		cars car1 = new cars(carOne[0], Integer.parseInt(carOne[1]), Integer.parseInt(carOne[2]),
				Integer.parseInt(carOne[3]), Integer.parseInt(carOne[4]), Integer.parseInt(carOne[5]));
		cars car2 = new cars(carTwo[0], Integer.parseInt(carTwo[1]), Integer.parseInt(carTwo[2]),
				Integer.parseInt(carTwo[3]), Integer.parseInt(carTwo[4]), Integer.parseInt(carTwo[5]));

		boolean colision = false;
		
		for (int i = 0; i < dur && !colision; i++) {
		
	
			car1.go();
			car2.go();
			
			if (car1.colision(car2.getBounds())) {

				colision = true;

			}
			
			
			
		}

		
		
		if (colision) {

			System.out.println("crash");

		} else {

			System.out.println("safe");
		}

	}

}
