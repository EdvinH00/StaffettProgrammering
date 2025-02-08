# Rumor Routing

- The simulation runs for 10,000 time steps.
- At every time step, each node has a 0.01% chance of detecting an event.
- When an event occurs at a node, there is a 50% chance that an agent will be generated at that node to propagate the event information.
- Every 400 time steps, 4 queries are created at random nodes.
- If a query does not find an event within 45 time steps, it expires.
- If a node does not get information about a query in 360 time steps, it will send the query again only once more to increase the chance of resolving it.
- An agent lives for 50 time steps before expiring.

Simulation Behavior

Network Topology:
   - The network is a 50x50 grid, containing exactly 2500 nodes (N=2500).
   - Each node is connected to its adjacent nodes (up, down, left, right) unless it is on the boundary of the grid.

Event Generation:
   - Each time step, nodes independently generate events with a 0.01% probability.
   - If an event occurs, there is a 50% chance that an agent will be spawned at that node.

Agent Propagation:
   - Agents move through the network, leaving trails at visited nodes.
   - Their movement is governed by a random walk or an optimized heuristic.
   - Agents expire after 50 time steps and are removed from the simulation.

Query Generation:
   - Every 400 time steps, 4 queries are randomly generated.
   - A query seeks the shortest path to the nearest event using existing agent trails.
   - If a query does not find information about an event within 45 time steps, it expires.
   - If a query does not find an event within 360 time steps, it will be sent again only once more. If it still doesn't find an event, it expires.

Output Format

For each query, output a message in the following format:

  - "A query from position X Y at timestamp Z has found an event on position A B Timestep: T Event ID: E"
   
Or:

  - "A query from position X Y at timestamp Z has expired without finding an event."

- (X, Y, Z): The position and timestamp of the query.
- (A, B, T, E): The position, timestep, and unique event ID of the nearest event found.
- If no path to an event is found within 45 time steps, output:


