package dto;

public class CpfTO {
    private String numero;

    public CpfTO(String numero) {
        if(numero != null || numero.matches(("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))){
          System.out.println("CPF Válido!!");
            this.numero = numero;
        }
        throw new IllegalArgumentException("CPF inválido!!");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
