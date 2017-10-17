package randomtechsolutions.com.jackofalltasks;

import android.databinding.BindingAdapter;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.graphics.Typeface;
import android.widget.CompoundButton;
import android.widget.TextView;


/**
 * Created by nande on 10/16/2017.
 */

public class Task {
    public ObservableField<String> title = new ObservableField<>();
    public ObservableBoolean priority = new ObservableBoolean(false);
    
    public Task(String title, boolean priority) {
        this.title.set(title);
        this.priority.set(priority);
    }
    
    @BindingAdapter({"fontType"})
    public static void setFont(TextView textView, String fontName){
    textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(),fontName));
    }
    
    public void switchClick(CompoundButton button, boolean bool){
        priority.set(bool);
    }
}
