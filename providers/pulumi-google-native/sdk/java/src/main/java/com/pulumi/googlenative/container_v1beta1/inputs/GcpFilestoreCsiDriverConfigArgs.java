// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for the GCP Filestore CSI driver.
 * 
 */
public final class GcpFilestoreCsiDriverConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpFilestoreCsiDriverConfigArgs Empty = new GcpFilestoreCsiDriverConfigArgs();

    /**
     * Whether the GCP Filestore CSI driver is enabled for this cluster.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private GcpFilestoreCsiDriverConfigArgs() {}

    private GcpFilestoreCsiDriverConfigArgs(GcpFilestoreCsiDriverConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpFilestoreCsiDriverConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpFilestoreCsiDriverConfigArgs $;

        public Builder() {
            $ = new GcpFilestoreCsiDriverConfigArgs();
        }

        public Builder(GcpFilestoreCsiDriverConfigArgs defaults) {
            $ = new GcpFilestoreCsiDriverConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public GcpFilestoreCsiDriverConfigArgs build() {
            return $;
        }
    }

}
