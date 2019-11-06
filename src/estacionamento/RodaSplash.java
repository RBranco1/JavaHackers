
package estacionamento;

public class RodaSplash {
    public static void main(String[] args) {
        JFSplashScreenN splash = new JFSplashScreenN();
        splash.setVisible(true);
        
        JFLogin pr = new JFLogin();
        
        try{
            for(int i =0; i <= 100;i++){
                Thread.sleep(40);
                splash.lblLoad.setText(Integer.toString(i)+"%");
                splash.jprLoad.setValue(i);
                if(i==100){
                    splash.dispose();
                    pr.setVisible(true);
                }
                
            }
           
        }catch(Exception e){
            
        }
        
    }
}
