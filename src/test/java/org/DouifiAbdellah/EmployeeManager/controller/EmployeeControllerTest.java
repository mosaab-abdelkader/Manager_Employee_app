package org.DouifiAbdellah.EmployeeManager.controller;

import org.DouifiAbdellah.EmployeeManager.service.*;
import org.junit.jupiter.api.*;
import org.mockito.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.http.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.*;
import org.springframework.test.web.servlet.result.*;
import org.springframework.test.web.servlet.setup.*;

//@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {
    
    @MockBean
    private EmployeeServices employeeServices;
    
    @Autowired
    private MockMvc mockMvc;
    @InjectMocks
    private EmployeeController employeeController = new EmployeeController(employeeServices);

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
    }

    @Test
    void SouldCreateMockMVC() {
        Assertions.assertNotNull(mockMvc);
    }

    @Test
    void getAllEmployees() throws Exception {

        this.mockMvc.perform(MockMvcRequestBuilders.get("/all"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
        
    }
}