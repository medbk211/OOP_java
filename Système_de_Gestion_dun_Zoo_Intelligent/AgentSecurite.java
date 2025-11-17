public class AgentSecurite extends Personnel implements Travailleur {
    

    public AgentSecurite(String nom) {
        super(nom);
    }

    @Override
    public void presentation() {
        System.out.println("Je suis un agent de sécurité nommé " + getNom() + ".");
    }

    @Override
    public void travailler() {
        System.out.println("L'agent de sécurité travaille en surveillant le zoo.");
    }   
    

    
    
}
