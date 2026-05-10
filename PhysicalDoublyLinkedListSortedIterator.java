/**
 * Iterator that returns the elements of a {@link PhysicalDoublyLinkedList}
 * in ascending order according to a {@link PhysicalComparator}.
 *
 * <p>The list itself is not modified. The iterator repeatedly searches for
 * the smallest element that has not yet been returned. Thus, the iterator
 * follows the idea of a selection-based traversal.</p>
 *
 * <p>Only non-{@code null} elements are considered. Entries with value
 * {@code null} are skipped and never returned by this iterator.</p>
 */
public class PhysicalDoublyLinkedListSortedIterator implements PhysicalIterator {
    private final PhysicalDoublyLinkedListNode head;
    private final PhysicalComparator comparator;


    //TODO: all variables and additional methods and constructors are private.

    /**
     * Creates a new sorted iterator.
     *
     * @param head       the first node of the list, or {@code null} if the list is empty
     * @param comparator the comparator defining the order; {@code comparator != null}
     */
    public PhysicalDoublyLinkedListSortedIterator(PhysicalDoublyLinkedListNode head, PhysicalComparator comparator) {
        this.head = head;
        this.comparator = comparator;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasNext() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Physical next() {

    }
}