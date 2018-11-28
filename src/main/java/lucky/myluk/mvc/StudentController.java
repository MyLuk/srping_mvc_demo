package lucky.myluk.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // create a student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);

        // add the country options to the model
        theModel.addAttribute("theCountryOptions", countryOptions);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {

        System.out.println(student.getFirstName()+" "+student.getLastName());

        return "student-confirmation";
    }


}
