// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The private endpoint property of a private endpoint connection
 * 
 */
public final class PrivateEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointResponse Empty = new PrivateEndpointResponse();

    /**
     * The resource identifier.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private PrivateEndpointResponse() {}

    private PrivateEndpointResponse(PrivateEndpointResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointResponse $;

        public Builder() {
            $ = new PrivateEndpointResponse();
        }

        public Builder(PrivateEndpointResponse defaults) {
            $ = new PrivateEndpointResponse(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public PrivateEndpointResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
