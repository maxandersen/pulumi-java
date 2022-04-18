// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.NetworkEndpointGroupNetworkEndpointType;
import com.pulumi.googlenative.compute_alpha.enums.NetworkEndpointGroupType;
import com.pulumi.googlenative.compute_alpha.inputs.NetworkEndpointGroupAppEngineArgs;
import com.pulumi.googlenative.compute_alpha.inputs.NetworkEndpointGroupCloudFunctionArgs;
import com.pulumi.googlenative.compute_alpha.inputs.NetworkEndpointGroupCloudRunArgs;
import com.pulumi.googlenative.compute_alpha.inputs.NetworkEndpointGroupServerlessDeploymentArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkEndpointGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupArgs Empty = new NetworkEndpointGroupArgs();

    /**
     * Metadata defined as annotations on the network endpoint group.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Import(name="appEngine")
      private final @Nullable Output<NetworkEndpointGroupAppEngineArgs> appEngine;

    public Output<NetworkEndpointGroupAppEngineArgs> appEngine() {
        return this.appEngine == null ? Codegen.empty() : this.appEngine;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Import(name="cloudFunction")
      private final @Nullable Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction;

    public Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction() {
        return this.cloudFunction == null ? Codegen.empty() : this.cloudFunction;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Import(name="cloudRun")
      private final @Nullable Output<NetworkEndpointGroupCloudRunArgs> cloudRun;

    public Output<NetworkEndpointGroupCloudRunArgs> cloudRun() {
        return this.cloudRun == null ? Codegen.empty() : this.cloudRun;
    }

    /**
     * The default port used if the port number is not specified in the network endpoint.
     * 
     */
    @Import(name="defaultPort")
      private final @Nullable Output<Integer> defaultPort;

    public Output<Integer> defaultPort() {
        return this.defaultPort == null ? Codegen.empty() : this.defaultPort;
    }

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
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project network if unspecified.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    @Import(name="networkEndpointType")
      private final @Nullable Output<NetworkEndpointGroupNetworkEndpointType> networkEndpointType;

    public Output<NetworkEndpointGroupNetworkEndpointType> networkEndpointType() {
        return this.networkEndpointType == null ? Codegen.empty() : this.networkEndpointType;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The target service url used to set up private service connection to a Google API. An example value is: "asia-northeast3-cloudkms.googleapis.com"
     * 
     */
    @Import(name="pscTargetService")
      private final @Nullable Output<String> pscTargetService;

    public Output<String> pscTargetService() {
        return this.pscTargetService == null ? Codegen.empty() : this.pscTargetService;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    @Import(name="serverlessDeployment")
      private final @Nullable Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment;

    public Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment() {
        return this.serverlessDeployment == null ? Codegen.empty() : this.serverlessDeployment;
    }

    /**
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> subnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    /**
     * Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<NetworkEndpointGroupType> type;

    public Output<NetworkEndpointGroupType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public NetworkEndpointGroupArgs(
        @Nullable Output<Map<String,String>> annotations,
        @Nullable Output<NetworkEndpointGroupAppEngineArgs> appEngine,
        @Nullable Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction,
        @Nullable Output<NetworkEndpointGroupCloudRunArgs> cloudRun,
        @Nullable Output<Integer> defaultPort,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<NetworkEndpointGroupNetworkEndpointType> networkEndpointType,
        @Nullable Output<String> project,
        @Nullable Output<String> pscTargetService,
        @Nullable Output<String> requestId,
        @Nullable Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment,
        @Nullable Output<String> subnetwork,
        @Nullable Output<NetworkEndpointGroupType> type,
        @Nullable Output<String> zone) {
        this.annotations = annotations;
        this.appEngine = appEngine;
        this.cloudFunction = cloudFunction;
        this.cloudRun = cloudRun;
        this.defaultPort = defaultPort;
        this.description = description;
        this.name = name;
        this.network = network;
        this.networkEndpointType = networkEndpointType;
        this.project = project;
        this.pscTargetService = pscTargetService;
        this.requestId = requestId;
        this.serverlessDeployment = serverlessDeployment;
        this.subnetwork = subnetwork;
        this.type = type;
        this.zone = zone;
    }

    private NetworkEndpointGroupArgs() {
        this.annotations = Codegen.empty();
        this.appEngine = Codegen.empty();
        this.cloudFunction = Codegen.empty();
        this.cloudRun = Codegen.empty();
        this.defaultPort = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.networkEndpointType = Codegen.empty();
        this.project = Codegen.empty();
        this.pscTargetService = Codegen.empty();
        this.requestId = Codegen.empty();
        this.serverlessDeployment = Codegen.empty();
        this.subnetwork = Codegen.empty();
        this.type = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private @Nullable Output<NetworkEndpointGroupAppEngineArgs> appEngine;
        private @Nullable Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction;
        private @Nullable Output<NetworkEndpointGroupCloudRunArgs> cloudRun;
        private @Nullable Output<Integer> defaultPort;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<NetworkEndpointGroupNetworkEndpointType> networkEndpointType;
        private @Nullable Output<String> project;
        private @Nullable Output<String> pscTargetService;
        private @Nullable Output<String> requestId;
        private @Nullable Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<NetworkEndpointGroupType> type;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.appEngine = defaults.appEngine;
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRun = defaults.cloudRun;
    	      this.defaultPort = defaults.defaultPort;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkEndpointType = defaults.networkEndpointType;
    	      this.project = defaults.project;
    	      this.pscTargetService = defaults.pscTargetService;
    	      this.requestId = defaults.requestId;
    	      this.serverlessDeployment = defaults.serverlessDeployment;
    	      this.subnetwork = defaults.subnetwork;
    	      this.type = defaults.type;
    	      this.zone = defaults.zone;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder appEngine(@Nullable Output<NetworkEndpointGroupAppEngineArgs> appEngine) {
            this.appEngine = appEngine;
            return this;
        }
        public Builder appEngine(@Nullable NetworkEndpointGroupAppEngineArgs appEngine) {
            this.appEngine = Codegen.ofNullable(appEngine);
            return this;
        }
        public Builder cloudFunction(@Nullable Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction) {
            this.cloudFunction = cloudFunction;
            return this;
        }
        public Builder cloudFunction(@Nullable NetworkEndpointGroupCloudFunctionArgs cloudFunction) {
            this.cloudFunction = Codegen.ofNullable(cloudFunction);
            return this;
        }
        public Builder cloudRun(@Nullable Output<NetworkEndpointGroupCloudRunArgs> cloudRun) {
            this.cloudRun = cloudRun;
            return this;
        }
        public Builder cloudRun(@Nullable NetworkEndpointGroupCloudRunArgs cloudRun) {
            this.cloudRun = Codegen.ofNullable(cloudRun);
            return this;
        }
        public Builder defaultPort(@Nullable Output<Integer> defaultPort) {
            this.defaultPort = defaultPort;
            return this;
        }
        public Builder defaultPort(@Nullable Integer defaultPort) {
            this.defaultPort = Codegen.ofNullable(defaultPort);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder networkEndpointType(@Nullable Output<NetworkEndpointGroupNetworkEndpointType> networkEndpointType) {
            this.networkEndpointType = networkEndpointType;
            return this;
        }
        public Builder networkEndpointType(@Nullable NetworkEndpointGroupNetworkEndpointType networkEndpointType) {
            this.networkEndpointType = Codegen.ofNullable(networkEndpointType);
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
        public Builder pscTargetService(@Nullable Output<String> pscTargetService) {
            this.pscTargetService = pscTargetService;
            return this;
        }
        public Builder pscTargetService(@Nullable String pscTargetService) {
            this.pscTargetService = Codegen.ofNullable(pscTargetService);
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
        public Builder serverlessDeployment(@Nullable Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment) {
            this.serverlessDeployment = serverlessDeployment;
            return this;
        }
        public Builder serverlessDeployment(@Nullable NetworkEndpointGroupServerlessDeploymentArgs serverlessDeployment) {
            this.serverlessDeployment = Codegen.ofNullable(serverlessDeployment);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }
        public Builder type(@Nullable Output<NetworkEndpointGroupType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable NetworkEndpointGroupType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public NetworkEndpointGroupArgs build() {
            return new NetworkEndpointGroupArgs(annotations, appEngine, cloudFunction, cloudRun, defaultPort, description, name, network, networkEndpointType, project, pscTargetService, requestId, serverlessDeployment, subnetwork, type, zone);
        }
    }
}
