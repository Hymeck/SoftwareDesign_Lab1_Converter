package domain.distance.units;

import domain.distance.DistanceMetricUnit;
import domain.distance.DistanceUnits;

public class KilometerUnit extends DistanceMetricUnit
{
    public KilometerUnit() { super(DistanceUnits.Kilometer); }

    @Override
    public double getDefaultValue() { return 1000; }

    @Override
    public String toString() {return "km"; }
}
