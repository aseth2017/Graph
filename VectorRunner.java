import java.util.Iterator;
//import java.lang.Iterable;
import java.util.Vector;

public class VectorRunner
{
	public static void main(String[] args)
	{
		Vector<Object> v = new Vector<Object> ();
		v.add(2);
		v.add(0, 3);
		System.out.println(v);
		v.remove((Object) 2);
		System.out.println(v);
		v.iterator();
		System.out.println(v);
	}
}
