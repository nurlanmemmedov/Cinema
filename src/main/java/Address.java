public class Address {
    private int id;
    private String line;
    private double latitude;
    private double longitude;
    private String description;

    public String getAsString(){
        return "Line: "+ line + ", Latitude: " + latitude + ", Longitude: " + longitude + ", Description: " + description;
    }
}
