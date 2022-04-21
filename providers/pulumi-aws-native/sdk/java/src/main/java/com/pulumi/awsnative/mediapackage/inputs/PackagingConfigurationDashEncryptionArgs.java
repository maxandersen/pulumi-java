// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationSpekeKeyProviderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
 * 
 */
public final class PackagingConfigurationDashEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationDashEncryptionArgs Empty = new PackagingConfigurationDashEncryptionArgs();

    @Import(name="spekeKeyProvider", required=true)
    private Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider;

    public Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    private PackagingConfigurationDashEncryptionArgs() {}

    private PackagingConfigurationDashEncryptionArgs(PackagingConfigurationDashEncryptionArgs $) {
        this.spekeKeyProvider = $.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackagingConfigurationDashEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingConfigurationDashEncryptionArgs $;

        public Builder() {
            $ = new PackagingConfigurationDashEncryptionArgs();
        }

        public Builder(PackagingConfigurationDashEncryptionArgs defaults) {
            $ = new PackagingConfigurationDashEncryptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder spekeKeyProvider(Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider) {
            $.spekeKeyProvider = spekeKeyProvider;
            return this;
        }

        public Builder spekeKeyProvider(PackagingConfigurationSpekeKeyProviderArgs spekeKeyProvider) {
            return spekeKeyProvider(Output.of(spekeKeyProvider));
        }

        public PackagingConfigurationDashEncryptionArgs build() {
            $.spekeKeyProvider = Objects.requireNonNull($.spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
            return $;
        }
    }

}
