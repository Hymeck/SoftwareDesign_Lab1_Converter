package domain.time.units;

import domain.time.TimeMetricUnit;
import domain.time.TimeUnits;

public class HourUnit extends TimeMetricUnit
{
    public HourUnit() { super(TimeUnits.Hour); }

    @Override
    public double getDefaultValue() { return 3600; }

    @Override
    public String toString() { return "h";}
}
