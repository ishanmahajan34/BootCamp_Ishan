package cdk.cricket;

public class MatchDataStructure {

    String teamName1;
    String teamName2;
    String matchType;

    int teamScore1;
    int teamScore2;

    String winningTeam;

    public MatchDataStructure(String teamName1, String teamName2, String matchType, int teamScore1, int teamScore2, String winningTeam) {
        this.teamName1 = teamName1;
        this.teamName2 = teamName2;
        this.matchType = matchType;
        this.teamScore1 = teamScore1;
        this.teamScore2 = teamScore2;
        this.winningTeam = winningTeam;
    }

    public String getTeamName1() {
        return teamName1;
    }

    public void setTeamName1(String teamName1) {
        this.teamName1 = teamName1;
    }

    public String getTeamName2() {
        return teamName2;
    }

    public void setTeamName2(String teamName2) {
        this.teamName2 = teamName2;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public int getTeamScore1() {
        return teamScore1;
    }

    public void setTeamScore1(int teamScore1) {
        this.teamScore1 = teamScore1;
    }

    public int getTeamScore2() {
        return teamScore2;
    }

    public void setTeamScore2(int teamScore2) {
        this.teamScore2 = teamScore2;
    }

    public String getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(String winningTeam) {
        this.winningTeam = winningTeam;
    }


    @Override
    public String toString() {
        return "MatchDataStructure{" +
                "teamName1='" + teamName1 + '\'' +
                ", teamName2='" + teamName2 + '\'' +
                ", matchType='" + matchType + '\'' +
                ", teamScore1=" + teamScore1 +
                ", teamScore2=" + teamScore2 +
                ", winningTeam='" + winningTeam + '\'' +
                '}';
    }
}

