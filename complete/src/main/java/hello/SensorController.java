package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SensorController {


    Sensor whatever = new Sensor(0.0, 0.0, 0.0);

    private static final Logger LOGGER = LoggerFactory.getLogger(SensorController.class);


    @GetMapping("/updateData")
    public ResponseEntity update(@RequestParam(value="x") Double x,@RequestParam(value="y") Double y,
                  @RequestParam(value="z") Double z) {
        LOGGER.info("UpDaTiNg {}, {}, {}", x, y,z);
        whatever.updateVals(x,y,z);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("/getData")
    public Sensor getData() {
        return whatever;
    }
}
