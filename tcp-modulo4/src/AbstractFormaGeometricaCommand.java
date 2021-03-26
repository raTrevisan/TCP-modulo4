
public abstract class AbstractFormaGeometricaCommand implements FormaGeometricaCommand{
	
	protected FormaGeometrica forma; 
	
    public abstract void execute();
    public void exibe_area(){
    	System.out.println("Com area: " + this.forma.get_area());
    };	
    public void exibe_pertimetro(){
    	System.out.println("Com perimetro: " +this.forma.get_perimetro());
    };	
    public void exibe_info(){
    	System.out.println(forma.get_info());
    };   
}
