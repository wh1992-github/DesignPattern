package com.example.designpattern1.iterator;

import com.example.designpattern1.app.LogUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    private static final String TAG = "ListIterator";
    private static final List<String> lists = new ArrayList<>();

    public static ListIterator getIterator() {
        lists.clear();
        lists.add("aaa");
        lists.add("bbb");
        lists.add("ccc");
        lists.add("ddd");
        return new ListIterator();
    }

    public void printList() {
        Iterator<String> iterator1 = lists.iterator();
        while (iterator1.hasNext()) {
            String next = iterator1.next();
            if ("bbb".equals(next)) {
                iterator1.remove();
            }
            LogUtil.i(TAG, "printList: size = " + lists.size() + ", item = " + next);
        }

        Iterator<String> iterator2 = lists.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.hasNext()) {
                LogUtil.i(TAG, "printList: item = " + iterator2.next());
            }
        }
    }
}
