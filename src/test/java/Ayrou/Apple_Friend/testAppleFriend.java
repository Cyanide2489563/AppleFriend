package Ayrou.Apple_Friend;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import org.junit.After;
import org.junit.Before;

public class testAppleFriend {

    private ServerMock server;
    private AppleFriend plugin;

    @Before
    public void setUp()
    {
        server = MockBukkit.mock();
        plugin = MockBukkit.load(AppleFriend.class);
    }

    @After
    public void tearDown()
    {
        MockBukkit.unload();
    }

}