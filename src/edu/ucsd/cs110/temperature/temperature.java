package edu.ucsd.cs110.temperature;



public abstract class temperature {
    private final float value;

    public temperature(float v)
    {
        value = v;
    }
    public final float getValue()
    {
        return value;
    }
    public abstract temperature toCelsius();
    public abstract temperature toFahrenheit();
}