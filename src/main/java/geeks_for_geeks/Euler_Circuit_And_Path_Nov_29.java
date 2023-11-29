package geeks_for_geeks;

import java.util.List;

public class Euler_Circuit_And_Path_Nov_29 {
    public int isEulerCircuit(int V, List<Integer>[] adj)
    {
        int e=0,od=0;
        for(int i=0;i<V;i++)
            if(adj[i].size()%2==0)
                e++;
            else od++;
        if(e==V)return 2;
        if(od==2)return 1;
        return 0;

    }
}
