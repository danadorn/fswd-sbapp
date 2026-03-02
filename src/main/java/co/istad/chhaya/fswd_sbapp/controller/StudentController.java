package co.istad.chhaya.fswd_sbapp.controller;

import co.istad.chhaya.fswd_sbapp.dto.DataResponse;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping("/{id}/fullstack/{courseType}")
    public DataResponse getStudent(@PathVariable Integer id,
                                   @PathVariable("courseType") String ct,
                                   @RequestParam(required = false, defaultValue = "No gender") String gender){
        return new DataResponse(id, ct, gender);
    }
}
