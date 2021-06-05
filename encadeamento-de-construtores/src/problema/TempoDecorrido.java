package problema;

public class TempoDecorrido {

  private int horas, minutos, segundos;

  public TempoDecorrido(int horas, int minutos, int segundos) {
    if (horas < 0) {
      throw new IllegalArgumentException("horas negativas " + horas);
    }
    if (minutos < 0) {
      throw new IllegalArgumentException("minutos negativos " + minutos);
    }
    if (segundos < 0) {
      throw new IllegalArgumentException("segundos negativos " + segundos);
    }
    if (segundos >= 60) {
      minutos += segundos / 60;
      this.segundos = segundos % 60;
    } else {
      this.segundos = segundos;
    }
    if (minutos >= 60) {
      horas += minutos / 60;
      this.minutos = minutos % 60;
    } else {
      this.minutos = minutos;
    }
    this.horas = horas;
  }

  public TempoDecorrido(int minutos, int segundos) {
    if (minutos < 0) {
      throw new IllegalArgumentException("minutos negativos " + minutos);
    }
    if (segundos < 0) {
      throw new IllegalArgumentException("segundos negativos " + segundos);
    }
    if (segundos >= 60) {
      minutos += segundos / 60;
      this.segundos = segundos % 60;
    } else {
      this.segundos = segundos;
    }
    if (minutos >= 60) {
      this.horas = minutos / 60;
      this.minutos = minutos % 60;
    } else {
      this.minutos = minutos;
    }
  }

  public TempoDecorrido(int segundos) {
    if (segundos < 0) {
      throw new IllegalArgumentException("segundos negativos " + segundos);
    }
    if (segundos >= 60) {
      this.minutos = segundos / 60;
      this.segundos = segundos % 60;
    } else {
      this.segundos = segundos;
    }
    if (this.minutos >= 60) {
      this.horas = this.minutos / 60;
      this.minutos = this.minutos % 60;
    }
  }

  public int getHoras() {
    return this.horas;
  }

  public int getMinutos() {
    return this.minutos;
  }

  public int getSegundos() {
    return this.segundos;
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", horas, minutos, segundos);
  }

  public static void main(String[] args) {
    System.out.println(new TempoDecorrido(1, 150, 3620));
    System.out.println(new TempoDecorrido(150, 3620));
    System.out.println(new TempoDecorrido(3790));
  }

}