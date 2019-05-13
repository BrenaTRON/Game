public class ImageButton extends Parent {

    private static final Image NORMAL_IMAGE = null;
    private static final Image PRESSED_IMAGE = null;

    private final ImageView iv;

    public ImageButton() {
        this.iv = new ImageView(NORMAL_IMAGE);
        this.getChildren().add(this.iv);
        });
    } 
}
