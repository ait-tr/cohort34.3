package homework.parcels;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShipmentAppl {

    private static final int MIN_CONTAINERS = 10;
    private static final int MAX_CONTAINERS = 20;
    private static final int MIN_BOXES = 10;
    private static final int MAX_BOXES = 20;
    private static final int MIN_PARCELS = 5;
    private static final int MAX_PARCELS = 10;

    private static Random random = new Random();

    public static void main(String[] args) {

        List<Container> containers = new ArrayList<>();
        List<Box> boxes = new ArrayList<>();
        List<Parcel> parcels = new ArrayList<>();


        int numContainers = new Random().nextInt(MIN_CONTAINERS, MAX_CONTAINERS);
        int numBoxes = new Random().nextInt(MIN_BOXES, MAX_BOXES);
        int numParcels = new Random().nextInt(MIN_PARCELS, MAX_PARCELS);

        for (int i = 0; i < numContainers; i++) {
            for (int j = 0; j < numBoxes; j++) {
                for (int k = 0; k < numParcels; k++) {
                    parcels.add(new Parcel(2));
                }
                boxes.add(new Box(parcels));
            }
           // containers.add(new Container("Label" + i, boxList)); // ????????
        }



    }
    //-------Container-----------------------------------------


    //--------Box----------------------------------------


    //---------- Parcel ----------------------------------------


}