package mvc;

/**
 * Created by HP-PC on 10.08.2018.
 */
public class Model {

    private String outText="";

    public String getOutText() {
        return outText;
    }
    public void setOutText(String outText) {
        this.outText = outText;
    }

    /**
     * in this method add stringValues with this.outText
     * @param inputText1, inputText2
     */
    public void setOutText(String inputText1, String inputText2){
        outText = inputText1+" "+inputText2;
    }
}
