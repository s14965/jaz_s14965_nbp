package pl.pjatk.szymaj.NBP;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class NBPService {

    private final RestTemplate restTemplate;

    public NBPService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DailyRate getDataByDate(String startDate, String endDate) {
        return restTemplate.getForEntity("http://api.nbp.pl/api/cenyzlota/" + startDate + "/" + endDate+ "/",DailyRate.class ).getBody();

    }
}
