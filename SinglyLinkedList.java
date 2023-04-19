public class SinglyLinkedList {

  public static void main(String[] args) {

    MyList ml = new MyList();
    for (int i = 0; i < 2; i++) {
      ml.appendFirst("Значение " + i);
    }
    Node time = ml.head;

    time = ml.head;
    while (time != null) {
      System.out.println(time.value);
      time = time.next;
    }    
    ml.reverse();
    System.out.println();
    System.out.println(ml.head.value);

  }
}

class MyList {
  Node head;

  public void appendFirst(String value) {
    Node n = new Node();
    n.value = value;
    if (head != null) {
      n.next = head;
    }
    head = n;
  }

  public void deleteFirst() {
    if (head != null) {
      head = head.next;
    }
  }

  public void reverse(Node current, Node previous) {
    if (current.next == null) {
      head = current;
    }else {
      reverse(current.next, current);
      }      
    current.next = previous;
    previous.next = null;
  }

  public void reverse() {
    if (head != null && head.next != null) {
      reverse(head.next, head);   
    }     
  }

  public boolean contains(String text) {
    if (head != null) {
      Node time = head;
      while (time != null) {
        if (text.equals(time.value)) {
          return true;
        }
        time = time.next;
      }
    }
    return false;
  }
}

class Node {
  Node next;
  String value;
}
