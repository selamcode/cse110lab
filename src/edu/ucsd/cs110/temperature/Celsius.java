package edu.ucsd.cs110.temperature;
public class Celsius extends temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public temperature toCelsius() {
        return this;
    }

    @Override
    public temperature toFahrenheit() {
        float value = ((this.getValue()*9)/5)+32;
        return new Fahrenheit(value);
    }

    public String toString()
    {

        return this.getValue()+" C";
    }
}