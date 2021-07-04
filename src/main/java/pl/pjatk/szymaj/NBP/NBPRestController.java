package pl.pjatk.szymaj.NBP;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/nbp")
public class NBPRestController {

    private final NBPService nbpService;
    public NBPRestController(NBPService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/{startDate}/{endDate}")
    public ResponseEntity<DailyRate> getAverageRate(@PathVariable String startDate, String endDate)
    {   ArrayList DailRateList = new ArrayList();
        return (ResponseEntity.ok().body(nbpService.getDataByDate(startDate, endDate)));
    }
}
