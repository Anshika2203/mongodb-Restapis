package mongodbexample.rep;
import mongodbexample.models.Student;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
