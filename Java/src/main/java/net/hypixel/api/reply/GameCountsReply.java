package net.hypixel.api.reply;

import java.util.Map;

public class GameCountsReply extends AbstractReply {
    private Map<String, GameCount> games;

    public Map<String, GameCount> getGames() {
        return games;
    }

    public static class GameCount {
        private Map<String, Integer> modes;
        private int players;

        public Map<String, Integer> getModes() {
            return modes;
        }

        public int getPlayers() {
            return players;
        }

        @Override
        public String toString() {
            return "GameCount{" +
                    "modes=" + modes +
                    ", players=" + players +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GameCountsReply{" +
                "games=" + games +
                "} " + super.toString();
    }
}
