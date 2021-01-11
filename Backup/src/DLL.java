
import java.util.ArrayList;
import java.util.Scanner;

public class DLL {

    Node head;
    static class Node {
        String data;
        ArrayList<Child> ChildNodeList = new ArrayList<>();
//                ArrayList <Child>C=new ArrayList<>()
        Node(String Data) {
            data = Data;
        }
    }
    static class Child{
        String data;
        ArrayList<SubChild> subChildList = new ArrayList<>();
        Node Prev;
        Child(String val, String Data) {
            data = Data + ":" + val;
        }
    }

    static class SubChild {
        String data; // Data Conatining Area of the subChild
        Child parentChildNode;
        SubChild(String Data,String Value) {
            data = Data+Value;
        }
    }

    // Adding a node at the front of the list 
    public static Child childPush(String new_data, Node obj) {
        Child c = new Child(new_data, obj.data);//creation of the child object with new_data{ which contains the name of the string } and obj.data {which contains the name of the parent node}
        obj.ChildNodeList.add(c);//here we are storing the created child object to the NodeList for child objects
        System.out.printf("The Child node %s is successfully added to %s Node\n", new_data, obj.data);
        return c;
    }
    public static SubChild subChildPush(String new_data,Child obj)
    {
        SubChild s = new SubChild(new_data,obj.data);
        obj.subChildList.add(s);
        System.out.printf("The Sub Child node %s is successfully added to %s Child\n", new_data, obj.data);
        return s;
    }
    public static void main(String[] args) {
        ArrayList<Node> nodeList = new ArrayList<>();
        ArrayList<Child> childList = new ArrayList<>();
        ArrayList<SubChild> subChildList = new ArrayList<>();
        DLL d = new DLL();
        int i = 0; //used for the iteration of the list
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("1.Wants to create a Node");
            System.out.println("2.Wants to create a child node");
            System.out.println("3.Wants to create a sub child node");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            int ch = s.nextInt();
            switch (ch) {
                case 1: {
                    if (!nodeList.isEmpty()) {
                        System.out.println("The following nodes are already existing");
                        System.out.println("========================================");
                        i = 0;
                        while (i < nodeList.size()) {
                            System.out.printf("%d .%s \n", i, nodeList.get(i).data);
                            i++;
                        }
                    }
                    System.out.println("Enter the name for the Node");
                    String nameOfNode = s.next();
                    Node n = new Node(nameOfNode);
                    nodeList.add(n);
                    System.out.printf("A Node '%s' is successfully created\n", nameOfNode);
                    break;
                }
                case 2: {
                    System.out.println("The List of nodes ");
                    System.out.println("==================");
                    if (nodeList.isEmpty()) {
                        System.out.println("No Node has been created");
                        break;
                    } else {
                        i = 0;
                        while (i < nodeList.size()) {
                            System.out.printf("%d .%s\n", i, nodeList.get(i).data);
                            i++;
                        }
                        System.out.println("Select any one from the list:");
                        int val = s.nextInt();
                        System.out.println("Enter the name of the Child Node:");
                        String nameOfChild = s.next();
                        childList.add(d.childPush(nameOfChild,nodeList.get(val)));
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("The following list of Child node is present");
                    i=0;
                    while(i<childList.size())
                    {
                        System.out.printf("%d .%s\n",i,childList.get(i).data);
                        i++;
                    }
                    System.out.println("Select any one from the above:");
                    int val=s.nextInt();
                    System.out.print("Enter the data for sub child:");
                    String subChildData=s.next();
                    subChildList.add(d.subChildPush(subChildData,childList.get(val)));
                    System.out.printf("The sub child node %s is successfully created and added",subChildData);
                    break;
                }
                case 4:
                {
                    System.exit(1);
                    break;
                }
            }
        }
    }
}

