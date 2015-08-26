package io.pivotal.pulse.InterfaceAdapters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {

    @RequestMapping("/project/new")
    public String goToNewProjectPage() {
        return "project/new";
    }
}
