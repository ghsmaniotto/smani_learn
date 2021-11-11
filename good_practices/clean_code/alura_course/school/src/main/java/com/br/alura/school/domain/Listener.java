package com.br.alura.school.domain;

public abstract class Listener {
  public void process(Event event) {
    if (this.mustProcess(event)) {
      this.reactTo(event);
    }
  }

  protected abstract void reactTo(Event event);

  protected abstract boolean mustProcess(Event event);
}
