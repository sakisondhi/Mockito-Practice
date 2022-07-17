package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class SomeBusinessMockTest {
    @InjectMocks
    SomeBusinessImpl business;
    @Mock
    SomeDataService dataServiceMock;


    @Test
    public void calculateSumUsingDataService_basic(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 4, 5});
        assertEquals(10, business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataService_empty(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(0, business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataService_one(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1});
        assertEquals(1, business.calculateSumUsingDataService());
    }
}