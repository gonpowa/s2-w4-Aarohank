public class Dot {

    public void scream(){
        System.out.println("s1");
    }
	public int move(){
		System.out.println("1");
	return 1;
	}
    
    public static void main(String[] args) {
        System.out.println("butt");
    }
}

    class FasterDot extends Dot{
        public void report(){
                System.out.println("r2");
        }
	    public int move(){
		    System.out.println("2");
		return 2;
	    }
    }

    class VeryFastDot extends FasterDot{
        public void scream(){
            System.out.println("s4");
        }
        public void report(){
            System.out.println("r4");
        }

	    public int move(){
	        System.out.println("4");
	    return 4;
	    }       
    }



