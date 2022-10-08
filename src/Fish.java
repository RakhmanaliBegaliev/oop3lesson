public class Fish {

        private String name;
        private String wherelive;
        private int livestory;
    public Fish(){

    }
       public Fish(String d, String k, int c){
           this.name= d;
           this.wherelive = k;
           this.livestory = c;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWherelive() {
        return wherelive;
    }

    public void setWherelive(String wherelive) {
        this.wherelive = wherelive;
    }

    public int getLivestory() {
        return livestory;
    }

    public void setLivestory(int livestory) {
        this.livestory = livestory;
    }
}

