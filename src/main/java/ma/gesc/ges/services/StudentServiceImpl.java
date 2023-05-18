package ma.gesc.ges.services;

import ma.gesc.ges.dto.StudentDto;
import ma.gesc.ges.dto.StudentIdDTO;
import ma.gesc.ges.mapper.StudentMapper;
import ma.gesc.ges.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository repository;


    private StudentMapper mapper= Mappers.getMapper(StudentMapper.class);



    @Override
    public StudentDto save(StudentDto dto) {
      return mapper.convertEntityToDto(repository.save(mapper.convertDtoToEntity(dto)));




    }

    @Override
    public StudentDto update(StudentDto dto) {
        return mapper.convertEntityToDto(repository.save(mapper.convertDtoToEntity(dto)));
    }

    @Override
    public Boolean deleteById(StudentIdDTO idDto) {
        repository.deleteById(mapper.studentIdDTOToStudentId(idDto));
        return true;
    }


    @Override
    public List<StudentDto> selectAll() {
        return mapper.convertEntityToDto(repository.findAll());
    }

    public StudentDto findById(StudentIdDTO idDto) {
       // LOGGER.debug("start method findById idDto : {} ", idDto);
        return mapper.convertEntityToDto(
                repository.
                        findById(mapper.studentIdDTOToStudentId(idDto))
                        .orElse(null));
    }
}
