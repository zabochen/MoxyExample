package ua.ck.zabochen.moxy.view.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ua.ck.zabochen.moxy.R;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    @InjectPresenter MainPresenter mMainPresenter;

    @BindView(R.id.activityMain_textView_helloWorld) TextView textHello;
    @BindView(R.id.activityMain_button_clicker) Button buttonClicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Layout & ButterKnife
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.activityMain_button_clicker)
    void onClick(View view) {
        mMainPresenter.buttonClick();
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "Hello Moxy", Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    public void setText(String text) {
        textHello.setText(text);
    }

}
