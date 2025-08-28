import java.util.Random;

public class JeuDeLaVie {
    private static final int ROWS = 5;
    private static final int COLS = 5;
    private boolean[][] grid;
    private boolean[][] nextGrid;
    
    public JeuDeLaVie() {
        grid = new boolean[ROWS][COLS];
        nextGrid = new boolean[ROWS][COLS];
        initializeGrid();
    }
    
    // Initialise la grille avec un état aléatoire
    private void initializeGrid() {
        Random random = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                grid[i][j] = random.nextBoolean();
            }
        }
    }
    
    // Affiche la grille actuelle
    public void printGrid() {
        System.out.println("État actuel de la grille:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(grid[i][j] ? "■ " : "□ ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Calcule le nombre de voisins vivants d'une cellule
    private int countLiveNeighbors(int row, int col) {
        int count = 0;
        
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue; // Ignorer la cellule elle-même
                
                int neighborRow = row + i;
                int neighborCol = col + j;
                
                // Vérifier les bords de la grille
                if (neighborRow >= 0 && neighborRow < ROWS && 
                    neighborCol >= 0 && neighborCol < COLS) {
                    if (grid[neighborRow][neighborCol]) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
    
    // Applique les règles du jeu pour calculer la prochaine génération
    public void nextGeneration() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                int liveNeighbors = countLiveNeighbors(i, j);
                
                // Appliquer les règles du Jeu de la Vie
                if (grid[i][j]) {
                    // Cellule vivante
                    nextGrid[i][j] = (liveNeighbors == 2 || liveNeighbors == 3);
                } else {
                    // Cellule morte
                    nextGrid[i][j] = (liveNeighbors == 3);
                }
            }
        }
        
        // Mettre à jour la grille avec la nouvelle génération
        boolean[][] temp = grid;
        grid = nextGrid;
        nextGrid = temp;
    }
    
    public static void main(String[] args) throws InterruptedException {
        JeuDeLaVie game = new JeuDeLaVie();
        
        // Afficher l'état initial
        game.printGrid();
        
        // Simuler 10 générations
        for (int generation = 1; generation <= 10; generation++) {
            System.out.println("Génération " + generation);
            game.nextGeneration();
            game.printGrid();
            
            // Pause d'une seconde entre les générations
            Thread.sleep(1000);
        }
    }
}
