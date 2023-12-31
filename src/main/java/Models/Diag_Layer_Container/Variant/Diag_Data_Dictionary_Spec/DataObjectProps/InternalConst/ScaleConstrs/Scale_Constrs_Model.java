package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.InternalConst.ScaleConstrs;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Scale_Constrs_Model {
    @JsonProperty("VALIDITY")
    private String Valadity;
    @JsonProperty("LOWER-LIMIT")
    private String LowerLimit;
    @JsonProperty("UPPER-LIMIT")
    private String UpperLimit;
}
