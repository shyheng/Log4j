package com.example.log4j;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Code {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

//        全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath+"\\Log4j\\src\\main\\java");
        gc.setAuthor("shyheng");
        gc.setOpen(false);
        gc.setFileOverride(false);
        gc.setServiceImplName("%sService");
        gc.setIdType(IdType.ID_WORKER_STR);
        gc.setDateType(DateType.ONLY_DATE);
        // gc.setSwagger2(true); 实体属性 Swagger2 注解
        mpg.setGlobalConfig(gc);

//        设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://120.77.255.179:3306/log4j?serverTimezone=GMT%2B8&useSSL=true");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("1234");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

//        包的配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("mysql");
        pc.setParent("com.example");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

//        策略配置
        StrategyConfig sc = new StrategyConfig();
        sc.setInclude("user");
        sc.setNaming(NamingStrategy.underline_to_camel);
        sc.setColumnNaming(NamingStrategy.underline_to_camel);
        sc.setEntityLombokModel(true);//自动Lombok
        sc.setLogicDeleteFieldName("del");
        sc.setRestControllerStyle(true);
        sc.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(sc);

        mpg.execute();
    }
}
