package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class FootballPlayerData implements TableData {
    private ArrayList<FootballPlayer> players;

    public FootballPlayerData() {
        this.players = new ArrayList<>();
        this.ReadPlayersFromXML();
        this.loadTable();
    }

    public void ReadPlayersFromXML() {
        try {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null) {
                try {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } catch (ArrayIndexOutOfBoundsException theend) {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx) {
            xx.printStackTrace();
        }
    }

    @Override
    public void loadTable() {
        // TODO Auto-generated method stub
        this.ReadPlayersFromXML();

    }

    @Override
    public ArrayList getTable() {
        // TODO Auto-generated method stub
        return this.players;
    }

    @Override
    public ArrayList<String> getHeaders() {
        // TODO Auto-generated method stub
        return this.players.get(0).getAttributeNames();
    }

    @Override
    public ArrayList<String> getLine(int line) {
        // TODO Auto-generated method stub
        return this.players.get(line).getAttributes();

    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        // TODO Auto-generated method stub
        ArrayList<ArrayList<String>> someLines = new ArrayList<>();
        for (int i = firstLine; i < lastLine + 1; i++) {
            someLines.add(getLine(i));
        }
        return someLines;
    }




}