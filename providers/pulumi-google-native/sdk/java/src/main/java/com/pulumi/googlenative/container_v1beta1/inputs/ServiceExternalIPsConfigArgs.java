// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
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
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    public ServiceExternalIPsConfigArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private ServiceExternalIPsConfigArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceExternalIPsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceExternalIPsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }        public ServiceExternalIPsConfigArgs build() {
            return new ServiceExternalIPsConfigArgs(enabled);
        }
    }
}
