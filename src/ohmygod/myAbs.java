package ohmygod;

public class myAbs {
    public myAbs() {

    }

    public static void main(String[] args) {
	myAbs abs = new myAbs();
	System.out.println("Abs = " + abs.Abs(-2));

    }

    public int Abs(int a) {
	if (a == 0) {
	    return 0;
	}
	if (a < 0) {
	    return -a;
	}
	if (a > 0) {
	    return a;
	}
	return 0;
    }

    public long Abs(long a) {
	if (a == 0) {
	    return 0;
	}
	if (a < 0) {
	    return -a;
	}
	if (a > 0) {
	    return a;
	}
	return 0;
    }

    public float Abs(float a) {
	if (a == 0) {
	    return 0;
	}
	if (a < 0) {
	    return -a;
	}
	if (a > 0) {
	    return a;
	}
	return 0;
    }

    public double Abs(double a) {
	if (a == 0) {
	    return 0;
	}
	if (a < 0) {
	    return -a;
	}
	if (a > 0) {
	    return a;
	}
	return 0;
    }

}
