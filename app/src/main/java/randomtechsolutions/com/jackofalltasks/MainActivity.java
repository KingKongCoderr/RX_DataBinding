package randomtechsolutions.com.jackofalltasks;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

import randomtechsolutions.com.jackofalltasks.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Task task = new Task("task 1", false);
        binding.setTask(task);
        
        /*Switch switch2 = binding.switch2;
        switch2.setOnCheckedChangeListener((compoundButton, bool) -> {
            //task.setPriority(bool);
            task.priority.set(bool);
            //binding.switch1.setChecked(bool);
        });*/
        
        //Lambda onclick listener
       /* Button b = (Button)findViewById(R.id.button);
        *//*b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        
            }
        });*//*
        
        b.setOnClickListener( view -> view
                .setBackgroundColor(getResources()
                        .getColor(R.color.colorPrimary,null)));*/
        
        
    }
}
