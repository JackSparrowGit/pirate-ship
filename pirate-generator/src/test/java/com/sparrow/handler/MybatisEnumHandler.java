package com.sparrow.handler;

import com.baomidou.mybatisplus.generator.config.ConstVal;
import com.sparrow.common.enums.BaseEnumInterface;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Properties;

/**
 * @Project: pirate-ship
 * @Author: Jack
 * @CreateTime: 2018/7/27 17:32
 * @Describe:
 */
public class MybatisEnumHandler {

    private static final String ENUM_PACKAGE_FILE_PATH    = BaseEnumInterface.class.getResource( "" ).getPath();
    // 枚举包名称 : com.baicang.bean.domain.enums
    private static final String ENUM_PACKAGE_PATH         = BaseEnumInterface.class.getPackage().getName();
    private static final String HANDLER_PACKAGE_FILE_PATH = "com.baicang.bean.handler";

    @Test
    public void mybatisEnumHandlerGeneratorExecute () throws Exception {
        // 得到枚举包目录 /Users/zhaipuhong/Desktop/aidijing/aidijing-dao/target/classes/com/aidijing/domain/enums
        File enumPackage = new File( this.ENUM_PACKAGE_FILE_PATH );
        // 枚举处理器包位置 /Users/zhaipuhong/Desktop/aidijing/aidijing-dao/target/classes/com/aidijing/handler/
        String handlerPackage = enumPackage.getParentFile().getParent() + "/handler/";

        if ( enumPackage.isDirectory() && ArrayUtils.isNotEmpty( enumPackage.listFiles() ) ) {
            // 得到所有枚举类,遍历
            for ( File file : enumPackage.listFiles() ) {
                // BaseEnumInterface 不处理
                if ( file.getName().indexOf( "BaseEnumInterface" ) != - 1 ) {
                    continue;
                }
                String genericEnumName = file.getName().replace( ".class", "" );
                String enumHandlerName = genericEnumName + "Handler";

                VelocityContext context = new VelocityContext();
                context.put( "enumHandlerName", enumHandlerName );
                context.put( "genericEnumName", genericEnumName );
                context.put( "handlerPackageFilePath", HANDLER_PACKAGE_FILE_PATH );
                context.put( "enumPackagePath", ENUM_PACKAGE_PATH );

                // 模板文件位置
                String templatePath = "templates/mybatis/handler/handler.java.vm";
                // 然后根据这些枚举类,进行处理,构建MybatisEnumHandler
                this.mybatisEnumHandlerGenerator(
                        context,
                        templatePath,
                        handlerPackage.replace(
                                "target/classes",
                                "src/main/java"
                        ) + enumHandlerName + ".java"
                );
            }
        }

    }


    private void mybatisEnumHandlerGenerator ( VelocityContext context, String templatePath, String outputFile ) throws
            Exception {
        VelocityEngine velocity = getVelocityEngine();
        Template template = velocity.getTemplate( templatePath, ConstVal.UTF8 );
        File           file     = new File( outputFile );
        if ( ! file.getParentFile().exists() ) {
            // 如果文件所在的目录不存在，则创建目录
            if ( ! file.getParentFile().mkdirs() ) {
                System.err.println( "创建文件所在的目录失败!" );
                return;
            }
        }
        FileOutputStream fos    = new FileOutputStream( outputFile );
        BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( fos, ConstVal.UTF8 ) );
        template.merge( context, writer );
        writer.close();
        System.err.println( "模板:" + templatePath + ";  文件:" + outputFile );

    }

    /**
     * 设置模版引擎，主要指向获取模版路径
     */
    private VelocityEngine getVelocityEngine () {
        Properties p = new Properties();
        p.setProperty( ConstVal.VM_LOAD_PATH_KEY, ConstVal.VM_LOAD_PATH_VALUE );
        p.setProperty( Velocity.FILE_RESOURCE_LOADER_PATH, "" );
        p.setProperty( Velocity.ENCODING_DEFAULT, ConstVal.UTF8 );
        p.setProperty( Velocity.INPUT_ENCODING, ConstVal.UTF8 );
        p.setProperty( Velocity.OUTPUT_ENCODING, ConstVal.UTF8 );
        p.setProperty( "file.resource.loader.unicode", "true" );
        return new VelocityEngine( p );
    }
}
