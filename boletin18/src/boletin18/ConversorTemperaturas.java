
package boletin18;

public class ConversorTemperaturas {
    
    public static final int TEMP_MIN = 80;
    
    public float centigradosAFharenheit(float temperatura) throws TemperaturaErradaExcepcion{
        if(temperatura < TEMP_MIN) throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor a 80º");
        else{
            float fharenheit = (temperatura * 9 / 5) + 32;
            return fharenheit;
        }
    }
    
    public float centigradosAReamur(float temperatura) throws TemperaturaErradaExcepcion{
        if(temperatura < TEMP_MIN) throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor a 80º");
        else{
            float reamur = temperatura * 4 / 5;
            return reamur;
        }
    }    
}
