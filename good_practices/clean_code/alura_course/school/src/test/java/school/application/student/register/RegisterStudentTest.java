package school.application.student.register;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.br.alura.school.application.student.registration.RegisterStudent;
import com.br.alura.school.application.student.registration.RegisterStudentDTO;
import com.br.alura.school.domain.EventPublisher;
import com.br.alura.school.domain.student.CPF;
import com.br.alura.school.domain.student.Student;
import com.br.alura.school.infra.student.StudentRepositoryInMemory;

import org.junit.jupiter.api.Test;

public class RegisterStudentTest {

  @Test
  void studentMustBePersisted() {
    StudentRepositoryInMemory repository = new StudentRepositoryInMemory();
    EventPublisher publisher = new EventPublisher();

    RegisterStudent useCase = new RegisterStudent(repository, publisher);

    RegisterStudentDTO data = new RegisterStudentDTO("Fulano", "fulano@email.com", "123.456.789-00");
    useCase.register(data);

    Student student = repository.searchByCPF(new CPF("123.456.789-00"));
    assertEquals("Fulano", student.getName());
    assertEquals("123.456.789-00", student.getCpf().getNumber());
    assertEquals("fulano@email.com", student.getEmail());
  }
}
