package com.example.designpattern2.visitor;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/6/7 21:53
 * @description
 */
public interface CorporateSlave {
    void accept(CorporateSlaveVisitor visitor);
}
