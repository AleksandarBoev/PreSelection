package brothers_in_the_bar_after_deadline;

/*
    Solution version 2 for when the number of elements is big.
 */
public class BrothersInTheBar {
    public int brothersInTheBar(int[] glasses) {
        if (glasses.length == 0) {
            return 0;
        }

        Node head = getLinkedElements(glasses);

        int counter = 0;

        Node currentNode = head;
        while (true) {
            boolean setFound = false;
            while (nodeAndNextTwoAreNotNull(currentNode)) {
                if (nodeValueAndNextTwoAreEqual(currentNode)) {
                    counter++;
                    head = removeNodeAndNextTwo(head, currentNode);
                    setFound = true;
                    currentNode = head;
                    break;
                } else {
                    currentNode = currentNode.next;
                }
            }

            if (!setFound) {
                break;
            }
        }

        return counter;
    }

    /**
     *
     * @param array
     * @return node which corresponds to first element in array, linked to second element, which is linked to third
     * and so on...
     */
    private Node getLinkedElements(int[] array) {
        Node head = new Node(array[0]);
        Node lastNode = head;
        Node currentNode;

        for (int i = 1; i < array.length; i++) {
            currentNode = new Node(array[i]);
            currentNode.prev = lastNode;
            lastNode.next = currentNode;
            lastNode = currentNode;
        }

        return head;
    }

    private boolean nodeAndNextTwoAreNotNull(Node node) {
        return node != null && node.next != null && node.next.next != null;
    }

    private boolean nodeValueAndNextTwoAreEqual(Node node) {
        return node.value == node.next.value && node.value == node.next.next.value;
    }

    /**
     *
     * @param head first element of the link
     * @param node first node of the set to be removed
     * @return changed head if it is one of the nodes to remove. If not - same head is returned
     */
    private Node removeNodeAndNextTwo(Node head, Node node) {
        Node nodeAfterSet = node.next.next.next;

        if (node.prev != null) {
            node.prev.next = nodeAfterSet;
        } else { // currentNode is head
            if (nodeAfterSet != null) {
                head = nodeAfterSet;
            } else {
                head = null;
            }
        }

        if (nodeAfterSet != null) {
            nodeAfterSet.prev = node.prev;
        }

        return head;
    }

    /**
     * Double linked nodes
     */
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }
}
