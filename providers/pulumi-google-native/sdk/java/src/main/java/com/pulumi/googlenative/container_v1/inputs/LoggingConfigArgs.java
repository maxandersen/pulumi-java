// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.inputs.LoggingComponentConfigArgs;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<LoggingComponentConfigArgs> componentConfig;

    /**
     * @return Logging components configuration
     * 
     */
    public Optional<Output<LoggingComponentConfigArgs>> componentConfig() {
        return Optional.ofNullable(this.componentConfig);
    }

    private LoggingConfigArgs() {}

    private LoggingConfigArgs(LoggingConfigArgs $) {
        this.componentConfig = $.componentConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigArgs $;

        public Builder() {
            $ = new LoggingConfigArgs();
        }

        public Builder(LoggingConfigArgs defaults) {
            $ = new LoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentConfig Logging components configuration
         * 
         * @return builder
         * 
         */
        public Builder componentConfig(@Nullable Output<LoggingComponentConfigArgs> componentConfig) {
            $.componentConfig = componentConfig;
            return this;
        }

        /**
         * @param componentConfig Logging components configuration
         * 
         * @return builder
         * 
         */
        public Builder componentConfig(LoggingComponentConfigArgs componentConfig) {
            return componentConfig(Output.of(componentConfig));
        }

        public LoggingConfigArgs build() {
            return $;
        }
    }

}
