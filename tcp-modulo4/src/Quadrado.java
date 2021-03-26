
public class Quadrado<T extends Number> extends AbstractFormaGeometrica{

    private T lado;

    Quadrado(T l){
    if(l.doubleValue() <= 0) {
        throw new IllegalMeasurementException("Medida nula ou negativa");
    }
        this.lado = l;
    }

    public double getLado(){
        return this.lado.doubleValue();
    }

    public void setLado(T l){
        this.lado = l;
    }

    public double get_area (){
        return Math.pow(this.lado.doubleValue(), 2);
    }
    
    public double get_perimetro(){
        return 4 * lado.doubleValue();
    }
    
    public String get_info(){
        String str = "Quadrado de lado: " + this.lado.toString();
        return str;
    }
}
