package sesi04;

import java.util.Scanner;

public class LatihanTree {
    static Scanner in = new Scanner(System.in);

    public void insert(node a, int b) {
        if (b < a.value) {
            if (a.left != null)
                insert(a.left, b);
            else {
                a.left = new node();
                a.left.input(b);
                System.out.println(b + " di kiri " + a.value);
            }
        } else if (b > a.value) {
            if (a.right != null)
                insert(a.right, b);
            else {
                a.right = new node();
                a.right.input(b);
                System.out.println(b + " di kanan " + a.value);
            }
        }
    }

    public void view(node a) {
        System.out.print("Pre Order     :");
        preOrder(a);
        System.out.println(" ");
        System.out.print("In Order  :");
        InOrder(a);
        System.out.println(" ");
        System.out.print("Post Order    :");
        PostOrder(a);
        System.out.println(" ");
    }

    public void preOrder(node a) {
        if (a != null) {
            System.out.print(a.value + " ");
            preOrder(a.left);
            preOrder(a.right);
        }
    }

    public void InOrder(node a) {
        if (a != null) {
            InOrder(a.left);
            System.out.print(a.value + " ");
            InOrder(a.right);
        }
    }

    public void PostOrder(node a) {
        if (a != null) {
            PostOrder(a.left);
            PostOrder(a.right);
            System.out.print(a.value + " ");
        }
    }
}

class node {
    node left, right;
    int value;

    public void input(int a) {
        value = a;
    }

    public static void main(String[] args) {
        LatihanTree tr = new LatihanTree();
        node root = new node();
        int menu = 1;
        int r = 1;
        int a;

        while (menu != 3) {
            System.out.print("1. input\n2. view\n3. exit\n Pilihan Anda: ");
            menu = tr.in.nextInt();
            if (menu == 1) {
                System.out.print("Masukkan Angka :");
                a = tr.in.nextInt();
                if (r == 1) {
                    root.input(a);
                    r--;
                } else
                    tr.insert(root, a);
            } else if (menu == 2)
                tr.view(root);

            else if (menu == 3)
                System.out.println("Keluar");
            else
                System.out.println(" ");
        }
    }
}
