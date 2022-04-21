// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkArgs Empty = new GetNetworkArgs();

    @Import(name="network", required=true)
    private String network;

    public String network() {
        return this.network;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetNetworkArgs() {}

    private GetNetworkArgs(GetNetworkArgs $) {
        this.network = $.network;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkArgs $;

        public Builder() {
            $ = new GetNetworkArgs();
        }

        public Builder(GetNetworkArgs defaults) {
            $ = new GetNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder network(String network) {
            $.network = network;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetNetworkArgs build() {
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            return $;
        }
    }

}
