import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class DataHelper {

    private List structureList;// = new ArrayList();
    private List allDbList;// = new ArrayList();

    public DataHelper() {
        this.structureList = new ArrayList();
        createStructure();

        this.allDbList = new ArrayList<ItemPosition>();
        addAllData();

    }

    private void createStructure(){
        structureList.add("School");
        structureList.add("KinderGargen");
        structureList.add("PlayRoom");
        structureList.add("Hospital");
    }

    private void addAllData(){
        ItemPosition itemPosition;
        Random random = new Random();
        for (int i = 0; i < 50; i++){
            int rand = random.nextInt((i * 11 + 55) * 4) + 22;
            itemPosition = new ItemPosition(ItemPosition.ItemType.getRandomType(), randDigit(rand), randDigit(rand),
                randDigit(rand), randDigit(rand), randDigit(rand), randDigit(rand), randStatus());
            allDbList.add(itemPosition);
        }
    }

    private int randDigit(int ran){
        Random random = new Random();
        int digit = random.nextInt(ran) + 100;
        return digit;
    }

    public boolean randStatus(){
        Random random = new Random();
        int digit = random.nextInt(2);
        if(digit == 1) {
            return true;
        }else {

            return false;
        }
    }

    public void showAllData(){
        for (Iterator<ItemPosition> it = allDbList.iterator(); it.hasNext(); ) {
            ItemPosition item = it.next();
            printItemList(item);
        }
    }

    private void printItemList(ItemPosition item){
        System.out.print("Type: > " + item.getItemType());
        System.out.print(" ||_Dist To School: > " + item.getDistToSchool() + " m");
        System.out.print(" ||_Dist To Kinder Gargen: > " + item.getDistToKinderGargen() + " m");
        System.out.print(" ||_Dist To Play Room: > " + item.getDistanceToPlayRoom() + " m");
        System.out.print(" ||_Dist To Hospital: > " + item.getDistanceToHOspital() + " m");
        System.out.print(" ||_Rent Status: > " + item.isStatus());
        System.out.print(" ||_price: > " + item.getPrice() + " grn");
        System.out.println();
    }

    public List getStructureList() {
        return structureList;
    }
}
