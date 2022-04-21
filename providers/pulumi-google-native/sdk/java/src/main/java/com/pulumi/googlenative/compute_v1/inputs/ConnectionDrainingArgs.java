// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Message containing connection draining configuration.
 * 
 */
public final class ConnectionDrainingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionDrainingArgs Empty = new ConnectionDrainingArgs();

    /**
     * Configures a duration timeout for existing requests on a removed backend instance. For supported load balancers and protocols, as described in Enabling connection draining.
     * 
     */
    @Import(name="drainingTimeoutSec")
    private @Nullable Output<Integer> drainingTimeoutSec;

    public Optional<Output<Integer>> drainingTimeoutSec() {
        return Optional.ofNullable(this.drainingTimeoutSec);
    }

    private ConnectionDrainingArgs() {}

    private ConnectionDrainingArgs(ConnectionDrainingArgs $) {
        this.drainingTimeoutSec = $.drainingTimeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionDrainingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionDrainingArgs $;

        public Builder() {
            $ = new ConnectionDrainingArgs();
        }

        public Builder(ConnectionDrainingArgs defaults) {
            $ = new ConnectionDrainingArgs(Objects.requireNonNull(defaults));
        }

        public Builder drainingTimeoutSec(@Nullable Output<Integer> drainingTimeoutSec) {
            $.drainingTimeoutSec = drainingTimeoutSec;
            return this;
        }

        public Builder drainingTimeoutSec(Integer drainingTimeoutSec) {
            return drainingTimeoutSec(Output.of(drainingTimeoutSec));
        }

        public ConnectionDrainingArgs build() {
            return $;
        }
    }

}
