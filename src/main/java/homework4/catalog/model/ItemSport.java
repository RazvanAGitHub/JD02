package homework4.catalog.model;

import homework4.catalog.SportItemCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class ItemSport implements Serializable {

    private SportItemCategory sportItemCategory;
    private String name;
    private int size;
    private String color;
}
