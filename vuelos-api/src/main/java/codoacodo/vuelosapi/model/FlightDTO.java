package codoacodo.vuelosapi.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlightDTO {

    private Long id;
    private String origin;
    private String destination;
    private String departureDate;
    private String arrivalDate;
    private double convertedPrice;
    private String frequency;
    private Company company;
}
