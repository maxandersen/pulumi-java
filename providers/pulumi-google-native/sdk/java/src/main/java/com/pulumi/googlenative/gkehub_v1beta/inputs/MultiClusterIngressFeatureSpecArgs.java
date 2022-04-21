// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * **Multi-cluster Ingress**: The configuration for the MultiClusterIngress feature.
 * 
 */
public final class MultiClusterIngressFeatureSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultiClusterIngressFeatureSpecArgs Empty = new MultiClusterIngressFeatureSpecArgs();

    /**
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
     */
    @Import(name="configMembership")
    private @Nullable Output<String> configMembership;

    public Optional<Output<String>> configMembership() {
        return Optional.ofNullable(this.configMembership);
    }

    private MultiClusterIngressFeatureSpecArgs() {}

    private MultiClusterIngressFeatureSpecArgs(MultiClusterIngressFeatureSpecArgs $) {
        this.configMembership = $.configMembership;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiClusterIngressFeatureSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiClusterIngressFeatureSpecArgs $;

        public Builder() {
            $ = new MultiClusterIngressFeatureSpecArgs();
        }

        public Builder(MultiClusterIngressFeatureSpecArgs defaults) {
            $ = new MultiClusterIngressFeatureSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder configMembership(@Nullable Output<String> configMembership) {
            $.configMembership = configMembership;
            return this;
        }

        public Builder configMembership(String configMembership) {
            return configMembership(Output.of(configMembership));
        }

        public MultiClusterIngressFeatureSpecArgs build() {
            return $;
        }
    }

}
