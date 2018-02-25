package customCheckbox;

/**
 * Created by michald on 21/02/2018.
 */
public interface CheckBox extends Element {
    void toggle();
    void check();
    void uncheck();
    boolean isChecked();
}
