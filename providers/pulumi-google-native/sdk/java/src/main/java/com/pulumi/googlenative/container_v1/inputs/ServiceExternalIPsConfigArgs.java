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
 * Config to block services with externalIPs field.
 * 
 */
public final class ServiceExternalIPsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceExternalIPsConfigArgs Empty = new ServiceExternalIPsConfigArgs();

    /**
     * Whether Services with ExternalIPs field are allowed or not.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ServiceExternalIPsConfigArgs() {}

    private ServiceExternalIPsConfigArgs(ServiceExternalIPsConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceExternalIPsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceExternalIPsConfigArgs $;

        public Builder() {
            $ = new ServiceExternalIPsConfigArgs();
        }

        public Builder(ServiceExternalIPsConfigArgs defaults) {
            $ = new ServiceExternalIPsConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ServiceExternalIPsConfigArgs build() {
            return $;
        }
    }

}
