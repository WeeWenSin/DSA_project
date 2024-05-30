/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class LinkedList<T> {
    private Node<T> head;
    private int size;
    private final int MAX_SIZE = 50;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T item) {
        if (size >= MAX_SIZE) {
            System.out.println("List is full. Cannot add more items.");
            return;
        }

        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(T item) {
        if (head == null) return;

        if (head.data.equals(item)) {
            head = head.next;
            size--;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(item)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    public Node<T> find(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(item)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int getSize() {
        return size;
    }
}
