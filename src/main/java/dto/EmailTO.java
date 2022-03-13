package dto;

public class EmailTO {
    private String enderecoEmail;

    public EmailTO(String enderecoEmail) {
        if (enderecoEmail == null || !enderecoEmail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            throw new IllegalArgumentException("E-mail inválido");
        }else{
            System.out.println("Email válido!!");
        }
        this.enderecoEmail = enderecoEmail;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }
}
}
