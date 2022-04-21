// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDBProxyEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDBProxyEndpointArgs Empty = new GetDBProxyEndpointArgs();

    /**
     * The identifier for the DB proxy endpoint. This name must be unique for all DB proxy endpoints owned by your AWS account in the specified AWS Region.
     * 
     */
    @Import(name="dBProxyEndpointName", required=true)
    private String dBProxyEndpointName;

    public String dBProxyEndpointName() {
        return this.dBProxyEndpointName;
    }

    private GetDBProxyEndpointArgs() {}

    private GetDBProxyEndpointArgs(GetDBProxyEndpointArgs $) {
        this.dBProxyEndpointName = $.dBProxyEndpointName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDBProxyEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDBProxyEndpointArgs $;

        public Builder() {
            $ = new GetDBProxyEndpointArgs();
        }

        public Builder(GetDBProxyEndpointArgs defaults) {
            $ = new GetDBProxyEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder dBProxyEndpointName(String dBProxyEndpointName) {
            $.dBProxyEndpointName = dBProxyEndpointName;
            return this;
        }

        public GetDBProxyEndpointArgs build() {
            $.dBProxyEndpointName = Objects.requireNonNull($.dBProxyEndpointName, "expected parameter 'dBProxyEndpointName' to be non-null");
            return $;
        }
    }

}
