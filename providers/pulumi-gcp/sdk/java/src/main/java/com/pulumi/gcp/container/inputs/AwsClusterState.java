// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.container.inputs.AwsClusterAuthorizationGetArgs;
import com.pulumi.gcp.container.inputs.AwsClusterControlPlaneGetArgs;
import com.pulumi.gcp.container.inputs.AwsClusterFleetGetArgs;
import com.pulumi.gcp.container.inputs.AwsClusterNetworkingGetArgs;
import com.pulumi.gcp.container.inputs.AwsClusterWorkloadIdentityConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsClusterState extends com.pulumi.resources.ResourceArgs {

    public static final AwsClusterState Empty = new AwsClusterState();

    /**
     * Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Key can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * Required. Configuration related to the cluster RBAC settings.
     * 
     */
    @Import(name="authorization")
      private final @Nullable Output<AwsClusterAuthorizationGetArgs> authorization;

    public Output<AwsClusterAuthorizationGetArgs> authorization() {
        return this.authorization == null ? Codegen.empty() : this.authorization;
    }

    /**
     * Required. The AWS region where the cluster runs. Each Google Cloud region supports a subset of nearby AWS regions. You can call to list all supported AWS regions within a given Google Cloud region.
     * 
     */
    @Import(name="awsRegion")
      private final @Nullable Output<String> awsRegion;

    public Output<String> awsRegion() {
        return this.awsRegion == null ? Codegen.empty() : this.awsRegion;
    }

    /**
     * Required. Configuration related to the cluster control plane.
     * 
     */
    @Import(name="controlPlane")
      private final @Nullable Output<AwsClusterControlPlaneGetArgs> controlPlane;

    public Output<AwsClusterControlPlaneGetArgs> controlPlane() {
        return this.controlPlane == null ? Codegen.empty() : this.controlPlane;
    }

    /**
     * Output only. The time at which this cluster was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Output only. The endpoint of the cluster&#39;s API server.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> endpoint() {
        return this.endpoint == null ? Codegen.empty() : this.endpoint;
    }

    /**
     * Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update
     * and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Fleet configuration.
     * 
     */
    @Import(name="fleet")
      private final @Nullable Output<AwsClusterFleetGetArgs> fleet;

    public Output<AwsClusterFleetGetArgs> fleet() {
        return this.fleet == null ? Codegen.empty() : this.fleet;
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of this resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Required. Cluster-wide networking configuration.
     * 
     */
    @Import(name="networking")
      private final @Nullable Output<AwsClusterNetworkingGetArgs> networking;

    public Output<AwsClusterNetworkingGetArgs> networking() {
        return this.networking == null ? Codegen.empty() : this.networking;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Output only. If set, there are currently changes in flight to the cluster.
     * 
     */
    @Import(name="reconciling")
      private final @Nullable Output<Boolean> reconciling;

    public Output<Boolean> reconciling() {
        return this.reconciling == null ? Codegen.empty() : this.reconciling;
    }

    /**
     * Output only. The current state of the cluster. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING,
     * STOPPING, ERROR, DEGRADED
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * Output only. A globally unique identifier for the cluster.
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<String> uid;

    public Output<String> uid() {
        return this.uid == null ? Codegen.empty() : this.uid;
    }

    /**
     * Output only. The time at which this cluster was last updated.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> updateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    /**
     * Output only. Workload Identity settings.
     * 
     */
    @Import(name="workloadIdentityConfigs")
      private final @Nullable Output<List<AwsClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs;

    public Output<List<AwsClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs() {
        return this.workloadIdentityConfigs == null ? Codegen.empty() : this.workloadIdentityConfigs;
    }

    public AwsClusterState(
        @Nullable Output<Map<String,String>> annotations,
        @Nullable Output<AwsClusterAuthorizationGetArgs> authorization,
        @Nullable Output<String> awsRegion,
        @Nullable Output<AwsClusterControlPlaneGetArgs> controlPlane,
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        @Nullable Output<String> endpoint,
        @Nullable Output<String> etag,
        @Nullable Output<AwsClusterFleetGetArgs> fleet,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<AwsClusterNetworkingGetArgs> networking,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> reconciling,
        @Nullable Output<String> state,
        @Nullable Output<String> uid,
        @Nullable Output<String> updateTime,
        @Nullable Output<List<AwsClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs) {
        this.annotations = annotations;
        this.authorization = authorization;
        this.awsRegion = awsRegion;
        this.controlPlane = controlPlane;
        this.createTime = createTime;
        this.description = description;
        this.endpoint = endpoint;
        this.etag = etag;
        this.fleet = fleet;
        this.location = location;
        this.name = name;
        this.networking = networking;
        this.project = project;
        this.reconciling = reconciling;
        this.state = state;
        this.uid = uid;
        this.updateTime = updateTime;
        this.workloadIdentityConfigs = workloadIdentityConfigs;
    }

    private AwsClusterState() {
        this.annotations = Codegen.empty();
        this.authorization = Codegen.empty();
        this.awsRegion = Codegen.empty();
        this.controlPlane = Codegen.empty();
        this.createTime = Codegen.empty();
        this.description = Codegen.empty();
        this.endpoint = Codegen.empty();
        this.etag = Codegen.empty();
        this.fleet = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.networking = Codegen.empty();
        this.project = Codegen.empty();
        this.reconciling = Codegen.empty();
        this.state = Codegen.empty();
        this.uid = Codegen.empty();
        this.updateTime = Codegen.empty();
        this.workloadIdentityConfigs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private @Nullable Output<AwsClusterAuthorizationGetArgs> authorization;
        private @Nullable Output<String> awsRegion;
        private @Nullable Output<AwsClusterControlPlaneGetArgs> controlPlane;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<String> etag;
        private @Nullable Output<AwsClusterFleetGetArgs> fleet;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<AwsClusterNetworkingGetArgs> networking;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> reconciling;
        private @Nullable Output<String> state;
        private @Nullable Output<String> uid;
        private @Nullable Output<String> updateTime;
        private @Nullable Output<List<AwsClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authorization = defaults.authorization;
    	      this.awsRegion = defaults.awsRegion;
    	      this.controlPlane = defaults.controlPlane;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.etag = defaults.etag;
    	      this.fleet = defaults.fleet;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networking = defaults.networking;
    	      this.project = defaults.project;
    	      this.reconciling = defaults.reconciling;
    	      this.state = defaults.state;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.workloadIdentityConfigs = defaults.workloadIdentityConfigs;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder authorization(@Nullable Output<AwsClusterAuthorizationGetArgs> authorization) {
            this.authorization = authorization;
            return this;
        }
        public Builder authorization(@Nullable AwsClusterAuthorizationGetArgs authorization) {
            this.authorization = Codegen.ofNullable(authorization);
            return this;
        }
        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }
        public Builder awsRegion(@Nullable String awsRegion) {
            this.awsRegion = Codegen.ofNullable(awsRegion);
            return this;
        }
        public Builder controlPlane(@Nullable Output<AwsClusterControlPlaneGetArgs> controlPlane) {
            this.controlPlane = controlPlane;
            return this;
        }
        public Builder controlPlane(@Nullable AwsClusterControlPlaneGetArgs controlPlane) {
            this.controlPlane = Codegen.ofNullable(controlPlane);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
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
        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Codegen.ofNullable(endpoint);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder fleet(@Nullable Output<AwsClusterFleetGetArgs> fleet) {
            this.fleet = fleet;
            return this;
        }
        public Builder fleet(@Nullable AwsClusterFleetGetArgs fleet) {
            this.fleet = Codegen.ofNullable(fleet);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder networking(@Nullable Output<AwsClusterNetworkingGetArgs> networking) {
            this.networking = networking;
            return this;
        }
        public Builder networking(@Nullable AwsClusterNetworkingGetArgs networking) {
            this.networking = Codegen.ofNullable(networking);
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
        public Builder reconciling(@Nullable Output<Boolean> reconciling) {
            this.reconciling = reconciling;
            return this;
        }
        public Builder reconciling(@Nullable Boolean reconciling) {
            this.reconciling = Codegen.ofNullable(reconciling);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder uid(@Nullable Output<String> uid) {
            this.uid = uid;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = Codegen.ofNullable(uid);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }
        public Builder workloadIdentityConfigs(@Nullable Output<List<AwsClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs) {
            this.workloadIdentityConfigs = workloadIdentityConfigs;
            return this;
        }
        public Builder workloadIdentityConfigs(@Nullable List<AwsClusterWorkloadIdentityConfigGetArgs> workloadIdentityConfigs) {
            this.workloadIdentityConfigs = Codegen.ofNullable(workloadIdentityConfigs);
            return this;
        }
        public Builder workloadIdentityConfigs(AwsClusterWorkloadIdentityConfigGetArgs... workloadIdentityConfigs) {
            return workloadIdentityConfigs(List.of(workloadIdentityConfigs));
        }        public AwsClusterState build() {
            return new AwsClusterState(annotations, authorization, awsRegion, controlPlane, createTime, description, endpoint, etag, fleet, location, name, networking, project, reconciling, state, uid, updateTime, workloadIdentityConfigs);
        }
    }
}
