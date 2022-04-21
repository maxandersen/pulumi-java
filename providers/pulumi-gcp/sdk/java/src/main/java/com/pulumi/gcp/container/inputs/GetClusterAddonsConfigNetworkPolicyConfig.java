// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetClusterAddonsConfigNetworkPolicyConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterAddonsConfigNetworkPolicyConfig Empty = new GetClusterAddonsConfigNetworkPolicyConfig();

    @Import(name="disabled", required=true)
    private Boolean disabled;

    public Boolean disabled() {
        return this.disabled;
    }

    private GetClusterAddonsConfigNetworkPolicyConfig() {}

    private GetClusterAddonsConfigNetworkPolicyConfig(GetClusterAddonsConfigNetworkPolicyConfig $) {
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterAddonsConfigNetworkPolicyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterAddonsConfigNetworkPolicyConfig $;

        public Builder() {
            $ = new GetClusterAddonsConfigNetworkPolicyConfig();
        }

        public Builder(GetClusterAddonsConfigNetworkPolicyConfig defaults) {
            $ = new GetClusterAddonsConfigNetworkPolicyConfig(Objects.requireNonNull(defaults));
        }

        public Builder disabled(Boolean disabled) {
            $.disabled = disabled;
            return this;
        }

        public GetClusterAddonsConfigNetworkPolicyConfig build() {
            $.disabled = Objects.requireNonNull($.disabled, "expected parameter 'disabled' to be non-null");
            return $;
        }
    }

}
