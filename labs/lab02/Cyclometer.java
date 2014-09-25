////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE 002
//
public class Cyclometer{
    public static void main(String [ ] args){
        double secsTrip1=480; //How long trip 1 was
        double secsTrip2=3220; //How long trip 2 was
        int countsTrip1=1561; //number of rotations in trip 1
        int countsTrip2=9037; //number of rotations in trip 2
        //Constans used in calculations
        double wheelDiameter=27.0; 
        double PI=3.14159;
        int feetPerMile=5280;
        int inchesPerFoot=12;
        int secondsPerMinute=60;
        //Declaring distance variables will be changed later
        double distanceTrip1=0.0; 
        double distanceTrip2=0.0;
        double totalDistance=0.0;
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI; // Distance 1 in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts inches to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Distsnce 2 in miles
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }
}