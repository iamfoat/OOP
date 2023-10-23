import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class subway {
    static Map<Integer, Set<Integer>> stations = new HashMap<>();
    static List<Set<Integer>> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            Set<Integer> lineStations = new HashSet<>();
            for (int j = 0; j < S; j++) {
                int station = Integer.parseInt(st.nextToken());
                lineStations.add(station);
                if (!stations.containsKey(station)) {
                    stations.put(station, new HashSet<>());
                }
                stations.get(station).add(i);
            }
            lines.add(lineStations);
        }

        st = new StringTokenizer(br.readLine());
        int Q = Integer.parseInt(st.nextToken());

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (!stations.containsKey(A) || !stations.containsKey(B)) {
                System.out.println("impossible");
            } else if (A == B) {
                System.out.println("0");
            } else {
                Set<Integer> startLines = stations.get(A);
                Set<Integer> targetLines = stations.get(B);
                int minChanges = Integer.MAX_VALUE;

                for (int startLine : startLines) {
                    for (int targetLine : targetLines) {
                        if (startLine != targetLine) {
                            Set<Integer> commonStations = new HashSet<>(lines.get(startLine));
                            commonStations.retainAll(lines.get(targetLine));
                            int changes = commonStations.size();
                            minChanges = Math.min(minChanges, changes);
                        }
                    }
                }

                if (minChanges == Integer.MAX_VALUE) {
                    System.out.println("impossible");
                } else {
                    System.out.println(minChanges);
                }
            }
        }
    }
}
