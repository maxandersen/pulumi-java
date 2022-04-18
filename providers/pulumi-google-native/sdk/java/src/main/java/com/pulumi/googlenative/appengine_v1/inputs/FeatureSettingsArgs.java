// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The feature specific settings to be used in the application. These define behaviors that are user configurable.
 * 
 */
public final class FeatureSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureSettingsArgs Empty = new FeatureSettingsArgs();

    /**
     * Boolean value indicating if split health checks should be used instead of the legacy health checks. At an app.yaml level, this means defaulting to 'readiness_check' and 'liveness_check' values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated, and this value is always true, this setting can be removed.
     * 
     */
    @Import(name="splitHealthChecks")
      private final @Nullable Output<Boolean> splitHealthChecks;

    public Output<Boolean> splitHealthChecks() {
        return this.splitHealthChecks == null ? Codegen.empty() : this.splitHealthChecks;
    }

    /**
     * If true, use Container-Optimized OS (https://cloud.google.com/container-optimized-os/) base image for VMs, rather than a base Debian image.
     * 
     */
    @Import(name="useContainerOptimizedOs")
      private final @Nullable Output<Boolean> useContainerOptimizedOs;

    public Output<Boolean> useContainerOptimizedOs() {
        return this.useContainerOptimizedOs == null ? Codegen.empty() : this.useContainerOptimizedOs;
    }

    public FeatureSettingsArgs(
        @Nullable Output<Boolean> splitHealthChecks,
        @Nullable Output<Boolean> useContainerOptimizedOs) {
        this.splitHealthChecks = splitHealthChecks;
        this.useContainerOptimizedOs = useContainerOptimizedOs;
    }

    private FeatureSettingsArgs() {
        this.splitHealthChecks = Codegen.empty();
        this.useContainerOptimizedOs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> splitHealthChecks;
        private @Nullable Output<Boolean> useContainerOptimizedOs;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.splitHealthChecks = defaults.splitHealthChecks;
    	      this.useContainerOptimizedOs = defaults.useContainerOptimizedOs;
        }

        public Builder splitHealthChecks(@Nullable Output<Boolean> splitHealthChecks) {
            this.splitHealthChecks = splitHealthChecks;
            return this;
        }
        public Builder splitHealthChecks(@Nullable Boolean splitHealthChecks) {
            this.splitHealthChecks = Codegen.ofNullable(splitHealthChecks);
            return this;
        }
        public Builder useContainerOptimizedOs(@Nullable Output<Boolean> useContainerOptimizedOs) {
            this.useContainerOptimizedOs = useContainerOptimizedOs;
            return this;
        }
        public Builder useContainerOptimizedOs(@Nullable Boolean useContainerOptimizedOs) {
            this.useContainerOptimizedOs = Codegen.ofNullable(useContainerOptimizedOs);
            return this;
        }        public FeatureSettingsArgs build() {
            return new FeatureSettingsArgs(splitHealthChecks, useContainerOptimizedOs);
        }
    }
}
