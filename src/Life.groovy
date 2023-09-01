import java.io.Serializable

public class Life implements Serializable {
    private String time;
    private String cousine;
    private Boolean sex;
    private Float amountOfSperm;

    public Life(String time, String cousine, Boolean sex, Float amountOfSperm) {
        this.time = time;
        this.cousine = cousine;
        this.sex = sex;
        this.amountOfSperm = amountOfSperm;
    }

    public void timeToMeet() {
        echo "we met" + this.time;
    }

    public void  whatToEat() {
        echo "we ate" + this.cousine;
    }

    public void wasItGood() {
        if (this.sex) {
            echo "That hole was awesome";
        }
        else {
            echo "That stick was too big";
        }
    }

    public void wiseMan() {
        echo this.amountOfSperm + "was like a galon of milk";
    }

}