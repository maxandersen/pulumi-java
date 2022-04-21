// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoverycontrol.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEndpoint extends com.pulumi.resources.InvokeArgs {

    public static final ClusterEndpoint Empty = new ClusterEndpoint();

    @Import(name="endpoint")
    private @Nullable String endpoint;

    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private ClusterEndpoint() {}

    private ClusterEndpoint(ClusterEndpoint $) {
        this.endpoint = $.endpoint;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEndpoint $;

        public Builder() {
            $ = new ClusterEndpoint();
        }

        public Builder(ClusterEndpoint defaults) {
            $ = new ClusterEndpoint(Objects.requireNonNull(defaults));
        }

        public Builder endpoint(@Nullable String endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public ClusterEndpoint build() {
            return $;
        }
    }

}
