package domain.time.units;

import domain.time.TimeMetricUnit;
import domain.time.TimeUnits;

public class SecondUnit extends TimeMetricUnit
{
    public SecondUnit() { super(TimeUnits.Second); }

    @Override
    public double getDefaultValue() { return 1; }

    @Override
    public String toString() { return "s"; }
}
