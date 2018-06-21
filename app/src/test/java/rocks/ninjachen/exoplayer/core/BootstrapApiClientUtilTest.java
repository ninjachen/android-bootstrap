

package rocks.ninjachen.exoplayer.core;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import rocks.ninjachen.hbridgek.core.BootstrapService;

/**
 * Unit tests of client API
 */
public class BootstrapApiClientUtilTest {

    @Test
    @Ignore("Requires the API to use basic authentication. Parse.com api does not. See BootstrapService for more info.")
    public void shouldCreateClient() throws Exception {
        List<User> users = new BootstrapService("demo@androidbootstrap.com", "foobar").getUsers();

        assertThat(users.get(0).getUsername(), notNullValue());
    }
}
