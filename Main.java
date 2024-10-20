public class Main {

    public int process(int sizeX, int sizeY, int elementX, int elementY) {
        //default value all virus are infected or not; default is false
        boolean[][] elements = new boolean[sizeX][sizeY];
        // start point of virus
            elements[elementX-1][elementY-1] = true;
            boolean isVirusSpreadToAllElements = false;
            boolean[][] tempElements = new boolean[sizeX][sizeY];
            int day = 1;
            while(isVirusSpreadToAllElements == false){
                boolean tempIsVirusSpreadToAllElements = true;
                for (int i = 0; i < sizeX; i++) {
                    for (int j = 0; j < sizeY; j++) {
                        // check for not infect element 
                        if (elements[i][j] == false){
                            // it mean still have not infect
                            tempIsVirusSpreadToAllElements = false;
                            continue;
                        }

                        tempElements[i][j] = true;
                        // left side
                        if (( i -1 ) >= 0) {
                            //left side 
                            tempElements[i-1][j] = true;
                            
                            if (( j -1 ) >= 0) {
                                //top left
                                tempElements[i-1][j-1] = true;
                            }
                            if (( j +1 ) < sizeY) {
                                //bottom left
                                tempElements[i-1][j+1] = true;
                            }
                        }
                        // right side
                        if ((i + 1) < sizeX) {
                            tempElements[i+1][j] = true;
                            if (( j -1 ) >= 0) {
                                //top right
                                tempElements[i+1][j-1] = true;
                            }
                            if (( j +1 ) < sizeY) {
                                //bottom right
                                tempElements[i+1][j+1] = true;
                            }
                        }
                        if ((j -1) >= 0) {
                            // top
                            tempElements[i][j - 1] = true;
                        }
                        if (( j +1) < sizeY) {
                            //bottom
                            tempElements[i][j + 1] = true;
                        }
                    }
                }
                day += 1;
                isVirusSpreadToAllElements = tempIsVirusSpreadToAllElements;
                // update infected
                elements = tempElements;
            }

            return day;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Test: " + main.process(4, 6, 2, 4)); // Example usage
        System.out.println("Test: " + main.process(3, 4, 1, 2)); // Example usage
    }
}