public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public  Node find (int key){
        Node current = root;
        while (current.id != key){
            if (key<current.id){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }
            if (current == null){
                return null;
            }
       }
       return current;
    }
    
    public void  insert (int id, String data){
        Node newNode = new Node();
        newNode.id = id;
        newNode.data = data;
        if (root == null ){
            root = newNode;
        }else{
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if(id <current.id){
                    current = current.leftChild = newNode;
                    if (current == null){
                        parent.leftChild = newNode;
                    }else{
                        current = current.rightChild;
                        if (current == null){
                            parent.rightChild = newNode;
                            return;
                        }
                    }
                    
                }
            }
        }   
    }

    
    public boolean delete (int key){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        
        while (current.id != key){
            parent = current;
            if(key < current.id){
                isLeftChild =true;
                current = current.leftChild;
            }else{
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null){
                return false;
            }
        }
        if (current.leftChild == null && current.rightChild == null){
            if(current == root){
                root = null;
            }else if(isLeftChild){
                parent.leftChild = current.leftChild;
            }
        }
        
    }
}

