package lruCache;

import java.util.HashMap;

public class LRUCache {

    HashMap<Integer, Entry> hashMap;
    Entry start, end;
    int LRU_SIZE = 4;

    public LRUCache(){
        hashMap = new HashMap<>();
    }

    public int getEntry(int key){

        if(hashMap.containsKey(key)){
            Entry entry = hashMap.get(key);
            removeNode(entry);
            addAtTop(entry);
            return entry.value;
        }
        return -1;
    }

    public void putEntry(int key, int value){

        if(hashMap.containsKey(key)){
            Entry entry = hashMap.get(key);
            entry.value = value;
            removeNode(entry);
            addAtTop(entry);
        }
        else {
            Entry newEntry = new Entry();
            newEntry.value = value;
            newEntry.key = key;
            newEntry.left = null;
            newEntry.right = null;

            if(hashMap.size() > LRU_SIZE){
                hashMap.remove(end.key);
                removeNode(end);
                addAtTop(newEntry);
            }
            else {
                addAtTop(newEntry);
            }
            hashMap.put(key, newEntry);
        }
    }

    public void addAtTop(Entry entry) {

        entry.right = start;
        entry.left = null;
        if(start != null){
            start.left = entry;
        }
        start = entry;
        if(end == null){
            end = start;
        }
    }

    public void removeNode(Entry entry){

        if(entry.left != null){
            entry.left.right = entry.right;
        }
        else {
            start = entry.right;
        }

        if(entry.right != null){
            entry.right.left = entry.left;
        }
        else {
            end = entry.left;
        }
    }

    public static void main(String args[]){

        LRUCache lrucache = new LRUCache();

        lrucache.putEntry(1, 1);
        lrucache.putEntry(10, 15);
        lrucache.putEntry(15, 10);
        lrucache.putEntry(10, 16);
        lrucache.putEntry(12, 15);
        lrucache.putEntry(18, 10);
        lrucache.putEntry(13, 16);

        System.out.println(lrucache.getEntry(1));
        System.out.println(lrucache.getEntry(10));
        System.out.println(lrucache.getEntry(15));
    }
}
