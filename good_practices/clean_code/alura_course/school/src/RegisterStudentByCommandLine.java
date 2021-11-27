import com.br.alura.school.academic.application.student.registration.RegisterStudent;
import com.br.alura.school.academic.application.student.registration.RegisterStudentDTO;
import com.br.alura.school.academic.domain.student.RegisteredStudentLog;
import com.br.alura.school.academic.infra.student.StudentRepositoryInMemory;
import com.br.alura.school.gamification.application.CreateNewStudentStamp;
import com.br.alura.school.gamification.infra.stamp.StampRepositoryInMemory;
import com.br.alura.school.shared.domain.event.EventPublisher;

public class RegisterStudentByCommandLine {

  public static void main(String[] args) {
    String name = "Fulano";
    String cpf = "123.123.123-12";
    String email = "fulano@email.com";

    RegisterStudentDTO registerStudentDTO = new RegisterStudentDTO(name, email, cpf);

    EventPublisher publisher = new EventPublisher();
    publisher.addListener(new RegisteredStudentLog());
    publisher.addListener(
        new CreateNewStudentStamp(new StampRepositoryInMemory()));

    RegisterStudent registerStudent = new RegisterStudent(
        new StudentRepositoryInMemory(), publisher);

    registerStudent.register(registerStudentDTO);

  }

}
