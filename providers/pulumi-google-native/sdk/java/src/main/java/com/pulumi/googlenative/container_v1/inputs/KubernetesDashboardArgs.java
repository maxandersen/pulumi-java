// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for the Kubernetes Dashboard.
 * 
 */
public final class KubernetesDashboardArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesDashboardArgs Empty = new KubernetesDashboardArgs();

    /**
     * Whether the Kubernetes Dashboard is enabled for this cluster.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    private KubernetesDashboardArgs() {}

    private KubernetesDashboardArgs(KubernetesDashboardArgs $) {
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesDashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesDashboardArgs $;

        public Builder() {
            $ = new KubernetesDashboardArgs();
        }

        public Builder(KubernetesDashboardArgs defaults) {
            $ = new KubernetesDashboardArgs(Objects.requireNonNull(defaults));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public KubernetesDashboardArgs build() {
            return $;
        }
    }

}
