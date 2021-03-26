
public class Retangulo<T extends Number> extends AbstractFormaGeometrica {
    private T base;
    private T altura;

    Retangulo(T b, T a){
    	
    if(b.doubleValue() <= 0 || a.doubleValue() <= 0) {
        throw new IllegalMeasurementException("Medida nula ou negativa");
    }
        this.altura = a;
        this.base = b;
    }

    public double getAltura() {
        return altura.doubleValue();
    }

    public double getBase() {
        return base.doubleValue();
    }
    
    public void setAltura(T altura) {
        this.altura = altura;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public double get_area (){
        return this.altura.doubleValue() * this.base.doubleValue();
    }

    public double get_perimetro(){
        return (2* this.base.doubleValue()) + (2*this.altura.doubleValue()) ;
    }

    public String get_info(){
    	String info = "Retangulo de altura: " + this.altura.toString() + " e base: " + this.base.toString();
        return info;
    }

}
