// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;SQL Server parameters.&lt;/p&gt;
 * 
 */
public final class DataSourceSqlServerParameters extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceSqlServerParameters Empty = new DataSourceSqlServerParameters();

    /**
     * &lt;p&gt;Database.&lt;/p&gt;
     * 
     */
    @Import(name="database", required=true)
    private String database;

    public String database() {
        return this.database;
    }

    /**
     * &lt;p&gt;Host.&lt;/p&gt;
     * 
     */
    @Import(name="host", required=true)
    private String host;

    public String host() {
        return this.host;
    }

    /**
     * &lt;p&gt;Port.&lt;/p&gt;
     * 
     */
    @Import(name="port", required=true)
    private Double port;

    public Double port() {
        return this.port;
    }

    private DataSourceSqlServerParameters() {}

    private DataSourceSqlServerParameters(DataSourceSqlServerParameters $) {
        this.database = $.database;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceSqlServerParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceSqlServerParameters $;

        public Builder() {
            $ = new DataSourceSqlServerParameters();
        }

        public Builder(DataSourceSqlServerParameters defaults) {
            $ = new DataSourceSqlServerParameters(Objects.requireNonNull(defaults));
        }

        public Builder database(String database) {
            $.database = database;
            return this;
        }

        public Builder host(String host) {
            $.host = host;
            return this;
        }

        public Builder port(Double port) {
            $.port = port;
            return this;
        }

        public DataSourceSqlServerParameters build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
