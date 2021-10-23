package school;

import static org.junit.jupiter.api.Assertions.*;

import com.br.alura.school.domain.student.Phone;

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

    assertThrows(IllegalArgumentException.class, () -> new Phone("99", "9999999"), errorMessage);
    assertThrows(IllegalArgumentException.class, () -> new Phone("99", "9999999999"), errorMessage);
  }

  @Test
  void mustCreatePhoneWithValidAttributes() {
    final String validDDD = "55";
    final String validNineNumber = "999999999";
    final String validEigthNumber = "99999999";
    final String formattedPhone = "(" + validDDD + ") " + validNineNumber;

    assertDoesNotThrow(() -> new Phone(validDDD, validNineNumber));
    assertDoesNotThrow(() -> new Phone(validDDD, validEigthNumber));

    assertEquals(new Phone(validDDD, validNineNumber).getFormattedPhone(), formattedPhone);
  }
}
