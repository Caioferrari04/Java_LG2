import java.util.List;
import java.util.ArrayList;

public class Lorraine40t implements Tanque {
    private List<Municao> municoes = new ArrayList<>();
    private Integer calibreCanhao = 100;
    private Municao municaoCarregada;

    public boolean atirarCanhao() {
        if(municaoCarregada != null) {
            municaoCarregada = null;
            return true;
        }
        return false;
    }

    public boolean regarregarCanhao() {
        if(municaoCarregada == null){
            municaoCarregada = municoes.get(municoes.size()-1);
            municoes.remove(municoes.size()-1);
            return true;
        }
        return false;
    }

    public boolean adicionarMunicao(Municao municao) {
        if(municao.getCalibre() == calibreCanhao){
            municoes.add(municao);
            return true;
        }
        return false;
    }

    public boolean ligarMotor() {
        return true;
    }
}
