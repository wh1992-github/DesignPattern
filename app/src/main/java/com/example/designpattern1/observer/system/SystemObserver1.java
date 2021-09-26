package com.example.designpattern1.observer.system;

import com.example.designpattern1.app.LogUtil;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by test on 2016/10/21.
 * 最后是第一个使用者：
 */

public class SystemObserver1 implements Observer {
    private static final String TAG = "Observer1";

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectForSSW) {
            SubjectForSSW subjectForSSW = (SubjectForSSW) o;
            LogUtil.i(TAG, "SubjectForSSW: subjectForSSW's msg = " + subjectForSSW.getMsg());
        }
        if (o instanceof SubjectForSSQ) {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            LogUtil.i(TAG, "SubjectForSSQ: subjectForSSQ's msg = " + subjectForSSQ.getMsg());
        }
    }
}
