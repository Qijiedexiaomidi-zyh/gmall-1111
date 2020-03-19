package com.zyh.gmall.pms.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

@Configuration
public class PmsDataSourceConfig {

    //自己创建数据源对象
    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        //获得文件名
        File file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        //根据文件名创建数据源
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(file);
        return dataSource;
    }
}
