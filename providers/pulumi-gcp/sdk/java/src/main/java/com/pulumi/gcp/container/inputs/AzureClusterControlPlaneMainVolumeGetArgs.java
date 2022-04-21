// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureClusterControlPlaneMainVolumeGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureClusterControlPlaneMainVolumeGetArgs Empty = new AzureClusterControlPlaneMainVolumeGetArgs();

    /**
     * Optional. The size of the disk, in GiBs. When unspecified, a default value is provided. See the specific reference in the parent resource.
     * 
     */
    @Import(name="sizeGib")
    private @Nullable Output<Integer> sizeGib;

    public Optional<Output<Integer>> sizeGib() {
        return Optional.ofNullable(this.sizeGib);
    }

    private AzureClusterControlPlaneMainVolumeGetArgs() {}

    private AzureClusterControlPlaneMainVolumeGetArgs(AzureClusterControlPlaneMainVolumeGetArgs $) {
        this.sizeGib = $.sizeGib;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureClusterControlPlaneMainVolumeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureClusterControlPlaneMainVolumeGetArgs $;

        public Builder() {
            $ = new AzureClusterControlPlaneMainVolumeGetArgs();
        }

        public Builder(AzureClusterControlPlaneMainVolumeGetArgs defaults) {
            $ = new AzureClusterControlPlaneMainVolumeGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder sizeGib(@Nullable Output<Integer> sizeGib) {
            $.sizeGib = sizeGib;
            return this;
        }

        public Builder sizeGib(Integer sizeGib) {
            return sizeGib(Output.of(sizeGib));
        }

        public AzureClusterControlPlaneMainVolumeGetArgs build() {
            return $;
        }
    }

}
