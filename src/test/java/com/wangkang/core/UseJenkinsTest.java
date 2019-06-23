package com.wangkang.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UseJenkinsTest {

    private UseJenkinsfile useJenkinsfile;

    @Before
    public void setup(){
        useJenkinsfile = new UseJenkinsfileImpl();
    }

    @Test
    public void addJenkinsfile(){
        boolean isSuccess = useJenkinsfile.addJenkinsfile("wangkang");
        Assert.assertEquals(true,isSuccess);
    }

    @Test
    public void deleteJenkinsfile(){
        boolean isSuccess =useJenkinsfile.deleteJenkinsfile("wangkang");
        Assert.assertEquals(true,isSuccess);
    }

    @Test
    public void updateJenkinsfile(){
        int temp = useJenkinsfile.updateJenkinsfile(5);
        Assert.assertEquals(5,temp);
    }

    @Test
    public void query(){
        int temp = useJenkinsfile.query(5);
        Assert.assertEquals(5,temp);
    }

    @Test
    public void testAddOnefile(){
        int temp = useJenkinsfile.addOnefile(5);
        Assert.assertEquals(5,temp);
    }
}
