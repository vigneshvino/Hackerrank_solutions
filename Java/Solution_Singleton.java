import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    
    public String str = null;
    
    private Singleton() {
        
    }
    
    static Singleton getSingleInstance() {
        
        return new Singleton();
    }

}