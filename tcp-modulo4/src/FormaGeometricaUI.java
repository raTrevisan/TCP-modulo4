import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class FormaGeometricaUI  {

	private static final Map<String,FormaGeometricaCommand> mapa  = new HashMap<String,FormaGeometricaCommand>();
    
	
	FormaGeometricaUI(){
		mapa.put("circulo",new CirculoCommand());
		mapa.put("quadrado",new QuadradoCommand());
		mapa.put("retangulo",new RetanguloCommand());
    }
    @SuppressWarnings("resource")
	public void exibeInterface(){
        do
        {
            System.out.println("Qual forma deve ser instanciada ? Para sair digite 'sair'");
            Scanner input = new Scanner(System.in);
            String in = input.next();
            in = in.toLowerCase();
            //System.out.println(in);

            if(in.equals("sair")){
                input.close();
            	break;
            }
            if(mapa.containsKey(in)){
            	mapa.get(in).execute();
            }
            else {
                System.out.println("Digite uma forma valida");
            }
                        
            
        }while(true);
      
    }
}
