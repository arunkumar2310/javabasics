package com.worksheet_answers;

public class Conversion {
      private float celsius;
      private float fahrenheit;
	public float getCelsius() {
		return celsius;
	}
	public void setCelsius(float celsius) {
		this.celsius = celsius;
	}
	public float getFahrenheit() {
		return fahrenheit;
	}
	public void setFahernheit(float fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
      public void Celsius() {
    	 float celsiuss =(float)( 5.0 / 9.0 * ( fahrenheit - 32 ));
    	  System.out.println(celsiuss);
      }
      public void Fahrenheit() {
    	  float fahrenheitt =(float) (9.0 / 5.0 * celsius + 32);
    	  System.out.println(fahrenheitt);
      }
      public static void main(String[] args)
      {
    	  Conversion v1=new Conversion();
    	  v1.setCelsius(90.0f);
    	  v1.setFahernheit(100.0f);
    	  v1.Celsius();
    	  v1.Fahrenheit();
    	  
    	  
      }
}
