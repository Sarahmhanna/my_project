package ma.gesc.ges.controller;

import ma.gesc.ges.dto.StudentDto;
import ma.gesc.ges.dto.StudentIdDTO;
import ma.gesc.ges.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {

    @Autowired
    private StudentService service;
    @PostMapping("/save")
    public StudentDto save(@RequestBody StudentDto dto) {
        StudentDto se= service.save(dto);
        return se;
    }

    @PutMapping
    public StudentDto update(@RequestBody StudentDto dto){
        StudentDto se=service.update(dto);
        return se;
    }


    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long id, @PathVariable("code")String code){
        StudentIdDTO idDTO=new StudentIdDTO(id,code);
        return service.deleteById(idDTO);
    }


    @GetMapping
    public List<StudentDto> selectAll() {
       // LOGGER.debug("Star method selectAll");
        return service.selectAll();
    }

    @GetMapping("/{id}/{code")
    public Boolean findById(@PathVariable("id111") long id, @PathVariable("code")String code){
       // LOGGER.debug("star method findById id : {} code : {} ",id,code);
        StudentIdDTO idDto=new StudentIdDTO(id,code);
        return service.deleteById(idDto);

    }



}
