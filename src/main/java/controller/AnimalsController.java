package controller;

import dao.AnimalDAO;
import model.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class AnimalsController {

    @GetMapping("")
    public ModelAndView modelAndView() {
        ModelAndView modelAndView = new ModelAndView("home");
        List<Animal> animalList = AnimalDAO.animalList();
        modelAndView.addObject("animals", animalList);
        return modelAndView;
    }



//    @PostMapping("/save")
//    public String savePerson(@ModelAttribute("person") PersonForm personForm, Model model){
//        // Add other information to Entity
//        Person person = new Person(personForm.getId(),personForm.getName());
//        // Get default path of file
//        String fileUpload = environment.getProperty("file_upload");
//        // Get file from request
//        MultipartFile file = personForm.getImg();
//        // Get name of file
//        String image = file.getOriginalFilename();
//        // Set name of file to Entity
//        person.setImg(image);
//        try {
//            // Add file to Folder
//            FileCopyUtils.copy(file.getBytes(), new File(fileUpload + image));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        model.addAttribute("person",person);
//        return "result";
//    }

}
