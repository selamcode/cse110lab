package edu.ucsd.cs110.temperature;
public class Fahrenheit extends temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public temperature toCelsius() {

        float value = ((this.getValue()-32)*5)/9;
        return new Fahrenheit(value);
    }

    @Override
    public temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue()+" F";
    }
}