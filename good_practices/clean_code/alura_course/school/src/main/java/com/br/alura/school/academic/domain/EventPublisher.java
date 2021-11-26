package com.br.alura.school.academic.domain;

import java.util.ArrayList;
import java.util.List;

public class EventPublisher {

  private List<Listener> listeners = new ArrayList<>();

  public void addListener(Listener listener) {
    this.listeners.add(listener);
  }

  public void publish(Event event) {
    this.listeners.forEach(l -> {
      l.process(event);
    });
  }
}
