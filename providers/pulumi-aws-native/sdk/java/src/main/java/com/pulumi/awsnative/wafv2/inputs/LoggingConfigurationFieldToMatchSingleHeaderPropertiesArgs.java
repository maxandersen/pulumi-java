// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Inspect a single header. Provide the name of the header to inspect, for example, User-Agent or Referer. This setting isn&#39;t case sensitive.
 * 
 */
public final class LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs Empty = new LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs();

    /**
     * The name of the query header to inspect.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs(Output<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs() {
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs build() {
            return new LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs(name);
        }
    }
}
