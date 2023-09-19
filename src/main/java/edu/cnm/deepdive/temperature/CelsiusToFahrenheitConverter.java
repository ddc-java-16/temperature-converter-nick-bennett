package edu.cnm.deepdive.temperature;

public class CelsiusToFahrenheitConverter {

  private static final double SCALING_FACTOR = 1.8;

  public double convert(double celsius) {
//    throw new UnsupportedOperationException("Not yet implemented");
    return SCALING_FACTOR * celsius + 32;
  }

}
