
package gui;


public class Wetterstation {

    private String place;
    private int sealevel, humidity;
    private double temp;

    public Wetterstation(String place, int sealevel, int humidity, double temp) {
        this.place = place;
        this.sealevel = sealevel;
        this.humidity = humidity;
        this.temp = temp;
    }

    public String getPlace() {
        return place;
    }

    public int getSealevel() {
        return sealevel;
    }

    public int getHumidity() {
        return humidity;
    }

    public double getTemp() {
        return temp;
    }

    public void setPlace(String place) {
       
        this.place = place;
    }

    public void setSealevel(int sealevel) {
       
        this.sealevel = sealevel;
    }

    public void setHumidity(int humidity) {
       
        this.humidity = humidity;
    }

    public void setTemp(double temp) throws Exception {
        if(temp<-35||temp>45)throw new Exception("Bitte einen anderen Temperaturwert wählen!");
        
        this.temp = temp;
    }
    
}
