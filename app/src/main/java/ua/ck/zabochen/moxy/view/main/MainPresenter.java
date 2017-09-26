package ua.ck.zabochen.moxy.view.main;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    public void buttonClick() {
        getViewState().setText("Hello Moxy!");
    }

}
