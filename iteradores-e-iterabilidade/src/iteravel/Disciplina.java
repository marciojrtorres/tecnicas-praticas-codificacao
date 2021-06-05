package iteravel;

import java.util.Iterator;

public class Disciplina implements Iterable<Double> {

  private class NotasIterator implements Iterator<Double> {

    private int i = 0;

    @Override
    public boolean hasNext() {
      if (i == 0 && nota1oBim != null) return true;
      if (i == 1 && nota2oBim != null) return true;
      if (i == 2 && nota3oBim != null) return true;
      if (i == 3 && nota4oBim != null) return true;
      if (i == 4 && notaExame != null) return true;

      return false;
    }

    @Override
    public Double next() {
      i = i + 1;
      if (i == 1 && nota1oBim != null) return nota1oBim;
      if (i == 2 && nota2oBim != null) return nota2oBim;
      if (i == 3 && nota3oBim != null) return nota3oBim;
      if (i == 4 && nota4oBim != null) return nota4oBim;
      if (i == 5 && notaExame != null) return notaExame;
      throw new IndexOutOfBoundsException();
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

  @Override
  public Iterator<Double> iterator() {
    return new NotasIterator();
  }

  private String nome;
  private Double nota1oBim, nota2oBim,
    nota3oBim, nota4oBim, notaExame;

  public Disciplina(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNota1oBim(Double nota1oBim) {
    this.nota1oBim = nota1oBim;
  }

  public void setNota2oBim(Double nota2oBim) {
    this.nota2oBim = nota2oBim;
  }

  public void setNota3oBim(Double nota3oBim) {
    this.nota3oBim = nota3oBim;
  }

  public void setNota4oBim(Double nota4oBim) {
    this.nota4oBim = nota4oBim;
  }

  public void setNotaExame(Double notaExame) {
    this.notaExame = notaExame;
  }

  public static void main(String[] args) {
    Disciplina disciplina = new Disciplina("Engenharia de Software");
    disciplina.setNota1oBim(8.2);
    disciplina.setNota2oBim(6.8);
    disciplina.setNota3oBim(7.1);

    for (Double nota : disciplina) {
      System.out.println(nota);
    }

  }
}