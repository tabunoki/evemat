package com.binarysprite.evemat;

import java.io.File;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.DomaAbstractConfig;
import org.seasar.doma.jdbc.SimpleDataSource;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.H2Dialect;
import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.seasar.doma.jdbc.tx.LocalTransactionalDataSource;

public class DB extends DomaAbstractConfig {

	protected static final LocalTransactionalDataSource DATA_SOURCE = createDataSource();

	protected static final Dialect DIALECT = new H2Dialect();

	@Override
	public DataSource getDataSource() {
		return DATA_SOURCE;
	}

	@Override
	public Dialect getDialect() {
		return DIALECT;
	}

	protected static LocalTransactionalDataSource createDataSource() {
		SimpleDataSource dataSource = new SimpleDataSource();
		dataSource.setUrl("jdbc:h2:file:" + new File(Resources.PATH, "evemat").getAbsolutePath());
		dataSource.setUser("sa");
		
		System.out.println(dataSource.getUrl());
		
		return new LocalTransactionalDataSource(dataSource);
	}
	
    public static LocalTransaction getLocalTransaction() {
        return DATA_SOURCE.getLocalTransaction(defaultJdbcLogger);
    }
}
