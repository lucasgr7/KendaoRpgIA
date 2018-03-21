import java.awt.List;

public class DtoMovimentacaoResponse{

    public Integer x;
    public Integer y;
    public List<String> erros;
    protected boolean ExisteErro(String tpErro){
        if(erros == null || erros.size() == 0){
            return false;
        }
        for(MovimentacaoIA.TipoErro t : erros){
            if(t.equals(tpErro))
                return true;
        }
        return false;
    }
}