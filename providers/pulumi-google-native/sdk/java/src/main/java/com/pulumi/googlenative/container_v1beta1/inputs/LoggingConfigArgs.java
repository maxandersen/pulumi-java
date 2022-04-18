// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.container_v1beta1.inputs.LoggingComponentConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LoggingConfig is cluster logging configuration.
 * 
 */
public final class LoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigArgs Empty = new LoggingConfigArgs();

    /**
     * Logging components configuration
     * 
     */
    @Import(name="componentConfig")
      private final @Nullable Output<LoggingComponentConfigArgs> componentConfig;

    public Output<LoggingComponentConfigArgs> componentConfig() {
        return this.componentConfig == null ? Codegen.empty() : this.componentConfig;
    }

    public LoggingConfigArgs(@Nullable Output<LoggingComponentConfigArgs> componentConfig) {
        this.componentConfig = componentConfig;
    }

    private LoggingConfigArgs() {
        this.componentConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LoggingComponentConfigArgs> componentConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentConfig = defaults.componentConfig;
        }

        public Builder componentConfig(@Nullable Output<LoggingComponentConfigArgs> componentConfig) {
            this.componentConfig = componentConfig;
            return this;
        }
        public Builder componentConfig(@Nullable LoggingComponentConfigArgs componentConfig) {
            this.componentConfig = Codegen.ofNullable(componentConfig);
            return this;
        }        public LoggingConfigArgs build() {
            return new LoggingConfigArgs(componentConfig);
        }
    }
}
