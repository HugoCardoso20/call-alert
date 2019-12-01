public class Aluno {

  public String ra;

  public Aluno(String ra) {
      setRA(ra);
  }

  public String getRA() {
    return ra;
  }

  public void setRA(String ra) {
     this.ra = ra;
  }
 }
 
public class Visitante {

  public String cpf;

  public Visitante(String cpf) {
      setCPF(cpf);
  }

  public String getCPF() {
    return cpf;
  }

  public void setCPF(String cpf) {
     this.cpf = cpf;
  }
}
 
public class Pedidos {

  public String status;
  public String tipo

  public Pedidos(String status, String tipo) {
      setStatus(status);
      setTipo(tipo);
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
     this.status = status;
  }
  
    public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
     this.tipo = tipo;
  }
}
