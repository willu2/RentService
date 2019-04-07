import java.util.Random;

public class ItemPosition implements Comparable<ItemPosition>{

    enum ItemType {
            HOUSE,
            HUT,
            FLAT,
            VILLA,
            SEMI_DETACHED_HOUSE,
            COTTAGE;

            //public void setItemType(ItemType type){itemType = type;        }

        public static ItemType getRandomType() {
                Random random = new Random();
                return values()[random.nextInt(values().length)];
            }
    }

    private ItemType itemType;
    private String itemStatus = "Active";
    private int distance;
    private int distToSchool;
    private int distToKinderGargen;
    private int distanceToPlayRoom;
    private int distanceToHOspital;
    private Integer price;
    private boolean status;

    public ItemPosition(ItemType itemType, int distance, int distToSchool, int distToKinderGargen, int distanceToPlayRoom, int distanceToHOspital, Integer price, boolean status) {
        this.itemType = itemType;
        this.distance = distance;
        this.distToSchool = distToSchool;
        this.distToKinderGargen = distToKinderGargen;
        this.distanceToPlayRoom = distanceToPlayRoom;
        this.distanceToHOspital = distanceToHOspital;
        this.price = price;
        this.status = status;
    }

    public ItemPosition() {
    }

    public int getDistToSchool() {
        return distToSchool;
    }

    public int getDistToKinderGargen() {
        return distToKinderGargen;
    }

    public int getDistanceToPlayRoom() {
        return distanceToPlayRoom;
    }

    public int getDistanceToHOspital() {
        return distanceToHOspital;
    }


    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isStatus() {
         return status;
     }

    @Override
    public String toString() {
        return "Rent [price=" + price + "]";
    }



    @Override
    public int compareTo(ItemPosition o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}


