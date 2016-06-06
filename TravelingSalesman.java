import java.lang.Math;

public class TravelingSalesman
{
	private static Vector<Vertex<String>> cities;
	
	public static void main(String [] args)
	{
		cities = new Vector<Vertex<String>>();
		Vertex<String> ny = new Vertex<String>("New York");
		cities.add(ny, 5);
		Vertex<String> la = new Vertex<String>("Los Angeles");
		cities.add(la, 10);
		Vertex<String> chicago = new Vertex<String>("Chicago");
		cities.add(chicago, 12);
		Vertex<String> denver = new Vertex<String>("Denver");
		cities.add(denver, 4);
		for (int i = 0; i<cities.size(); i++)
		{
			for (int j= i+1; j <cities.size(); j++)
			{
				cities.get(i).add(cities.get(j), ((i+j)/2)^2);
			}
		}
	}
}