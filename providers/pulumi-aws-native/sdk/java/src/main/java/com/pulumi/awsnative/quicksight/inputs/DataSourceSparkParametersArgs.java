// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;Spark parameters.&lt;/p&gt;
 * 
 */
public final class DataSourceSparkParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceSparkParametersArgs Empty = new DataSourceSparkParametersArgs();

    /**
     * &lt;p&gt;Host.&lt;/p&gt;
     * 
     */
    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> host() {
        return this.host;
    }

    /**
     * &lt;p&gt;Port.&lt;/p&gt;
     * 
     */
    @Import(name="port", required=true)
      private final Output<Double> port;

    public Output<Double> port() {
        return this.port;
    }

    public DataSourceSparkParametersArgs(
        Output<String> host,
        Output<Double> port) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceSparkParametersArgs() {
        this.host = Codegen.empty();
        this.port = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSparkParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> host;
        private Output<Double> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSparkParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder host(Output<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder host(String host) {
            this.host = Output.of(Objects.requireNonNull(host));
            return this;
        }
        public Builder port(Output<Double> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Double port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }        public DataSourceSparkParametersArgs build() {
            return new DataSourceSparkParametersArgs(host, port);
        }
    }
}
