package domain.mass.units;

import domain.mass.MassMetricUnit;
import domain.mass.MassUnits;

public class KilogramUnit extends MassMetricUnit
{
    public KilogramUnit()
    {
        super(MassUnits.Kilogram);
    }

    @Override
    public double getDefaultValue()
    {
        return 1;
    }

    @Override
    public String toString()
    {
        return "kg";
    }
}
