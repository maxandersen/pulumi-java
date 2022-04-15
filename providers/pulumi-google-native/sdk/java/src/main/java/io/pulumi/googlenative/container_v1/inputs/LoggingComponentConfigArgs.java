// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.container_v1.enums.LoggingComponentConfigEnableComponentsItem;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LoggingComponentConfig is cluster logging component configuration.
 * 
 */
public final class LoggingComponentConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingComponentConfigArgs Empty = new LoggingComponentConfigArgs();

    /**
     * Select components to collect logs. An empty set would disable all logging.
     * 
     */
    @Import(name="enableComponents")
      private final @Nullable Output<List<LoggingComponentConfigEnableComponentsItem>> enableComponents;

    public Output<List<LoggingComponentConfigEnableComponentsItem>> enableComponents() {
        return this.enableComponents == null ? Codegen.empty() : this.enableComponents;
    }

    public LoggingComponentConfigArgs(@Nullable Output<List<LoggingComponentConfigEnableComponentsItem>> enableComponents) {
        this.enableComponents = enableComponents;
    }

    private LoggingComponentConfigArgs() {
        this.enableComponents = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingComponentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<LoggingComponentConfigEnableComponentsItem>> enableComponents;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingComponentConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComponents = defaults.enableComponents;
        }

        public Builder enableComponents(@Nullable Output<List<LoggingComponentConfigEnableComponentsItem>> enableComponents) {
            this.enableComponents = enableComponents;
            return this;
        }
        public Builder enableComponents(@Nullable List<LoggingComponentConfigEnableComponentsItem> enableComponents) {
            this.enableComponents = Codegen.ofNullable(enableComponents);
            return this;
        }
        public Builder enableComponents(LoggingComponentConfigEnableComponentsItem... enableComponents) {
            return enableComponents(List.of(enableComponents));
        }        public LoggingComponentConfigArgs build() {
            return new LoggingComponentConfigArgs(enableComponents);
        }
    }
}
