// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class UpgradeSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final UpgradeSettingsResponse Empty = new UpgradeSettingsResponse();

    /**
     * The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
     * 
     */
    @Import(name="maxSurge", required=true)
    private Integer maxSurge;

    public Integer maxSurge() {
        return this.maxSurge;
    }

    /**
     * The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
     * 
     */
    @Import(name="maxUnavailable", required=true)
    private Integer maxUnavailable;

    public Integer maxUnavailable() {
        return this.maxUnavailable;
    }

    private UpgradeSettingsResponse() {}

    private UpgradeSettingsResponse(UpgradeSettingsResponse $) {
        this.maxSurge = $.maxSurge;
        this.maxUnavailable = $.maxUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpgradeSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpgradeSettingsResponse $;

        public Builder() {
            $ = new UpgradeSettingsResponse();
        }

        public Builder(UpgradeSettingsResponse defaults) {
            $ = new UpgradeSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder maxSurge(Integer maxSurge) {
            $.maxSurge = maxSurge;
            return this;
        }

        public Builder maxUnavailable(Integer maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        public UpgradeSettingsResponse build() {
            $.maxSurge = Objects.requireNonNull($.maxSurge, "expected parameter 'maxSurge' to be non-null");
            $.maxUnavailable = Objects.requireNonNull($.maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
            return $;
        }
    }

}
