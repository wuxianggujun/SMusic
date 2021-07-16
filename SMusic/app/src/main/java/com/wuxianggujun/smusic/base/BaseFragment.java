package com.wuxianggujun.smusic.base;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.annotation.IdRes;
import androidx.lifecycle.LiveData;
import androidx.core.util.Pair;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import androidx.annotation.Nullable;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public abstract class BaseFragment extends Fragment {
    protected ResultArgs mArgs;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutResId(),container,false);      
        return rootView;
    }

    public abstract void initView(View rootView);
 
    public abstract int getLayoutResId();

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {      
        super.onActivityCreated(savedInstanceState);
        mArgs = new ResultArgs(getArguments());
        initView(getView());
    }
      
    protected abstract void onBindListener();

    protected void go(@IdRes int destination) {
        go(destination, null);
    }

    protected void go(@IdRes int destination, Bundle bundle) {
        getNavController().navigate(destination, bundle);
    }

    protected void back() {
        getNavController().popBackStack();
    }

    protected <T> void setResult(T data) {
        if (null == mArgs || 0 >= mArgs.getRecipientId()) {
            return;
        }
        getNavController().getBackStackEntry(mArgs.getRecipientId()).getSavedStateHandle().getLiveData(String.valueOf(mArgs.getRequestCode())).postValue(new Pair(mArgs.getRequestCode(), data));
    }

    /**
     * @param destination 要迁移到的页面
     * @param requestCode 与StartActivityForResult 的RequestCode 相同
     * @param <T>         返回数据类型
     * @return {@link LiveData} Pair.first: requestCode; Pair.second: resultData
     */
    protected <T> LiveData<Pair<Integer, T>> startFragmentForResult(@IdRes int destination, int requestCode) {
        return startFragmentForResult(destination, requestCode, null);
    }

    protected <T> LiveData<Pair<Integer, T>> startFragmentForResult(int requestCode, @NonNull NavDirections destination) {
        return startFragmentForResult(destination.getActionId(), requestCode, destination.getArguments());
    }

    protected <T> LiveData<Pair<Integer, T>> startFragmentForResult(@IdRes int destination, int requestCode, @Nullable Bundle bundle) {
        ResultArgs args = new ResultArgs(getNavController().getCurrentDestination().getId(), requestCode).setBusinessArgs(bundle);
        LiveData<Pair<Integer, T>> liveData = getNavController().getCurrentBackStackEntry().getSavedStateHandle().getLiveData(String.valueOf(requestCode));
        getNavController().navigate(destination, args.toBundle());
        return liveData;
    }

    protected void popTo(@IdRes int destination) {
        getNavController().popBackStack(destination, true);
    }

    protected NavController getNavController() {
        return Navigation.findNavController(getView());
    }
    
    
}
