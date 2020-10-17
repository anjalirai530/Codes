public static void levelOrderLinewise(Node node) {
        Queue <Node> mainQ = new ArrayDeque<>();
        mainQ.add(node);
        mainQ.add(new Node(-1));

        while(mainQ.size() > 0){
            node = mainQ.remove();
            if(node.data != -1){
                System.out.print(node.data + " ");
                for(Node child : node.children){
                    mainQ.add(child);
                }
            }else{
                if(mainQ.size() > 0){
                    mainQ.add(new Node(-1));
                  System.out.println();
                }

            }
        }

    }
    public static void levelOrderLinewise(Node node) {
        Queue < Node > mainQ = new ArrayDeque < > ();
        mainQ.add(node);
        while (mainQ.size() > 0) {
            int size = mainQ.size();
            for (int i = 0; i < size; i++) {
                node = mainQ.remove();
                System.out.print(node.data + " ");

                for (Node child: node.children) {
                    mainQ.add(child);
                }
            }
            System.out.println();
        }


    }