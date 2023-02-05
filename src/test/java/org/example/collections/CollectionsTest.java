package org.example.collections;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 *
 */
public class CollectionsTest {

    private Collection<String> collection = new HashSet<>();
    private List<String> list = new LinkedList<>();
    private NavigableSet<String> set = new TreeSet<>();
    private Queue<String> queue = new LinkedList<>();
    private NavigableMap<String, String> map = new TreeMap<>();

    /**
     * copyOf()创建不可更改的副本。
     * 如果修改了原集合副本不受影响。如果原集合恰好不可修改且类型正确，copyOf会直接返回原集合。
     */
    @Test
    public void copyOfTest(){
        List.copyOf(list);
        Set.copyOf(set);
        Map.copyOf(map);
    }

    /**
     * Collections.unmodifiableCollection(collection);
     * Collections.unmodifiableList(list);
     * Collections.unmodifiableSet(set);
     * Collections.unmodifiableSortedSet(set);
     * Collections.unmodifiableSortedSet(set);
     * Collections.unmodifiableMap(map);
     * Collections.unmodifiableSortedMap(map);
     * Collections.unmodifiableNavigableMap(map);
     *    构造一个不可修改的视图。不可修改的视图不会让集合本身变为不可变。仍然可以通过集合的原始引用修改集合并且可以对集合调用更改器方法。
     */
    @Test
    public void unmodifiableTest(){
        Collections.unmodifiableCollection(collection);
        Collections.unmodifiableList(list);
        Collections.unmodifiableSet(set);
        Collections.unmodifiableSortedSet(set);
        Collections.unmodifiableSortedSet(set);
        Collections.unmodifiableMap(map);
        Collections.unmodifiableSortedMap(map);
        Collections.unmodifiableNavigableMap(map);
    }

    /**
     * Collections.checkedCollection(collection, String.class);
     * Collections.checkedList(list, String.class);
     * Collections.checkedSet(set, String.class);
     * Collections.checkedSortedSet(set, String.class);
     * Collections.checkedNavigableSet(set, String.class);
     * Collections.checkedQueue(queue, String.class);
     * Collections.checkedMap(map, String.class, String.class);
     * Collections.checkedSortedMap(map, String.class, String.class);
     * Collections.checkedNavigableMap(map, String.class, String.class);
     *    构造一个检查型视图。如果插入一个错误类型的元素则抛出ClassCastException。
     */
    @Test
    public void checkedTest(){
        Collections.checkedCollection(collection, String.class);
        Collections.checkedList(list, String.class);
        Collections.checkedSet(set, String.class);
        Collections.checkedSortedSet(set, String.class);
        Collections.checkedNavigableSet(set, String.class);
        Collections.checkedQueue(queue, String.class);
        Collections.checkedMap(map, String.class, String.class);
        Collections.checkedSortedMap(map, String.class, String.class);
        Collections.checkedNavigableMap(map, String.class, String.class);
    }

    /**
     * Collections.synchronizedCollection(collection);
     * Collections.synchronizedList(list);
     * Collections.synchronizedSet(set);
     * Collections.synchronizedSortedSet(set);
     * Collections.synchronizedSortedSet(set);
     * Collections.synchronizedMap(map);
     * Collections.synchronizedSortedMap(map);
     * Collections.synchronizedNavigableMap(map);
     *     构建一个集合视图；视图的方法是同步的。
     */
    @Test
    public void synchronizedTest(){
        Collections.synchronizedCollection(collection);
        Collections.synchronizedList(list);
        Collections.synchronizedSet(set);
        Collections.synchronizedSortedSet(set);
        Collections.synchronizedSortedSet(set);
        Collections.synchronizedMap(map);
        Collections.synchronizedSortedMap(map);
        Collections.synchronizedNavigableMap(map);
    }

    /**
     * Collections.sort(list);
     * Collections.sort(list, (String::compareTo));
     *    对List进行排序。
     */
    @Test
    public void sortTest(){
        Collections.sort(list);
        Collections.sort(list, (String::compareTo));
    }

    /**
     * Collections.shuffle(list);
     * Collections.shuffle(list, new Random());
     *    随机打乱List的顺序。
     */
    @Test
    public void shuffleTest(){
        Collections.shuffle(list);
        Collections.shuffle(list, new Random());
    }

    /**
     * Collections.binarySearch(list, "one");
     * Collections.binarySearch(list, "one", String::compareTo);
     *    二分法查找List的某个元素
     */
    @Test
    public void binarySearchTest(){
        Collections.binarySearch(list, "one");
        Collections.binarySearch(list, "one", String::compareTo);
    }


}
