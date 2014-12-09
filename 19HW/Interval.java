import java.util.Random;
public class Interval 
{
    int low;
    int high;
    Random r = new Random();
    public Interval ()
    {
	low = r.nextInt(100);
	high = low + r.nextInt(100) + 1;
    }
    public Interval (int l, int h)
    {
	low = l;
	high = h;
    }
    public String toString()
    {
	String output = "{";
	for (int i = low; i < high; i++)
	    {
		output = output + i + " ";
	    }
	output = output + "}";
	return output;
    }

    public static void main(String[] args) {
	Interval[] stuff = new Interval[5];
	for(int i=0;i<stuff.length;i++) {
	    stuff[i] = new Interval();
	}
	for (int j = 0; j < stuff.length; j++)
	    {
		System.out.println(stuff[j]);
	    }
    }
}
