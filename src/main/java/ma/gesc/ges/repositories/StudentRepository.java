package ma.gesc.ges.repositories;

import ma.gesc.ges.entities.Student;
import ma.gesc.ges.entities.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository("repo")
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, StudentId> {
}
