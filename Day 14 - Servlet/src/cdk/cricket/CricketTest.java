package cdk.cricket;

import org.junit.Test;

import javax.servlet.ServletException;

public class CricketTest {
    @Test
    public void testMatch() throws ServletException {
        CricketMatchServlet s =  new CricketMatchServlet();
        s.init();
        MatchDataStructure result = s.search("India", "Pakistan", "test");
        System.out.println(result);
    }

}
