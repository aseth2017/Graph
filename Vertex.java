/**
This is the class for a vertex. Vertices are single points on a graph, and are connected by edges
@author Anish Seth
@version 2/24/16
*/

public class Vertex<E>
{
	private E value;
	private boolean vist;
	private Vector<Vertex<E>> connect;
	private Vector<Integer> costs;
	/**
	Constructors
	*/
	public Vertex(E e)
	{
		value = e;
		visit = false;
		other = new Vector<Vertex<E>>();
		costs = new Vector<Integer>();
	}
	public Vertex(E e, Vector<Vertex<E>> points, Vector<Integer> cost)
	{
		value = e;
		visit = false;
		connect = points;
		costs = cost;
	}
	/**
	Accessors
	*/
	public E getValue()
	{
		return value;
	}
	public boolean getVisit()
	{
		return visit;
	}
	public Vertex<E> getPoint(int i)
	{
		return connect.get(i);
	}
	public int getCost(int i)
	{
		return cost.get(i);
	}
	/**
	Modifiers
	*/
	/**
	Connects two points
	*/
	public void add(Vertex<E> x, int i)
	{
		connect.add(x);
		costs.add(i);
	}
	/**
	Free-floating point
	*/
	public void add(E e, int i)
	{
		value = e;
		cost.set(i);
	}
	public void Arrival()
	{
		visit = true;
	}
	public String toString()
	{
		String s = "";
		s += value;
		return s;
	}

}
