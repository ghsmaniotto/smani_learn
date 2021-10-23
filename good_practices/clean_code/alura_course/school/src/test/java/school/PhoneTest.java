package school;

import static org.junit.jupiter.api.Assertions.*;

import com.br.alura.school.Phone;

import org.junit.jupiter.api.Test;

class PhoneTest {

  @Test
  void mustNotCreatePhoneWithInvalidDDD() {
    String errorMessage = "Invalid Phone";

    assertThrows(IllegalArgumentException.class, () -> new Phone(null, "999009900"), errorMessage);

    assertThrows(IllegalArgumentException.class, () -> new Phone("", "999009900"), errorMessage);

    assertThrows(IllegalArgumentException.class, () -> new Phone("invalid_ddd", "999009900"), errorMessage);
  }

  @Test
  void mustNotCreatePhoneWithInvalidNumber() {
    String errorMessage = "Invalid Phone";

    assertThrows(IllegalArgumentException.class, () -> new Phone("99", null), errorMessage);

    assertThrows(IllegalArgumentException.class, () -> new Phone("99", ""), errorMessage);

    assertThrows(IllegalArgumentException.class, () -> new Phone("99", "invalid_number"), errorMessage);
  }

  @Test
  void mustCreatePhoneWithValidAttributes() {
    final String validDDD = "55";
    final String validNumber = "999009900";
    final String formattedPhone = "(" + validDDD + ") " + validNumber;

    assertDoesNotThrow(() -> new Phone(validDDD, validNumber));

    assertEquals(new Phone(validDDD, validNumber).getFormattedPhone(), formattedPhone);
  }
}
