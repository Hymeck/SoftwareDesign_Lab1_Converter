package domain.time;

import core.MagnitudeMetricUnit;

public abstract class TimeMetricUnit extends MagnitudeMetricUnit
{
    protected TimeMetricUnit(TimeUnits unit) { super(unit); }
}
