package cloud.deuterium.atom.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MilanNuke 13-May-20
 */

@Slf4j
@RestController
@RequestMapping("/atoms")
public class AtomController {

    @GetMapping
    public String[] getAtoms(){
        log.info("Get Atoms");
        return new String[]{"Deuterium", "Helium", "Hydrogen", "Lithium"};
    }

}
