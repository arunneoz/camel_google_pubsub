package com.example.devops.cicd.unittest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import com.example.devops.cicd.unittesting.BusinessService;
import com.example.devops.cicd.unittesting.DataService;
@RunWith(MockitoJUnitRunner.class)
public class BusinessServicesMockTest {
	 @Mock
	  DataService dataServiceMock;
	 @InjectMocks
	    BusinessService businessImpl;

    
    @Test
    public void testFindTheGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {
            24,
            15,
            3
        });
        assertEquals(24, businessImpl.findTheGreatestFromAllData());
    }
    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {
            15
        });
        assertEquals(15, businessImpl.findTheGreatestFromAllData());
    }
    @Test
    public void testFindTheGreatestFromAllData_NoValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }
}