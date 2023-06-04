package dbclass.movie.dto.movie;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RatingDTO {

    private String code;
    private String name;
}
