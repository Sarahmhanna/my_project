package ma.gesc.ges.mapper;

import ma.gesc.ges.dto.StudentDto;
import ma.gesc.ges.dto.StudentIdDTO;
import ma.gesc.ges.entities.Student;
import ma.gesc.ges.entities.StudentId;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {



     Student convertDtoToEntity(StudentDto dto);
     StudentDto convertEntityToDto(Student student);
     List<Student> convertDtoToEntities(List<StudentDto> students);
     List<StudentDto> convertEntityToDto (List < Student > dtos);
     StudentId studentIdDTOToStudentId(StudentIdDTO studentIdDto);
}
