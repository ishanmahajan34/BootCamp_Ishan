package cdk.cricket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
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
        list.add(new MatchDataStructure("INDIA", "ENGLAND", "5050", 400, 130, "INDIA"));
        list.add(new MatchDataStructure("INDIA", "SRILANKA", "2020", 200, 190, "INDIA"));
        list.add(new MatchDataStructure("INDIA", "AUSTRALIA", "5050", 300, 160, "INDIA"));
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
        MatchDataStructure match = search(teamName1,teamName2,matchType);//new MatchDataStructure("INDIA", "PAKISTAN", "TEST", 500, 100, "INDIA");//search(teamName1,teamName2,matchType).get(0);

        if (match == null) {
            printWriter.write("<h1> NO SUCH MATCH! </h1>");
        } else {


            printWriter.write("MATCH DETAILS<br/>");
            printWriter.write(match.teamName1 + " : " + match.teamScore1 + "<br/>");
            printWriter.write(match.teamName2 + " : " + match.teamScore2 + "<br/>");
            printWriter.write("WINNER : " + match.winningTeam + "<br/>");

        }
    }

    private MatchDataStructure search(String teamName1, String teamName2, String matchType) {

        return list.stream().filter(team -> team.getTeamName1().equals(teamName1))
                .filter(team -> team.getTeamName2().equals(teamName2))
                .filter(team -> team.getMatchType().equals(matchType))
                .findFirst().get();
    }
}

