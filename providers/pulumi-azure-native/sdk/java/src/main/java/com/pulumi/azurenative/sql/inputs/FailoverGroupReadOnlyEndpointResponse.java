// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Read-only endpoint of the failover group instance.
 * 
 */
public final class FailoverGroupReadOnlyEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final FailoverGroupReadOnlyEndpointResponse Empty = new FailoverGroupReadOnlyEndpointResponse();

    /**
     * Failover policy of the read-only endpoint for the failover group.
     * 
     */
    @Import(name="failoverPolicy")
    private @Nullable String failoverPolicy;

    public Optional<String> failoverPolicy() {
        return Optional.ofNullable(this.failoverPolicy);
    }

    private FailoverGroupReadOnlyEndpointResponse() {}

    private FailoverGroupReadOnlyEndpointResponse(FailoverGroupReadOnlyEndpointResponse $) {
        this.failoverPolicy = $.failoverPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailoverGroupReadOnlyEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailoverGroupReadOnlyEndpointResponse $;

        public Builder() {
            $ = new FailoverGroupReadOnlyEndpointResponse();
        }

        public Builder(FailoverGroupReadOnlyEndpointResponse defaults) {
            $ = new FailoverGroupReadOnlyEndpointResponse(Objects.requireNonNull(defaults));
        }

        public Builder failoverPolicy(@Nullable String failoverPolicy) {
            $.failoverPolicy = failoverPolicy;
            return this;
        }

        public FailoverGroupReadOnlyEndpointResponse build() {
            return $;
        }
    }

}
