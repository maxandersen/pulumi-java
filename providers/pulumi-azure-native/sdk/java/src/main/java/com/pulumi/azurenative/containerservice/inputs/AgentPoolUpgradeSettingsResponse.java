// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for upgrading an agentpool
 * 
 */
public final class AgentPoolUpgradeSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AgentPoolUpgradeSettingsResponse Empty = new AgentPoolUpgradeSettingsResponse();

    /**
     * Count or percentage of additional nodes to be added during upgrade. If empty uses AKS default
     * 
     */
    @Import(name="maxSurge")
    private @Nullable String maxSurge;

    public Optional<String> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }

    private AgentPoolUpgradeSettingsResponse() {}

    private AgentPoolUpgradeSettingsResponse(AgentPoolUpgradeSettingsResponse $) {
        this.maxSurge = $.maxSurge;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentPoolUpgradeSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentPoolUpgradeSettingsResponse $;

        public Builder() {
            $ = new AgentPoolUpgradeSettingsResponse();
        }

        public Builder(AgentPoolUpgradeSettingsResponse defaults) {
            $ = new AgentPoolUpgradeSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder maxSurge(@Nullable String maxSurge) {
            $.maxSurge = maxSurge;
            return this;
        }

        public AgentPoolUpgradeSettingsResponse build() {
            return $;
        }
    }

}
