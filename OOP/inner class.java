
class outer{
    int outer_x=100;
    void test(){
        inner inner = new inner();
        inner.display();
    }

    class inner {
        void display(){
            system.out.println("display: outer_x="+outer_x);
        }
    }
}
class innerclassdemo{
 public static void main(String[] args) {
        
    }
        outer out = new outer();

        out.test();

    }
