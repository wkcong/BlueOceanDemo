package com.wangkang.core;

public interface UseJenkinsfile {

    boolean addJenkinsfile(String jenkinfileName);

    boolean deleteJenkinsfile(String jenkinsfileName);

    int updateJenkinsfile(int number);

    int query(int id);

    int addOnefile(int number);

}
