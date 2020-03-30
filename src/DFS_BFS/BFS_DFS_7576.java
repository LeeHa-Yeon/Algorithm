package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_DFS_7576 {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] r = {1, -1, 0, 0};
    static int[] c = {0, 0, -1, 1};
    static int flag = 0;
    static int min = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1)
                    q.offer(new int[]{i, j});
                if (map[i][j] == 0)
                    flag = 1;
            }
        }
        if (flag == 0)
            System.out.println(0);
        else {
            bfs(q);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
            System.out.println(min - 1);
        }
    }

    public static void bfs(Queue<int[]> queue) {
        Queue<int[]> q = queue;

        while (!q.isEmpty()) {
            int[] location = q.poll();
            visited[location[0]][location[1]] = true;

            for (int dir = 0; dir < 4; dir++) {
                int row = location[0] + r[dir];
                int col = location[1] + c[dir];

                /* 좌표값은 인덱스니까 row,col의 최대값은 n,m의-1*/
                if (row >= 0 && col >= 0 && row < N && col < M) {
                    // 익지 않았고 방문하지 않았다면
                    if (map[row][col] == 0 && !visited[row][col]) {
                        q.offer(new int[]{row, col});
                        visited[row][col] = true;
                        map[row][col] = map[location[0]][location[1]] + 1;

                        min = map[row][col];

                    }

                }
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i < N; i++)
            System.out.println(Arrays.toString(map[i]));
    }
}

