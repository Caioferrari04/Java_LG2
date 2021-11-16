import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Panther implements Tanque {
    private List<Municao> municoes = new ArrayList<>();
    private Integer calibreCanhao = 75;
    private Integer potenciaMotor = 500;
    private Municao municaoCarregada;
    private boolean transmissaoFunciona = true;

    public boolean atirarCanhao() {
        Random rand = new Random();
        if(municaoCarregada != null && rand.nextInt(100) > 50) {
            municaoCarregada = null;
            return true;
        }
        return false;
    }

    public boolean regarregarCanhao() {
        Random rand = new Random();
        if(municoes != null && municoes.size() > 0){
            var municao = municoes.get(municoes.size()-1);
            if(municao.getTipo() == "APCBC" && rand.nextInt(100) > 50){
                municaoCarregada = municao;
                municoes.remove(municoes.size()-1);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean adicionarMunicao(Municao municao) {
        Random rand = new Random();
        if(municao.getCalibre() == calibreCanhao && rand.nextInt(100) > 50){
            municoes.add(municao);
            return true;
        }
        return false;
    }

    public boolean ligarMotor() {
        Random rand = new Random();
        if(rand.nextInt(100) > 50) return true;
        transmissaoFunciona = false;
        return transmissaoFunciona;
    }
}
