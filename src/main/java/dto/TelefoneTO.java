package dto;

public class TelefoneTO {
    private String ddd;
    private String numero;

    public TelefoneTO(String ddd, String numero) {
        if (ddd != null  && numero != null || ddd.matches("\\d{2}") &&  numero.matches("\\d{5}\\-\\d{4}")){
            System.out.println("Número de telefone válido!!");
            this.ddd = ddd;
            this.numero = numero;
        }
        throw new IllegalArgumentException("Número inválido!!");
    }
}
