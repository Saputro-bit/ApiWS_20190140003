/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package cemilan.praktikum.pws;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asus
 */
@Controller
@RestController
@RequestMapping("/DataIwak")
public class DataBaseController {
    @Autowired
    private IkanRepo tokoikan;
    
    @GetMapping("/Ikan")
  public List<TokoIkan> getAlltokoikan(){
      return tokoikan.findAll();
  }
   @GetMapping ("/Ikan/{id}")
    public TokoIkan gettokoikanById(@PathVariable Long id){
        return tokoikan.findById(id).get();
    }
    
    @PostMapping ("/Ikan")
    public TokoIkan savetokoikanDetails(@RequestBody TokoIkan s){
        return tokoikan.save(s);
    }
    
    @PutMapping("/Ikan")
    public TokoIkan updateOushop(@RequestBody TokoIkan s){
        return tokoikan.save(s);
    }
    
    @DeleteMapping("/Ikan/{id}")
    public ResponseEntity<HttpStatus> deleteTokoIkanById(@PathVariable Long id){
        tokoikan.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}