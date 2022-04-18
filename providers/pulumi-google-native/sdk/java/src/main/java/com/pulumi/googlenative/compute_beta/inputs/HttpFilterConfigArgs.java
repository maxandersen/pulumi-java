// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HttpFilterConfiguration supplies additional contextual settings for networkservices.HttpFilter resources enabled by Traffic Director.
 * 
 */
public final class HttpFilterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpFilterConfigArgs Empty = new HttpFilterConfigArgs();

    /**
     * The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
     * 
     */
    @Import(name="config")
      private final @Nullable Output<String> config;

    public Output<String> config() {
        return this.config == null ? Codegen.empty() : this.config;
    }

    /**
     * The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
     * 
     */
    @Import(name="configTypeUrl")
      private final @Nullable Output<String> configTypeUrl;

    public Output<String> configTypeUrl() {
        return this.configTypeUrl == null ? Codegen.empty() : this.configTypeUrl;
    }

    /**
     * Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
     * 
     */
    @Import(name="filterName")
      private final @Nullable Output<String> filterName;

    public Output<String> filterName() {
        return this.filterName == null ? Codegen.empty() : this.filterName;
    }

    public HttpFilterConfigArgs(
        @Nullable Output<String> config,
        @Nullable Output<String> configTypeUrl,
        @Nullable Output<String> filterName) {
        this.config = config;
        this.configTypeUrl = configTypeUrl;
        this.filterName = filterName;
    }

    private HttpFilterConfigArgs() {
        this.config = Codegen.empty();
        this.configTypeUrl = Codegen.empty();
        this.filterName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFilterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> config;
        private @Nullable Output<String> configTypeUrl;
        private @Nullable Output<String> filterName;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFilterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.configTypeUrl = defaults.configTypeUrl;
    	      this.filterName = defaults.filterName;
        }

        public Builder config(@Nullable Output<String> config) {
            this.config = config;
            return this;
        }
        public Builder config(@Nullable String config) {
            this.config = Codegen.ofNullable(config);
            return this;
        }
        public Builder configTypeUrl(@Nullable Output<String> configTypeUrl) {
            this.configTypeUrl = configTypeUrl;
            return this;
        }
        public Builder configTypeUrl(@Nullable String configTypeUrl) {
            this.configTypeUrl = Codegen.ofNullable(configTypeUrl);
            return this;
        }
        public Builder filterName(@Nullable Output<String> filterName) {
            this.filterName = filterName;
            return this;
        }
        public Builder filterName(@Nullable String filterName) {
            this.filterName = Codegen.ofNullable(filterName);
            return this;
        }        public HttpFilterConfigArgs build() {
            return new HttpFilterConfigArgs(config, configTypeUrl, filterName);
        }
    }
}
