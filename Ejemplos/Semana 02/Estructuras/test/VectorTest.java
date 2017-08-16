
import org.junit.Assert;
import org.junit.Before;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author federico
 */
public class VectorTest {
    
    Vector v;
    
    @Before
    public void setup() {
        v = new Vector();
    }
    
    @org.junit.Test
    public void testAdd() {
        v.append(1);
        v.append(2);
        String txt = v.toString();
        Assert.assertEquals("[1, 2]", txt);
    }
    
}
