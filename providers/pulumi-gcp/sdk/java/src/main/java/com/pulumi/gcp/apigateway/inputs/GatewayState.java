// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayState extends com.pulumi.resources.ResourceArgs {

    public static final GatewayState Empty = new GatewayState();

    /**
     * Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}.
     * When changing api configs please ensure the new config is a new resource and the lifecycle rule `create_before_destroy` is set.
     * 
     */
    @Import(name="apiConfig")
      private final @Nullable Output<String> apiConfig;

    public Output<String> apiConfig() {
        return this.apiConfig == null ? Codegen.empty() : this.apiConfig;
    }

    /**
     * The default API Gateway host name of the form {gatewayId}-{hash}.{region_code}.gateway.dev.
     * 
     */
    @Import(name="defaultHostname")
      private final @Nullable Output<String> defaultHostname;

    public Output<String> defaultHostname() {
        return this.defaultHostname == null ? Codegen.empty() : this.defaultHostname;
    }

    /**
     * A user-visible name for the API.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Identifier to assign to the Gateway. Must be unique within scope of the parent resource(project).
     * 
     */
    @Import(name="gatewayId")
      private final @Nullable Output<String> gatewayId;

    public Output<String> gatewayId() {
        return this.gatewayId == null ? Codegen.empty() : this.gatewayId;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Resource name of the Gateway. Format: projects/{project}/locations/{region}/gateways/{gateway}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The region of the gateway for the API.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    public GatewayState(
        @Nullable Output<String> apiConfig,
        @Nullable Output<String> defaultHostname,
        @Nullable Output<String> displayName,
        @Nullable Output<String> gatewayId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.apiConfig = apiConfig;
        this.defaultHostname = defaultHostname;
        this.displayName = displayName;
        this.gatewayId = gatewayId;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.region = region;
    }

    private GatewayState() {
        this.apiConfig = Codegen.empty();
        this.defaultHostname = Codegen.empty();
        this.displayName = Codegen.empty();
        this.gatewayId = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiConfig;
        private @Nullable Output<String> defaultHostname;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> gatewayId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiConfig = defaults.apiConfig;
    	      this.defaultHostname = defaults.defaultHostname;
    	      this.displayName = defaults.displayName;
    	      this.gatewayId = defaults.gatewayId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder apiConfig(@Nullable Output<String> apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }
        public Builder apiConfig(@Nullable String apiConfig) {
            this.apiConfig = Codegen.ofNullable(apiConfig);
            return this;
        }
        public Builder defaultHostname(@Nullable Output<String> defaultHostname) {
            this.defaultHostname = defaultHostname;
            return this;
        }
        public Builder defaultHostname(@Nullable String defaultHostname) {
            this.defaultHostname = Codegen.ofNullable(defaultHostname);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder gatewayId(@Nullable Output<String> gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Builder gatewayId(@Nullable String gatewayId) {
            this.gatewayId = Codegen.ofNullable(gatewayId);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }        public GatewayState build() {
            return new GatewayState(apiConfig, defaultHostname, displayName, gatewayId, labels, name, project, region);
        }
    }
}
