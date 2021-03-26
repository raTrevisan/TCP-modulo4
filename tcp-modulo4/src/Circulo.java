
public class Circulo<T extends Number> extends AbstractFormaGeometrica {
    private T raio;

    Circulo(T r){
    if(r.doubleValue() <= 0) {
    	throw new IllegalMeasurementException("Raio nulo ou negativo !");
    }
        this.raio = r;
    }

    public double getRaio(){
        return this.raio.doubleValue();
    }

    public void setRaio(T r){
        this.raio = r;
    }

    public double get_area(){
        return Math.pow(this.raio.doubleValue(), 2) * Math.PI; //  r^2 * pi
    }

    public String get_info(){
        String str = "Circulo de raio: " + this.raio.toString();
        return str;    
    }

    public double get_perimetro(){
        return 2*this.raio.doubleValue()* Math.PI;
    }
}
