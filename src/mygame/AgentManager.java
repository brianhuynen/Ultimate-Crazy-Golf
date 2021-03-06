/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import java.util.ArrayList;

/**
 *
 * @author nicolagheza
 */
public class AgentManager {
    private ArrayList<Agent> agents;
    private int curAgent = 0;
    
    public AgentManager() {
        agents = new ArrayList<Agent>();
    }
    
    public void add(Agent a) {
        agents.add(a);
    }
    
    public Agent nextAgent() {
        if (curAgent < agents.size()-1) {
            curAgent++;
            return agents.get(curAgent);
        }
        else {
            curAgent = 0;
            return agents.get(curAgent);
        }
    }
    
    public Agent getCurrentAgent() {
        return agents.get(curAgent);
    }
    
}
