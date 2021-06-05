<?php
class TempoDecorrido {

  var $horas, $minutos, $segundos;

  function __construct($horas = 0, $minutos = 0, $segundos = 0) {
    if ($horas < 0) {
      throw new Exception("horas negativas ${horas}");
    }
    if ($minutos < 0) {
      throw new Exception("minutos negativos ${minutos}");
    }
    if ($segundos < 0) {
      throw new Exception("segundos negativos ${segundos}");
    }
    if ($segundos >= 60) {
      $minutos += $segundos / 60;
      $this->segundos = $segundos % 60;
    } else {
      $this->segundos = $segundos;
    }
    if ($minutos >= 60) {
      $horas += $minutos / 60;
      $this->minutos = $minutos % 60;
    } else {
      $this->minutos = $minutos;
    }
    $this->horas = $horas;
  }

  function __toString() {
    return sprintf("%02d:%02d:%02d",
      $this->horas,
      $this->minutos,
      $this->segundos);
  }

}

$t = new TempoDecorrido(20, 80, -70);
echo $t;