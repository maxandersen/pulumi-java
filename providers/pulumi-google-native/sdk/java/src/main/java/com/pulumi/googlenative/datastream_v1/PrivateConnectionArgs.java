// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream_v1.inputs.VpcPeeringConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateConnectionArgs Empty = new PrivateConnectionArgs();

    /**
     * Display name.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="privateConnectionId", required=true)
    private Output<String> privateConnectionId;

    public Output<String> privateConnectionId() {
        return this.privateConnectionId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * VPC Peering Config.
     * 
     */
    @Import(name="vpcPeeringConfig")
    private @Nullable Output<VpcPeeringConfigArgs> vpcPeeringConfig;

    public Optional<Output<VpcPeeringConfigArgs>> vpcPeeringConfig() {
        return Optional.ofNullable(this.vpcPeeringConfig);
    }

    private PrivateConnectionArgs() {}

    private PrivateConnectionArgs(PrivateConnectionArgs $) {
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.location = $.location;
        this.privateConnectionId = $.privateConnectionId;
        this.project = $.project;
        this.requestId = $.requestId;
        this.vpcPeeringConfig = $.vpcPeeringConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateConnectionArgs $;

        public Builder() {
            $ = new PrivateConnectionArgs();
        }

        public Builder(PrivateConnectionArgs defaults) {
            $ = new PrivateConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder privateConnectionId(Output<String> privateConnectionId) {
            $.privateConnectionId = privateConnectionId;
            return this;
        }

        public Builder privateConnectionId(String privateConnectionId) {
            return privateConnectionId(Output.of(privateConnectionId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder vpcPeeringConfig(@Nullable Output<VpcPeeringConfigArgs> vpcPeeringConfig) {
            $.vpcPeeringConfig = vpcPeeringConfig;
            return this;
        }

        public Builder vpcPeeringConfig(VpcPeeringConfigArgs vpcPeeringConfig) {
            return vpcPeeringConfig(Output.of(vpcPeeringConfig));
        }

        public PrivateConnectionArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.privateConnectionId = Objects.requireNonNull($.privateConnectionId, "expected parameter 'privateConnectionId' to be non-null");
            return $;
        }
    }

}
