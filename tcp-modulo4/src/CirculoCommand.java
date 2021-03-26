import java.util.Scanner;

public class CirculoCommand extends AbstractFormaGeometricaCommand{
	
	public void execute(){
		System.out.println("insira o raio");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		try{
			double raio = input.nextDouble();
			this.forma = new Circulo<Double>(raio);
			super.exibe_info();
			super.exibe_area();
			super.exibe_pertimetro();
			
		}catch(Exception e){
			System.out.println("Raio invalido: " + e.toString());
		}
    }
    
    public void exibe_area(){}
    public void exibe_pertimetro(){}
    public void exibe_info(){}
}