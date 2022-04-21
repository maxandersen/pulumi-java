// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersPrestoArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersPrestoArgs Empty = new DataSourceParametersPrestoArgs();

    /**
     * The catalog to which to connect.
     * 
     */
    @Import(name="catalog", required=true)
    private Output<String> catalog;

    public Output<String> catalog() {
        return this.catalog;
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

    private DataSourceParametersPrestoArgs() {}

    private DataSourceParametersPrestoArgs(DataSourceParametersPrestoArgs $) {
        this.catalog = $.catalog;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceParametersPrestoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceParametersPrestoArgs $;

        public Builder() {
            $ = new DataSourceParametersPrestoArgs();
        }

        public Builder(DataSourceParametersPrestoArgs defaults) {
            $ = new DataSourceParametersPrestoArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalog(Output<String> catalog) {
            $.catalog = catalog;
            return this;
        }

        public Builder catalog(String catalog) {
            return catalog(Output.of(catalog));
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

        public DataSourceParametersPrestoArgs build() {
            $.catalog = Objects.requireNonNull($.catalog, "expected parameter 'catalog' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
