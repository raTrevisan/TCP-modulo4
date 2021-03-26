import java.util.Scanner;

public class RetanguloCommand extends AbstractFormaGeometricaCommand{
	
	@SuppressWarnings("resource")
	public void execute(){
		System.out.println("insira a altura");
		Scanner inputa = new Scanner(System.in);
		System.out.println("insira a base");
		Scanner inputb = new Scanner(System.in);
		try{
			double altura = inputa.nextDouble();
			double base = inputb.nextDouble();
			this.forma = new Retangulo<Double>(base,altura);
			super.exibe_info();
			super.exibe_area();
			super.exibe_pertimetro();
			
		}catch(Exception e){
			System.out.println("Medidas invalidas. " + e.toString());
		}
    }
	
	
	public void exibe_area() {
	}

	public void exibe_pertimetro() {
	}

	public void exibe_info() {
	}

}
