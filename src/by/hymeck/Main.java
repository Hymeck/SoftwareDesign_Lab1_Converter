package by.hymeck;

import domain.distance.*;
import domain.distance.units.*;
import domain.mass.*;
import domain.mass.units.*;
import domain.time.*;
import domain.time.units.*;

public class Main
{

    public static void main(String[] args)
    {
        // Mass
        var massFrom = new Mass(new KilogramUnit(), 100);
        var massConverter = new MassConverter();
        var massTo = massConverter.Convert(massFrom, new ToneUnit());
        System.out.println(massFrom + " = " + massTo);
        //Mass

        // Time
        var timeFrom = new Time(new HourUnit(), 1.5);
        var timeConverter = new TimeConverter();
        var timeTo = timeConverter.Convert(timeFrom, new MinuteUnit());
        System.out.println(timeFrom + " = " + timeTo);
        // Time

        // Distance
        var distanceFrom = new Distance(new KilometerUnit(), 10);
        var distanceConverter = new DistanceConverter();
        var distanceTo = distanceConverter.Convert(distanceFrom, new MeterUnit());
        System.out.println(distanceFrom + " = " + distanceTo);
        // Distance
    }
}
