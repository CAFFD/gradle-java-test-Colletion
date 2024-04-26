package application.models;

public class Opcao{
    private long id;
    private boolean correto;
    private String descricao;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public boolean getCorreto(){
        return correto;
    }
    public void setCorreto(boolean correto){
        this.correto = correto;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setdescricao(String descricao){
        this.descricao = descricao;
    }
}