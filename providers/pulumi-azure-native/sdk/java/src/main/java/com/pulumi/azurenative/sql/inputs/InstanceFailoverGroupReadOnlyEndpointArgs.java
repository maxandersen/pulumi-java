// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.azurenative.sql.enums.ReadOnlyEndpointFailoverPolicy;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Read-only endpoint of the failover group instance.
 * 
 */
public final class InstanceFailoverGroupReadOnlyEndpointArgs extends ResourceArgs {

    public static final InstanceFailoverGroupReadOnlyEndpointArgs Empty = new InstanceFailoverGroupReadOnlyEndpointArgs();

    /**
     * Failover policy of the read-only endpoint for the failover group.
     * 
     */
    @Import(name="failoverPolicy")
    private @Nullable Output<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy;

    /**
     * @return Failover policy of the read-only endpoint for the failover group.
     * 
     */
    public Optional<Output<Either<String,ReadOnlyEndpointFailoverPolicy>>> failoverPolicy() {
        return Optional.ofNullable(this.failoverPolicy);
    }

    private InstanceFailoverGroupReadOnlyEndpointArgs() {}

    private InstanceFailoverGroupReadOnlyEndpointArgs(InstanceFailoverGroupReadOnlyEndpointArgs $) {
        this.failoverPolicy = $.failoverPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFailoverGroupReadOnlyEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFailoverGroupReadOnlyEndpointArgs $;

        public Builder() {
            $ = new InstanceFailoverGroupReadOnlyEndpointArgs();
        }

        public Builder(InstanceFailoverGroupReadOnlyEndpointArgs defaults) {
            $ = new InstanceFailoverGroupReadOnlyEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failoverPolicy Failover policy of the read-only endpoint for the failover group.
         * 
         * @return builder
         * 
         */
        public Builder failoverPolicy(@Nullable Output<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy) {
            $.failoverPolicy = failoverPolicy;
            return this;
        }

        /**
         * @param failoverPolicy Failover policy of the read-only endpoint for the failover group.
         * 
         * @return builder
         * 
         */
        public Builder failoverPolicy(Either<String,ReadOnlyEndpointFailoverPolicy> failoverPolicy) {
            return failoverPolicy(Output.of(failoverPolicy));
        }

        /**
         * @param failoverPolicy Failover policy of the read-only endpoint for the failover group.
         * 
         * @return builder
         * 
         */
        public Builder failoverPolicy(String failoverPolicy) {
            return failoverPolicy(Either.ofLeft(failoverPolicy));
        }

        /**
         * @param failoverPolicy Failover policy of the read-only endpoint for the failover group.
         * 
         * @return builder
         * 
         */
        public Builder failoverPolicy(ReadOnlyEndpointFailoverPolicy failoverPolicy) {
            return failoverPolicy(Either.ofRight(failoverPolicy));
        }

        public InstanceFailoverGroupReadOnlyEndpointArgs build() {
            return $;
        }
    }

}
