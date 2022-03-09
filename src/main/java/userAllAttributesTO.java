package to;

public class userAllAttributesTO {

        private String nome;
        private String sobrenome;
        private String idade;
        private EmailTO email;
        private CpfTO cpf;
        private String endereco;
        private String cep;
        private String saldo;
        private TelefoneTO telefone;
        private String estado;
        private String cidade;
        private Boolean tipoPessoa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Boolean getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(Boolean tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public EmailTO getEmail() {
        return email;
    }

    public void setEmail(EmailTO email) {
        this.email = email;
    }

    public CpfTO getCpf() {
        return cpf;
    }

    public void setCpf(CpfTO cpf) {
        this.cpf = cpf;
    }

    public TelefoneTO getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneTO telefone) {
        this.telefone = telefone;
    }
}
