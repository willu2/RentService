import java.util.*;

public class DataHelper {

    //private List structureList;// = new ArrayList();
    private List allDbList;// = new ArrayList();

    public RandomHelper r = new RandomHelper();

    public DataHelper() {
       /* this.structureList = new ArrayList();
        createStructure();*/

        this.allDbList = new ArrayList<ItemPosition>();
        addAllData();

    }

    /*private void createStructure(){
        structureList.add("School");
        structureList.add("KinderGargen");
        structureList.add("PlayRoom");
        structureList.add("Hospital");
    }
*/
    private void addAllData(){
        ItemPosition itemPosition;
        Random random = new Random();
        for (int i = 0; i < 50; i++){
            int rand = random.nextInt((i * 11 + 55) * 4) + 22;
            itemPosition = new ItemPosition(ItemPosition.ItemType.getRandomType(), r.ranDig(rand), r.ranDig(rand),
                r.ranDig(rand), r.ranDig(rand), r.ranDig(rand), r.ranDig(rand), r.ranStat());
            allDbList.add(itemPosition);
        }
    }

    public void showAllData(){
        for (Iterator<ItemPosition> it = allDbList.iterator(); it.hasNext(); ) {
            ItemPosition item = it.next();
            printItemList(item);
        }
    }

    public void findByRent(){
        for (Iterator<ItemPosition> it = allDbList.iterator(); it.hasNext(); ) {
            ItemPosition item = it.next();
            if(item.isStatus()){
                printItemList(item);
            }
        }
    }

    public void findByPrice(int price){
        for (Iterator<ItemPosition> it = allDbList.iterator(); it.hasNext(); ) {
            ItemPosition item = it.next();
            if(item.getPrice() <= price){
                printItemList(item);
            }
        }
    }

    public void findByPriceAndDistToSchool(int price, int dist){
        for (Iterator<ItemPosition> it = allDbList.iterator(); it.hasNext(); ) {
            ItemPosition item = it.next();
            if(item.getPrice() <= price && item.getDistToSchool() <= dist){
                printItemList(item);
            }
        }
    }
    public void findByPriceAndDistToKinderGargen(int price, int dist){
        for (Iterator<ItemPosition> it = allDbList.iterator(); it.hasNext(); ) {
            ItemPosition item = it.next();
            if(item.getPrice() <= price && item.getDistToKinderGargen() <= dist){
                printItemList(item);
            }
        }
    }
    public void findByPriceAndDistToHospital(int price, int dist){
        for (Iterator<ItemPosition> it = allDbList.iterator(); it.hasNext(); ) {
            ItemPosition item = it.next();
            if(item.getPrice() <= price && item.getDistanceToHOspital() <= dist){
                printItemList(item);
            }
        }
    }

    public void sortItemList(){
        Collections.sort(allDbList);
        iterationPrint(allDbList);
    }

    public void sortReverseItemList(){
        Collections.sort(allDbList, Collections.reverseOrder());
        iterationPrint(allDbList);
    }

    public void iterationPrint(List<ItemPosition> itemDB){
        for (Iterator<ItemPosition> it = itemDB.iterator(); it.hasNext(); ) {
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
        System.out.print(" ||_price: > " + item.getPrice() + " $");
        System.out.println();
    }

    /*public List getStructureList() {
        return structureList;
    }*/

    public List getAllDbList() {
        return allDbList;
    }
}
