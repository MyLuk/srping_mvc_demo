package lucky.myluk.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("silly")
public class SillyController {

    @RequestMapping("/showForm")
    public String showSillyForm() {
        return "silly";
    }



}
