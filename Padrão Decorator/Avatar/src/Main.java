import com.jun.decorator.PersonalidadeAlegre;
import com.jun.decorator.PersonalidadeCiumento;
import com.jun.decorator.PersonalidadeMeigo;
import com.jun.model.Avatar;
import com.jun.model.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avatar a = new Pessoa("Jose",21,Avatar.GENERO.Masculino);
		a = new PersonalidadeAlegre(a);
		a = new PersonalidadeMeigo(a);
		a = new PersonalidadeCiumento(a);
		System.out.println(a.getDescricao());
	}

}
