import java.util.Scanner;

public class QuadradoCommand extends AbstractFormaGeometricaCommand{

	@SuppressWarnings("resource")
	public void execute(){
		System.out.println("insira o lado");
		Scanner input = new Scanner(System.in);
		try{
			double lado = input.nextDouble();
			this.forma = new Quadrado<Double>(lado);
			super.exibe_info();
			super.exibe_area();
			super.exibe_pertimetro();
			
		}catch(Exception e){
			System.out.println("Lado invalido: " + e.toString());
		}
    }
	public void exibe_area(){
	}
	public void exibe_pertimetro(){
	}
	public void exibe_info(){
	}
}
