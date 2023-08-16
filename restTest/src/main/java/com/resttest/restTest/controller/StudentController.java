package com.resttest.restTest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.resttest.restTest.repository.StudentRepo;
import com.resttest.restTest.services.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {
    @Autowired
    private StudentRepo repo;

    //Get All Data
    @GetMapping("/")
    private List<Student> getAllData(){
        return repo.findAll();
    }

    //Get Data by Roll
    @GetMapping("/{roll}")
    private Student getDatabyRoll(@PathVariable Long roll){
        return repo.findById(roll).orElseThrow(()-> new StudentNotFound(roll));
    }

    //Add Data
    @PostMapping("/")
    private Student addData(@RequestBody Student data){
        return repo.save(data);
    }

    //Update Data
    @PutMapping("/{roll}")
    public ResponseEntity<?> updateData(@PathVariable Long roll, @RequestBody Student data){
        try{
            Student isAvailable=getDatabyRoll(roll);
            repo.save(data);
            return new ResponseEntity<Student>(data,HttpStatus.OK);
        }catch (NoSuchElementException excp){
            return new ResponseEntity<Student>(data,HttpStatus.NOT_FOUND);
        }
    }

    //Delete Data
    @DeleteMapping("/{roll}")
    private HttpStatus deleteData(@PathVariable Long roll){
        try {
            Student isAvail=getDatabyRoll(roll);
            repo.deleteById(roll);
            return HttpStatus.OK;
        }catch(NoSuchElementException excp){
            return HttpStatus.NOT_FOUND;
        }
    }

}
