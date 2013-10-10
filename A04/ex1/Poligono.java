/**
 *
 * @author Diego e Anarosa
 */
public class Poligono {
    Ponto[] pontos;
    
    public Poligono(Ponto[] pontos){
        this.pontos=pontos;
    }
    
    public boolean validar(){
        /* Não sei que forma é, então o melhor
         * que eu posso fazer é verificar se possui
         * pelo menos 3 pontos e se s�o li.
         */
        
        boolean isLI;        
    	//TO DO verificar se s�o li
        
        
        
        if ( pontos.length >= 3 && isLI) {
        	
            return true;
        } else {
            return false;
        }
    }
    
    public float perimetro(){
       //TO DO implemente o c�lculo do per�metro considerando que os lados do poligono 
       //est�o dados ordenadamente no vetor de pontos 
      // lado0=dist[(x0,y0),(x1,y1)]; lado1=dist[(x1,y1),(x2,y2)]; 
      // lado2=dist[(x3,y3),(x3,y3)]; ...; ladoN=dist[(xN,yN),(x0,y0)]  
    	return 0;
    }
    
    public void imprime(){
        System.out.println(getClass().getName());
        
        System.out.print("Pontos: ");
        
        StringBuilder txt = new StringBuilder();
        String sep = "";
        for ( Ponto i : pontos ){
            txt.append(sep).append(i.getX() + " , " + i.getY());
            sep = " - ";
        }
        System.out.println(txt);
        
        System.out.print("Perímetro: ");
        System.out.println(perimetro());
        
        if (validar()){
            System.out.println("Forma válida!");
        } else {
            System.out.println("Forma inválida!");
        }
        System.out.println();
    }
    
}