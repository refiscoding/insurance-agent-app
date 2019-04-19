package ke.co.insuranceapp.Models;

public class ADImage {
    String url;
    int drawable;

    public ADImage(String url) {
        this.url = url;
    }

    public ADImage(int drawable) {
        this.drawable = drawable;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
