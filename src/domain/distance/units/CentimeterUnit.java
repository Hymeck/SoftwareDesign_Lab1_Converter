package domain.distance.units;

import domain.distance.DistanceMetricUnit;
import domain.distance.DistanceUnits;

public class CentimeterUnit extends DistanceMetricUnit
{
    public CentimeterUnit() { super(DistanceUnits.Centimeter); }

    @Override
    public double getDefaultValue() { return 0.01; }

    @Override
    public String toString() {return "cm"; }
}
