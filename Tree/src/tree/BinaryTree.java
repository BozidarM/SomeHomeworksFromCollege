package tree;

public class BinaryTree {

    public Node root;

    BinaryTree() {
        this.root = null;
    } 
    
    /*
        podjite od root-a i uporedite root.data sa n
        ako je root.data veci od n, to znaci da moramo ici levo od korena.
        ako je root.data manji od n to znači da moramo ici desno od korena.
        ako je u nekom ternutku root.data jednaka n, tada smo nasli cvor, vratite true.
        ako dođemo do lista (kraja stabla) vratite false, tj. cvor nije pronadjen
    */

    public boolean find(int id) {

        Node current = root;
        while (current != null) {
            if (current.data == id) {

                return true;
            } else if (current.data > id) {
                current = current.left;

            } else {
                current = current.right;

            }
        }
        return false;

    } 
    
    /*
        Vrlo slicna operaciji find().
        Da bismo ubacili cvor nas prvi zadatak je pronaci mesto za ubacivanje cvora.
        Uzmite current = root.
        pocnite od current i uporedite root.data sa n
        ako je current.data veci od n to znaci da moramo ici levo od korena.
        ako je current.data manji od n to znaci da moramo ici desno od korena.
        ako je u bilo kom trenutku current = null , to znaci da smo stigli do lista cvora, 
        ubacite vas cvor ovde uz pomoc roditeljskog cvora.
    */

    public void insert(int id) {
        Node newNode = new Node(id);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (id < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    } 
    
    /*
      Postoje  3 slucaja.

        Cvor koji se brise je list (cvor bez dece).
        Cvor koji se brise ima samo jedno dete.
        Cvor koji se brise ima 2 deteta.  
    
    */ 
    
    /*
    
     Slucaj 1 Cvor koji se brise je  list (Bez dece).

    jednostavan slucaj, ako cvor koji se brise nema dece, 
    tada samo prodjite do tog cvora, pratite roditeljski cvor i stranu na kojoj cvor postoji 
    (levo ili desno) i postavite parent.left = null ili parent.right = null;
    
    */ 
    
    /*
    Slucaj 2 Cvor koji se brise ima samo jedno dete.

    malo slozeniji slucaj. ako cvor koji treba izbrisati (deleteNode) ima samo jedno dete, 
    tada samo predjite do tog cvora, pratite roditeljski cvor i stranu na kojoj cvor postoji 
    (levo ili desno).
    proverite koja je strana deteta null (jer ima samo jedno dete).
    Npr ako cvor koji se brise ima dete na levoj strani. 
    Zatim uzmite celokupan subtree sa leve strane i dodajte ga roditelju i onoj strani 
    na kojoj se deleteNode nalazi
    */
    /*
    Slucaj 3 Cvor koji se brise ima 2 deteta 
    
    Ako izbrisani cvor ima dvoje dece, ne mozete ga jednostavno zameniti
    sa jednim od  dece, bar ako dete ima svoju decu. 
    zamislite da brisete cvor 25 i zamenite ga njegovim desnim subtree-jem
    ciji je koren 35. Koje bi levo dete imalo 35 ? Izbrisani cvor je levo
    dete, 15, ili novo dete novog cvora, 30? U oba slučaja 30 bi bilo pogrešno
    postavljeno
    Potreban  je drugi pristup. Zapamtite da u binarnom stablu za pretrazivanje cvorovi su rasporedjeni po rastucim vrednostima. Za svaki
    cvor, cvor sa sledecim najvisim vrednostima nje njegov naslednik, ., cvor 30 je naslednik cvora 25.
    Da biste izbrisali cvor sa dvoje dece, zamenite cvor njegovim
    naslednikom koji je uredjen po rastucem poretku.  
    
    Pronalazak naslednika 
    Prvo, program prelazi na desno dete prvobitnog cvora, koji mora da ima kljuc
    veci od cvora. Zatim se prelazi na levo dete tog desnog deteta (ako ga ima) i na
    levo dete levog deteta, i tako dalje, prolazeci put leve dece. 
    poslednje levo dete na ovom putu je naslednik originalnog cvora 
    
    Ono sto  trazimo je najmanji deo  kompleta
    cvorova koji su veci od izvornog cvora. Kada odete na desno
    dete originalnog cvor , svi cvorovi u rezultirajucem subtree su veci od izvornog cvora
    jer je tako definisano stablo binarnog pretrazivanja. Sada trazimo najmanju vrednost
    u ovom subtree-ju. Minimalnu vrednost mozete pronaci u subtre-ju 
    prateci put niz levu decu. 
    Ako desno dete prvobitnog cvora nema levu decu, to desno dete je naslednik
    
    */
    public boolean delete(int id) {
        Node parent = root;
        Node current = root;
        boolean isLeftChild = true;
        while (current.data != id) {
            parent = current;
            if (current.data > id) {
                isLeftChild = true;
                current = current.left;

            } else {
                isLeftChild = false;
                current = current.right;

            }
            if (current == null) {

                return false;
            }

        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            }
            if (isLeftChild == true) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.left != null && current.right != null) {

            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    public Node getSuccessor(Node deleteNode) {
        Node successsor = null;
        Node successsorParent = null;
        Node current = deleteNode.right;
        while (current != null) {
            successsorParent = successsor;
            successsor = current;
            current = current.left;
        }

        if (successsor != deleteNode.right) {
            successsorParent.left = successsor.right;
            successsor.right = deleteNode.right;
        }
        return successsor;
    }

}

