package dot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/7/23 - 15:18
 * @apiNote
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private Integer id;
    private String name;
    private double money;
    private String country;
}
