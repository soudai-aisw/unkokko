import java.io.Serializable

public class Life implements Serializable {
    public Object jenkinsPipeline;
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
        this.jenkinsPipeline.echo "we met" + this.time;
    }

    public void  whatToEat() {
        this.jenkinsPipeline.echo "we ate" + this.cousine;
    }

    public void wasItGood() {
        if (this.sex) {
            this.jenkinsPipeline.echo "That hole was awesome";
        }
        else {
            this.jenkinsPipeline.echo "That stick was too big";
        }
    }

    public void wiseMan() {
        this.jenkinsPipeline.echo this.amountOfSperm + "was like a galon of milk";
    }

}