package school;

import static org.junit.jupiter.api.Assertions.*;

import com.br.alura.school.domain.student.CPF;

import org.junit.jupiter.api.Test;

class CPFTest {

  @Test
  void mustNotCreateCPFWithInvalidNumber() {
    String errorMessage = "Invalid CPF";

    assertThrows(IllegalArgumentException.class, () -> new CPF(null), errorMessage);

    assertThrows(IllegalArgumentException.class, () -> new CPF(""), errorMessage);

    assertThrows(IllegalArgumentException.class, () -> new CPF("invalid_cpf"), errorMessage);
  }

  @Test
  void mustCreateCPFWithValidNumber() {
    final String validCpf = "123.123.123-12";

    assertDoesNotThrow(() -> new CPF(validCpf));
    
    assertEquals(new CPF(validCpf).getNumber(), validCpf);
  }
}
