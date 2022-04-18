// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.datastream_v1.inputs.VpcPeeringConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateConnectionArgs Empty = new PrivateConnectionArgs();

    /**
     * Display name.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Labels.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="privateConnectionId", required=true)
      private final Output<String> privateConnectionId;

    public Output<String> privateConnectionId() {
        return this.privateConnectionId;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * VPC Peering Config.
     * 
     */
    @Import(name="vpcPeeringConfig")
      private final @Nullable Output<VpcPeeringConfigArgs> vpcPeeringConfig;

    public Output<VpcPeeringConfigArgs> vpcPeeringConfig() {
        return this.vpcPeeringConfig == null ? Codegen.empty() : this.vpcPeeringConfig;
    }

    public PrivateConnectionArgs(
        Output<String> displayName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        Output<String> privateConnectionId,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<VpcPeeringConfigArgs> vpcPeeringConfig) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.labels = labels;
        this.location = location;
        this.privateConnectionId = Objects.requireNonNull(privateConnectionId, "expected parameter 'privateConnectionId' to be non-null");
        this.project = project;
        this.requestId = requestId;
        this.vpcPeeringConfig = vpcPeeringConfig;
    }

    private PrivateConnectionArgs() {
        this.displayName = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.privateConnectionId = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.vpcPeeringConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> displayName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private Output<String> privateConnectionId;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<VpcPeeringConfigArgs> vpcPeeringConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.privateConnectionId = defaults.privateConnectionId;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.vpcPeeringConfig = defaults.vpcPeeringConfig;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
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
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder privateConnectionId(Output<String> privateConnectionId) {
            this.privateConnectionId = Objects.requireNonNull(privateConnectionId);
            return this;
        }
        public Builder privateConnectionId(String privateConnectionId) {
            this.privateConnectionId = Output.of(Objects.requireNonNull(privateConnectionId));
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
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder vpcPeeringConfig(@Nullable Output<VpcPeeringConfigArgs> vpcPeeringConfig) {
            this.vpcPeeringConfig = vpcPeeringConfig;
            return this;
        }
        public Builder vpcPeeringConfig(@Nullable VpcPeeringConfigArgs vpcPeeringConfig) {
            this.vpcPeeringConfig = Codegen.ofNullable(vpcPeeringConfig);
            return this;
        }        public PrivateConnectionArgs build() {
            return new PrivateConnectionArgs(displayName, labels, location, privateConnectionId, project, requestId, vpcPeeringConfig);
        }
    }
}
