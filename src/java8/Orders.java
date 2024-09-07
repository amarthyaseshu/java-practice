package java8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Orders {

    private String orderNum;
    private String emailId;
    private BigDecimal amount;
}
