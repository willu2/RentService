import java.util.Random;

public class RandomHelper {

    public int ranDig(int ran){
        Random random = new Random();
        int digit = random.nextInt(ran) + 100;
        return digit;
    }

    public boolean ranStat(){
        Random random = new Random();
        int digit = random.nextInt(2);
        if(digit == 1) {
            return true;
        }else {

            return false;
        }
    }
}
