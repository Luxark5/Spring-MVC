
package Config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
/**
 * @author AAMC♡
 */
public class Conexion { 
           //Metodo conectar 
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();  
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/registro");
        dataSource.setUsername("analy");
        dataSource.setPassword("12345678");
        return dataSource;
             
    }
}
