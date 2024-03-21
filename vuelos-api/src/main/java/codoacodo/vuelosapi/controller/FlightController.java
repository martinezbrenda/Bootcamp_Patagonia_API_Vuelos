package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Flight;
import codoacodo.vuelosapi.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")

public class FlightController {
    @Autowired
    private FlightService flightService;
    @GetMapping("/HolaMundo")
    public String HolaMundo(){
        return flightService.HolaMundo();
    }
    @GetMapping("/flightsList")
    public List<Flight> getAllFlights(){
        return flightService.getAllFlights();
    }
    @PostMapping("/add")
    public ResponseEntity<String> addFlight (@RequestBody Flight flight){
        flightService.addFlight(flight);
        return ResponseEntity.ok("Flight sucessfully added");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String>updateFlight(@PathVariable Long id, @RequestBody Flight flight){
        boolean updated = flightService.updateFlight(id, flight);
        if(updated){
            return ResponseEntity.ok("Flight successfully updated");
        }else{
            return ResponseEntity.notFound().build();
        }
    }


}