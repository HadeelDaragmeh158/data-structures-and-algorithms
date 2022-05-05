package k.ary.classes;

public class KAray {


    Node root;
    public KAray() {
    }

    public KAray(int value) {
        setRoot(new Node(value));
    }

    public KAray(Node value) {
        setRoot(value);
    }

    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }
    public  void print(Node Root){
        String str = Root.getValue() + " --> ";
        for (int i = 0; i <Root.getNideTree().size() ; i++) {
            str =str +Root.getNideTree().get(i)+",";
        }
        System.out.println(str);
        for (int i = 0; i <Root.getNideTree().size() ; i++) {
            print(Root.getNideTree().get(i));
        }
    }

    public  void fizzBuzzTree(Node Root){
        String str = Root.getValue() + " -> ";
        for (int i = 0; i <Root.getNideTree().size() ; i++) {
            int n = Root.getNideTree().get(i).getValue();
            if(n%3 == 0) {
                if (n % 5 == 0)
                    str = str + "FizzBuzz" + ",";
                else
                    str = str + "Fizz" + ",";
            }else if (n%5 ==0)
                str = str + "buzz" + ",";
            else
                str =str +Root.getNideTree().get(i)+",";

        }
        System.out.println(str);
        for (int i = 0; i <Root.getNideTree().size() ; i++) {
            fizzBuzzTree(Root.getNideTree().get(i));
        }
    }

}
