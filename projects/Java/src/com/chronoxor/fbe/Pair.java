//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

// Fast Binary Encoding pair wrapper
public final class Pair<K, V>
{
    private final K key;
    private final V value;

    // Initialize the pair with given key and value
    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    // Get the pair key
    public K getKey() { return key; }
    // Get the pair value
    public V getValue() { return value; }

    // Create a new pair
    public static <K, V> Pair<K, V> create(K key, V value) { return new Pair<K, V>(key, value); }
}
