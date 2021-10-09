/**
 * 
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.StoreManager;

/**
 * @author Arthur
 *
 */
class TestStoreManager {
	
	StoreManager s = new StoreManager("","","");
	
	/**
	 * Test method for {@link model.StoreManager#isLogged()}.
	 */
	@Test
	void testIsLogged() {
		assertNull(StoreManager.isLogged());
	}

	/**
	 * Test method for {@link model.StoreManager#setCoreStoreManager(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	void testSetCoreStoreManager() {
		fail("Not yet implemented");
	}

}
