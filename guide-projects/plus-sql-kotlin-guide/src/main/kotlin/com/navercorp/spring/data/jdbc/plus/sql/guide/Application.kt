/*
 * Spring JDBC Plus
 *
 * Copyright 2020-2021 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.spring.data.jdbc.plus.sql.guide

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Primary
import org.springframework.data.jdbc.core.dialect.JdbcMySqlDialect
import org.springframework.data.relational.core.dialect.Dialect

/**
 * @author Myeonghyeon Lee
 */
@SpringBootApplication
class Application {

    fun main(args: Array<String>) {
        runApplication<Application>(*args)
    }

    @Bean
    @Primary
    fun mysqlDialect(): Dialect {
        return JdbcMySqlDialect.INSTANCE
    }
}
