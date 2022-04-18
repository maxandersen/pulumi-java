// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.FirewallLogConfigMetadata;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The available logging options for a firewall rule.
 * 
 */
public final class FirewallLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallLogConfigArgs Empty = new FirewallLogConfigArgs();

    /**
     * This field denotes whether to enable logging for a particular firewall rule.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> enable() {
        return this.enable == null ? Codegen.empty() : this.enable;
    }

    /**
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<FirewallLogConfigMetadata> metadata;

    public Output<FirewallLogConfigMetadata> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    public FirewallLogConfigArgs(
        @Nullable Output<Boolean> enable,
        @Nullable Output<FirewallLogConfigMetadata> metadata) {
        this.enable = enable;
        this.metadata = metadata;
    }

    private FirewallLogConfigArgs() {
        this.enable = Codegen.empty();
        this.metadata = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<FirewallLogConfigMetadata> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.metadata = defaults.metadata;
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Codegen.ofNullable(enable);
            return this;
        }
        public Builder metadata(@Nullable Output<FirewallLogConfigMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable FirewallLogConfigMetadata metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }        public FirewallLogConfigArgs build() {
            return new FirewallLogConfigArgs(enable, metadata);
        }
    }
}
