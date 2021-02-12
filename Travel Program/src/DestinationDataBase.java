import java.util.ArrayList;

public class DestinationDataBase
{
    public static ArrayList<Destination> destinationList = new ArrayList<Destination>();
    public void fillDestinationList()
    {
	destinationList.add(new Destination("Paris", 49, 2.0));
	destinationList.add(new Destination("Disneyland", 34, -118));
	destinationList.add(new Destination("Coronado", 33, -117));
	destinationList.add(new Destination("Cancun", 21, -87));
	destinationList.add(new Destination("Seattle", 48, -122));
	destinationList.add(new Destination("Chicago", 42, -88));
	destinationList.add(new Destination("Taos", 36, -106));
	destinationList.add(new Destination("Tucson", 32, -111));
	destinationList.add(new Destination("Denver", 40, -105));
    }
    
}
