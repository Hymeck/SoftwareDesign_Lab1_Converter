package domain.time.units;

import domain.time.TimeMetricUnit;
import domain.time.TimeUnits;

public class MinuteUnit extends TimeMetricUnit
{
    public MinuteUnit() { super(TimeUnits.Minute); }

    @Override
    public double getDefaultValue() { return 60; }

    @Override
    public String toString() { return "m"; }
}
