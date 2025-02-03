package guru.springframework.spring6restmvc.controler;

import guru.springframework.spring6restmvc.services.BeerService;
import guru.springframework.spring6restmvc.model.Beer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id){

        log.debug("Get Beer by Id - in controller");

        return beerService.getBeerById(id);
    }
}
