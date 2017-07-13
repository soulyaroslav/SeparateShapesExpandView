package soulyaroslav.morphingview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import soulyaroslav.library.SeparateShapesView;

public class MainActivity extends AppCompatActivity implements SeparateShapesView.OnButtonClickListener {

    private SeparateShapesView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (SeparateShapesView) findViewById(R.id.view);
        view.setOnButtonClickListener(this);

    }

    @Override
    public boolean onLeftButtonClick() {
        Toast.makeText(this, "MainActivity, left works!!", Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onRightButtonClick() {
        Toast.makeText(this, "MainActivity, right works!!", Toast.LENGTH_SHORT).show();
        return true;
    }
}
