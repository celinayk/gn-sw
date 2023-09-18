package dto;

import entity.TourismEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class TourismDTO {
    private Long id;
    private String TourismName;
    private String TourismAddress;
    private String TourismDescription;

    public TourismEntity toEntity() {
        return new TourismEntity(id, TourismName, TourismAddress, TourismDescription);
    }
}
