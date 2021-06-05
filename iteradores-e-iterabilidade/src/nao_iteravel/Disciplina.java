package nao_iteravel;

public class Disciplina {

  private String nome;
  private Double nota1oBim, nota2oBim,
    nota3oBim, nota4oBim, notaExame;

  public Disciplina(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public Double getNota1oBim() {
    return nota1oBim;
  }

  public void setNota1oBim(Double nota1oBim) {
    this.nota1oBim = nota1oBim;
  }

  public Double getNota2oBim() {
    return nota2oBim;
  }

  public void setNota2oBim(Double nota2oBim) {
    this.nota2oBim = nota2oBim;
  }

  public Double getNota3oBim() {
    return nota3oBim;
  }

  public void setNota3oBim(Double nota3oBim) {
    this.nota3oBim = nota3oBim;
  }

  public Double getNota4oBim() {
    return nota4oBim;
  }

  public void setNota4oBim(Double nota4oBim) {
    this.nota4oBim = nota4oBim;
  }

  public Double getNotaExame() {
    return notaExame;
  }

  public void setNotaExame(Double notaExame) {
    this.notaExame = notaExame;
  }

  public static void main(String[] args) {
    Disciplina disciplina = new Disciplina("Engenharia de Software");
    disciplina.setNota1oBim(8.2);
    disciplina.setNota2oBim(6.8);
    disciplina.setNota3oBim(7.1);
    // consultando as notas cadastradas
    if (disciplina.getNota1oBim() != null) {
      System.out.println(disciplina.getNota1oBim());
    }
    if (disciplina.getNota2oBim() != null) {
      System.out.println(disciplina.getNota2oBim());
    }
    if (disciplina.getNota3oBim() != null) {
      System.out.println(disciplina.getNota3oBim());
    }
    if (disciplina.getNota4oBim() != null) {
      System.out.println(disciplina.getNota4oBim());
    }
    if (disciplina.getNotaExame() != null) {
      System.out.println(disciplina.getNotaExame());
    }
  }
}