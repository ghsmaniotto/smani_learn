package school.domain.student;

import static org.junit.jupiter.api.Assertions.*;

import com.br.alura.school.domain.student.Email;

import org.junit.jupiter.api.Test;

class EmailTest {

  @Test
  void mustNotCreateEmailWithInvalidAddress() {
    assertThrows(IllegalArgumentException.class, () -> new Email(null));

    assertThrows(IllegalArgumentException.class, () -> new Email(""));

    assertThrows(IllegalArgumentException.class, () -> new Email("invalid_email"));
  }

  @Test
  void mustCreateEmailWithValidAddress() {
    final String validEmail = "valid@email.com";

    assertDoesNotThrow(() -> new Email(validEmail));
    
    assertEquals(new Email(validEmail).getAddreess(), validEmail);
  }
}
