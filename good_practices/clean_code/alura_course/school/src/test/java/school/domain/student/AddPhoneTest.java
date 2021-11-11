package school.domain.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.br.alura.school.domain.student.Student;
import com.br.alura.school.domain.student.StudentFactory;
import com.br.alura.school.domain.student.TooManyPhonesException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddPhoneTest {

  private Student student;

  @BeforeEach
  void beforeEach() {
    this.student = new StudentFactory().withNameCPFEmail("Fulano da Silva", "123.456.789-10", "fulano@silva.com")
        .create();
  }

  @Test
  void itShouldAllowAddOnePhone() {
    this.student.addPhone("55", "998008877");
    assertEquals(this.student.getPhones().size(), 1);
  }

  @Test
  void itShouldAllowAddTwoPhones() {
    this.student.addPhone("55", "998008877");
    this.student.addPhone("55", "998008822");
    assertEquals(this.student.getPhones().size(), 2);
  }

  @Test
  void itShouldThrowExceptionWhenAddThreePhones() {
    assertThrows(TooManyPhonesException.class, () -> {
      this.student.addPhone("55", "998008877");
      this.student.addPhone("55", "998008811");
      this.student.addPhone("55", "998008822");
    });
  }
}
