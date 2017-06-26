import com.jun.criador.Fabrica;
import com.jun.criador.FabricaAutomovel;
import com.jun.produto.Automovel;
import com.jun.produto.Automovel.AUTOMOVEL;

public class Main {

	public static void main(String[] args) {
		Fabrica f = new FabricaAutomovel();
		
		Automovel automovel = f.makeAutomovel(AUTOMOVEL.CARRO);
		System.out.println(automovel.descricao());
		
		automovel = f.makeAutomovel(AUTOMOVEL.CAMINHÂO);
		System.out.println(automovel.descricao());
		
		automovel = f.makeAutomovel(AUTOMOVEL.MOTO);
		System.out.println(automovel.descricao());

	}

}
