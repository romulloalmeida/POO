public class UsuarioJogo {

    private String nome;
    private String nickname;
    private int pontuacao=0;
    private  int nivel=1;

    public UsuarioJogo(String nome, String nickname){
        this.nome = nome;
        this.nickname = nickname;
    }

    public void aumentarPontuacao(){
        this.pontuacao += 1;
    }

    public void subirNivel(){
        this.nivel += 1;
    }

    public void bonus(int valor){
        this.pontuacao += valor;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getNickname() {
        return nickname;
    }
}