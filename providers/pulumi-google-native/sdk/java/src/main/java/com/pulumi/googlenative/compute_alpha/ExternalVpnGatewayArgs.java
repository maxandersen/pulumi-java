// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.ExternalVpnGatewayRedundancyType;
import com.pulumi.googlenative.compute_alpha.inputs.ExternalVpnGatewayInterfaceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExternalVpnGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalVpnGatewayArgs Empty = new ExternalVpnGatewayArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A list of interfaces for this external VPN gateway. If your peer-side gateway is an on-premises gateway and non-AWS cloud providers' gateway, at most two interfaces can be provided for an external VPN gateway. If your peer side is an AWS virtual private gateway, four interfaces should be provided for an external VPN gateway.
     * 
     */
    @Import(name="interfaces")
      private final @Nullable Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces;

    public Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces() {
        return this.interfaces == null ? Codegen.empty() : this.interfaces;
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Indicates the user-supplied redundancy type of this external VPN gateway.
     * 
     */
    @Import(name="redundancyType")
      private final @Nullable Output<ExternalVpnGatewayRedundancyType> redundancyType;

    public Output<ExternalVpnGatewayRedundancyType> redundancyType() {
        return this.redundancyType == null ? Codegen.empty() : this.redundancyType;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    public ExternalVpnGatewayArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<ExternalVpnGatewayRedundancyType> redundancyType,
        @Nullable Output<String> requestId) {
        this.description = description;
        this.interfaces = interfaces;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.redundancyType = redundancyType;
        this.requestId = requestId;
    }

    private ExternalVpnGatewayArgs() {
        this.description = Codegen.empty();
        this.interfaces = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.redundancyType = Codegen.empty();
        this.requestId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<ExternalVpnGatewayRedundancyType> redundancyType;
        private @Nullable Output<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalVpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.interfaces = defaults.interfaces;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.redundancyType = defaults.redundancyType;
    	      this.requestId = defaults.requestId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder interfaces(@Nullable Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces) {
            this.interfaces = interfaces;
            return this;
        }
        public Builder interfaces(@Nullable List<ExternalVpnGatewayInterfaceArgs> interfaces) {
            this.interfaces = Codegen.ofNullable(interfaces);
            return this;
        }
        public Builder interfaces(ExternalVpnGatewayInterfaceArgs... interfaces) {
            return interfaces(List.of(interfaces));
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
        public Builder redundancyType(@Nullable Output<ExternalVpnGatewayRedundancyType> redundancyType) {
            this.redundancyType = redundancyType;
            return this;
        }
        public Builder redundancyType(@Nullable ExternalVpnGatewayRedundancyType redundancyType) {
            this.redundancyType = Codegen.ofNullable(redundancyType);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }        public ExternalVpnGatewayArgs build() {
            return new ExternalVpnGatewayArgs(description, interfaces, labels, name, project, redundancyType, requestId);
        }
    }
}
