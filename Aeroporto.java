import java.util.ArrayList;

public class Aeroporto {
    private ArrayList<Aviao> avioes;

    public Aeroporto() {
        avioes = new ArrayList<Aviao>();
    }

    // CRUD
    // Create - Criar/cadastrar
    // Cadastrar um novo aviao
    public void cadastrarAviao(Aviao aviao) {
        avioes.add(aviao);
    }

    // Retrieve - consultar
    // Retorna o aviao com o modelo indicado,
    // caso contrario retorna null
    public Aviao consultarPorModelo(String modelo) {
        if(avioes.isEmpty())
            return null;
        else {
            for(int i=0; i<avioes.size() ;i++) {
                Aviao a = avioes.get(i);
                if(a.getModelo().equals(modelo))
                    return a;
            }
        }
        return null;
    }

}
