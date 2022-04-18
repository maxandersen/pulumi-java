// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.CustomScaleRuleArgs;
import com.pulumi.azurenative.web.inputs.HttpScaleRuleArgs;
import com.pulumi.azurenative.web.inputs.QueueScaleRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App container scaling rule.
 * 
 */
public final class ScaleRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleRuleArgs Empty = new ScaleRuleArgs();

    /**
     * Azure Queue based scaling.
     * 
     */
    @Import(name="azureQueue")
      private final @Nullable Output<QueueScaleRuleArgs> azureQueue;

    public Output<QueueScaleRuleArgs> azureQueue() {
        return this.azureQueue == null ? Codegen.empty() : this.azureQueue;
    }

    /**
     * Custom scale rule.
     * 
     */
    @Import(name="custom")
      private final @Nullable Output<CustomScaleRuleArgs> custom;

    public Output<CustomScaleRuleArgs> custom() {
        return this.custom == null ? Codegen.empty() : this.custom;
    }

    /**
     * HTTP requests based scaling.
     * 
     */
    @Import(name="http")
      private final @Nullable Output<HttpScaleRuleArgs> http;

    public Output<HttpScaleRuleArgs> http() {
        return this.http == null ? Codegen.empty() : this.http;
    }

    /**
     * Scale Rule Name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public ScaleRuleArgs(
        @Nullable Output<QueueScaleRuleArgs> azureQueue,
        @Nullable Output<CustomScaleRuleArgs> custom,
        @Nullable Output<HttpScaleRuleArgs> http,
        @Nullable Output<String> name) {
        this.azureQueue = azureQueue;
        this.custom = custom;
        this.http = http;
        this.name = name;
    }

    private ScaleRuleArgs() {
        this.azureQueue = Codegen.empty();
        this.custom = Codegen.empty();
        this.http = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<QueueScaleRuleArgs> azureQueue;
        private @Nullable Output<CustomScaleRuleArgs> custom;
        private @Nullable Output<HttpScaleRuleArgs> http;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureQueue = defaults.azureQueue;
    	      this.custom = defaults.custom;
    	      this.http = defaults.http;
    	      this.name = defaults.name;
        }

        public Builder azureQueue(@Nullable Output<QueueScaleRuleArgs> azureQueue) {
            this.azureQueue = azureQueue;
            return this;
        }
        public Builder azureQueue(@Nullable QueueScaleRuleArgs azureQueue) {
            this.azureQueue = Codegen.ofNullable(azureQueue);
            return this;
        }
        public Builder custom(@Nullable Output<CustomScaleRuleArgs> custom) {
            this.custom = custom;
            return this;
        }
        public Builder custom(@Nullable CustomScaleRuleArgs custom) {
            this.custom = Codegen.ofNullable(custom);
            return this;
        }
        public Builder http(@Nullable Output<HttpScaleRuleArgs> http) {
            this.http = http;
            return this;
        }
        public Builder http(@Nullable HttpScaleRuleArgs http) {
            this.http = Codegen.ofNullable(http);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public ScaleRuleArgs build() {
            return new ScaleRuleArgs(azureQueue, custom, http, name);
        }
    }
}
