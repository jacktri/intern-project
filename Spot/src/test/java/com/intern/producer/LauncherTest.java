package com.intern.producer;

import com.intern.data.Spot;
import com.intern.publisher.Publisher;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LauncherTest {

    @Mock
    private Producer<Spot> producer;
    @Mock
    private Publisher<Spot> publisher;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void start() {
        Spot spot = new Spot(5);
        when(producer.produce()).thenReturn(spot);
        Launcher launcher = new Launcher(producer,publisher);
        launcher.start();
        verify(publisher,times(1));
    }
}