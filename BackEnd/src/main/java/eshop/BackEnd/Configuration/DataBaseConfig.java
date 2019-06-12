package eshop.BackEnd.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
@Configuration
public class DataBaseConfig {

    //datasourse
    @Bean(name="dataSource")
    public DataSource getDataSource()
    {
        BasicDataSource dataSource=new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://localhost/~/hhh");
        dataSource.setUsername("hhh");
        dataSource.setPassword("hhh");
        return dataSource;
    }
    //properties
    @Bean
    public Properties getProperties()
    {
        Properties properties=new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        properties.setProperty("hibernate.show_sql","true");
       properties.setProperty("hibernate.hbm2ddl.auto","update");
       return properties;
    }
    @Bean(name="sessionFactory")
   public SessionFactory  getSessionFactory()
   {

       LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(getDataSource());
       localSessionFactoryBuilder.addProperties(getProperties());
       localSessionFactoryBuilder.scanPackages("eshop.BackEnd");
       return  localSessionFactoryBuilder.buildSessionFactory();

   }


   @Bean
   public HibernateTransactionManager getHibernateTransactionManager()
   {
       HibernateTransactionManager transactionManager=new HibernateTransactionManager(getSessionFactory());

       System.out.println(transactionManager);
       return transactionManager;
   }





    
    //sessionFactor

    //hibernate transaction manager
}