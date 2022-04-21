// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersAuroraGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersAuroraGetArgs Empty = new DataSourceParametersAuroraGetArgs();

    /**
     * The database to which to connect.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    public Output<String> database() {
        return this.database;
    }

    /**
     * The host to which to connect.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    public Output<String> host() {
        return this.host;
    }

    /**
     * The port to which to connect.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    private DataSourceParametersAuroraGetArgs() {}

    private DataSourceParametersAuroraGetArgs(DataSourceParametersAuroraGetArgs $) {
        this.database = $.database;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceParametersAuroraGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceParametersAuroraGetArgs $;

        public Builder() {
            $ = new DataSourceParametersAuroraGetArgs();
        }

        public Builder(DataSourceParametersAuroraGetArgs defaults) {
            $ = new DataSourceParametersAuroraGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        public Builder database(String database) {
            return database(Output.of(database));
        }

        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public DataSourceParametersAuroraGetArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
