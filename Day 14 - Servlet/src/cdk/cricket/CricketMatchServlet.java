package cdk.cricket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@WebServlet(name = "CricketMatchServlet")
public class CricketMatchServlet extends HttpServlet {


    CopyOnWriteArrayList<MatchDataStructure> list = new CopyOnWriteArrayList<>();


    @Override
    public void init() throws ServletException {


        list.add(new MatchDataStructure("INDIA", "PAKISTAN", "TEST", 500, 100, "INDIA"));
        list.add(new MatchDataStructure("INDIA", "ENGLAND", "ODI", 400, 130, "INDIA"));
        list.add(new MatchDataStructure("INDIA", "SRILANKA", "TWENTY", 200, 190, "INDIA"));
        list.add(new MatchDataStructure("INDIA", "AUSTRALIA", "ODI", 300, 160, "INDIA"));
        list.add(new MatchDataStructure("INDIA", "BANGLADESH", "TEST", 340, 110, "INDIA"));

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String teamName1 = request.getParameter("teamName1");
        String teamName2 = request.getParameter("teamName1");
        String matchType = request.getParameter("matchType");
        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/HTML");
        MatchDataStructure match = search(teamName1,teamName2,matchType);

//        searchTemp(teamName1,teamName2,matchType);

        if (match == null) {
            printWriter.write("<h1> NO SUCH MATCH! </h1>");
        } else {


            printWriter.write("MATCH DETAILS<br/>");
            printWriter.write(match.teamName1 + " : " + match.teamScore1 + "<br/>");
            printWriter.write(match.teamName2 + " : " + match.teamScore2 + "<br/>");
            printWriter.write("WINNER : " + match.winningTeam + "<br/>");

        }
    }

    public MatchDataStructure search(String teamName1, String teamName2, String matchType) {

        System.out.println(list);
        System.out.println(teamName1 +", " + teamName2 + ", " + matchType);

        return list.stream().filter(team -> team.getTeamName1().equalsIgnoreCase(teamName1))
                .filter(team -> team.getTeamName2().equalsIgnoreCase(teamName2))
                .filter(team -> team.getMatchType().equalsIgnoreCase(matchType))
                .findFirst().get();
    }



    private MatchDataStructure searchIterator(String teamName1, String teamName2, String matchType) {
        Iterator<MatchDataStructure> itr = list.iterator();
        while (itr.hasNext()){
            MatchDataStructure matchDataStructure = itr.next();
            if(teamName1.equals(matchDataStructure.teamName1) || teamName2.equals(matchDataStructure.teamName2) || matchType.equals(matchDataStructure.matchType)){
                return matchDataStructure;
            }
        }
        return null;
    }

}

