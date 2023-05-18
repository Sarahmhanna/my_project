package ma.gesc.ges.services;

import ma.gesc.ges.dto.StudentDto;
import ma.gesc.ges.dto.StudentIdDTO;

import java.util.List;

public interface StudentService {



    StudentDto save(StudentDto dto);
    StudentDto update(StudentDto dto);
    //Boolean delete ( Long id);

    Boolean deleteById(StudentIdDTO idDto);

    List<StudentDto> selectAll();
}


