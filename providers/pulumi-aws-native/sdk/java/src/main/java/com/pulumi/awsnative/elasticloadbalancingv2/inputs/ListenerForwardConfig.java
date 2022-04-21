// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerTargetGroupStickinessConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerTargetGroupTuple;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerForwardConfig extends com.pulumi.resources.InvokeArgs {

    public static final ListenerForwardConfig Empty = new ListenerForwardConfig();

    @Import(name="targetGroupStickinessConfig")
    private @Nullable ListenerTargetGroupStickinessConfig targetGroupStickinessConfig;

    public Optional<ListenerTargetGroupStickinessConfig> targetGroupStickinessConfig() {
        return Optional.ofNullable(this.targetGroupStickinessConfig);
    }

    @Import(name="targetGroups")
    private @Nullable List<ListenerTargetGroupTuple> targetGroups;

    public Optional<List<ListenerTargetGroupTuple>> targetGroups() {
        return Optional.ofNullable(this.targetGroups);
    }

    private ListenerForwardConfig() {}

    private ListenerForwardConfig(ListenerForwardConfig $) {
        this.targetGroupStickinessConfig = $.targetGroupStickinessConfig;
        this.targetGroups = $.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerForwardConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerForwardConfig $;

        public Builder() {
            $ = new ListenerForwardConfig();
        }

        public Builder(ListenerForwardConfig defaults) {
            $ = new ListenerForwardConfig(Objects.requireNonNull(defaults));
        }

        public Builder targetGroupStickinessConfig(@Nullable ListenerTargetGroupStickinessConfig targetGroupStickinessConfig) {
            $.targetGroupStickinessConfig = targetGroupStickinessConfig;
            return this;
        }

        public Builder targetGroups(@Nullable List<ListenerTargetGroupTuple> targetGroups) {
            $.targetGroups = targetGroups;
            return this;
        }

        public Builder targetGroups(ListenerTargetGroupTuple... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }

        public ListenerForwardConfig build() {
            return $;
        }
    }

}
