package Models.Diag_Layer_Container.Variants.Variant.Diag_Comms;

import Models.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Diag_Service_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Diag_Comms_Model {
    @JsonProperty("DIAG-SERVICE")
    private List<Diag_Service_Model> diagService;
}
