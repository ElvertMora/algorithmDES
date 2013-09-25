/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author zero
 */
public class DataEncryptionStandard {
    private byte[] bytesMessage;
    private byte[] bytesKey;
    private String message;
    private String key;
    private String messageCypher;

    public DataEncryptionStandard() {
    }
    /**
     * Constructor DataEncryptionStandard
     * @param message
     * @param key 
     */
    public DataEncryptionStandard(String message,String key) {
        this.message = message;
        this.bytesMessage = message.getBytes();
        this.key= key;
        this.bytesKey=key.getBytes();
    }

    /**
     * Get the value of message
     *
     * @return the value of message
     */
    public String getString() {
        return message;
    }

    /**
     * Set the value of message
     *
     * @param message new value of message
     */
    public void setString(String message) {
        this.message = message;
        this.bytesMessage = message.getBytes();
    }
    /**
     * Get the value of key
     * 
     * @return value of key
     */
    public String getKey() {
        return key;
    }
    /**
     * Set the value of key
     * 
     * @param key  new value of Key
     */
    public void setKey(String key) {
        this.key = key;
        this.bytesKey = key.getBytes();
    }
    
}
