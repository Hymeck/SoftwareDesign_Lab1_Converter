package domain.distance.units;

import domain.distance.DistanceMetricUnit;
import domain.distance.DistanceUnits;

public class MeterUnit extends DistanceMetricUnit
{
    public MeterUnit() { super(DistanceUnits.Meter); }

    @Override
    public double getDefaultValue() { return 1; }

    @Override
    public String toString() {return "m"; }
}
