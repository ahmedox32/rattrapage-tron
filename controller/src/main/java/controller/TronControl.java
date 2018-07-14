package controller;


 * @author Ahmed
 * 
 */
import model.ITronModel;
import view.IView;

public class TronControl implements IController {
	
	IView view ;
	ITronModel model;
	

	public TronControl(ITronModel model , IView view) {
		this.model=model;
		this.view=view;
		
		
		
	}
	
	
	
	
	public void play(){
		// tant que les deux joueurs de sont pas morts
		while(model.getGrille().getRider1().isAlive() && model.getGrille().getRider2().isAlive()) {
			//on bouge le rider 1
			model.getGrille().getRider1().move();
			//si il est mort 
			if(model.getGrille().getRider1().isAlive() == false) {
				//on affiche le message
				model.getGrille().getTimer().stop();
				model.getGrille().saveData();
				this.view.displayMessage("Rider 2 Win (Blue) Win in "+model.getGrille().getTimer().getTime()+" Seconds");
			}
			
			
			
			// pareil pour le rider 2
			model.getGrille().getRider2().move();
			if(model.getGrille().getRider2().isAlive() == false) {
				model.getGrille().getTimer().stop();
				model.getGrille().saveData();
				this.view.displayMessage("Rider 1 Win (Red) Win in"+model.getGrille().getTimer().getTime()+" Seconds");
			
			}
			
			
			try {
				//Boucle de temps de jeu
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
