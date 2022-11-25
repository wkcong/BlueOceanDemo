package com.wangkang.core;

import com.wangkang.util.Util;

public class UseJenkinsfileImpl implements UseJenkinsfile {
    public boolean addJenkinsfile(String jenkinsfileName) {
        //jenkinsfileName is not empty,retuen true
        return true;
    }

    public boolean deleteJenkinsfile(String jenkinsfileName) {
        //jenkinsfileName is not empty ; return true
        return true;
    }

    public int updateJenkinsfile(int number) {
        return number;
    }

    public int query(int id) {
        return id;
    }

    public int addOnefile(int number) {
        return number;
    }
}
