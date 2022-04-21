// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.clouddeploy_v1.inputs.AnthosClusterResponse;
import com.pulumi.googlenative.clouddeploy_v1.inputs.ExecutionConfigResponse;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GkeClusterResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A `Target` resource in the Google Cloud Deploy API. A `Target` defines a location to which a Skaffold configuration can be deployed.
 * 
 */
public final class TargetResponse extends com.pulumi.resources.InvokeArgs {

    public static final TargetResponse Empty = new TargetResponse();

    /**
     * Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @Import(name="annotations", required=true)
    private Map<String,String> annotations;

    public Map<String,String> annotations() {
        return this.annotations;
    }

    /**
     * Information specifying an Anthos Cluster.
     * 
     */
    @Import(name="anthosCluster", required=true)
    private AnthosClusterResponse anthosCluster;

    public AnthosClusterResponse anthosCluster() {
        return this.anthosCluster;
    }

    /**
     * Time at which the `Target` was created.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * Optional. Description of the `Target`. Max length is 255 characters.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
     * 
     */
    @Import(name="executionConfigs", required=true)
    private List<ExecutionConfigResponse> executionConfigs;

    public List<ExecutionConfigResponse> executionConfigs() {
        return this.executionConfigs;
    }

    /**
     * Information specifying a GKE Cluster.
     * 
     */
    @Import(name="gke", required=true)
    private GkeClusterResponse gke;

    public GkeClusterResponse gke() {
        return this.gke;
    }

    /**
     * Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 128 bytes.
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * Optional. Name of the `Target`. Format is projects/{project}/locations/{location}/targets/a-z{0,62}.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Optional. Whether or not the `Target` requires approval.
     * 
     */
    @Import(name="requireApproval", required=true)
    private Boolean requireApproval;

    public Boolean requireApproval() {
        return this.requireApproval;
    }

    /**
     * Resource id of the `Target`.
     * 
     */
    @Import(name="targetId", required=true)
    private String targetId;

    public String targetId() {
        return this.targetId;
    }

    /**
     * Unique identifier of the `Target`.
     * 
     */
    @Import(name="uid", required=true)
    private String uid;

    public String uid() {
        return this.uid;
    }

    /**
     * Most recent time at which the `Target` was updated.
     * 
     */
    @Import(name="updateTime", required=true)
    private String updateTime;

    public String updateTime() {
        return this.updateTime;
    }

    private TargetResponse() {}

    private TargetResponse(TargetResponse $) {
        this.annotations = $.annotations;
        this.anthosCluster = $.anthosCluster;
        this.createTime = $.createTime;
        this.description = $.description;
        this.etag = $.etag;
        this.executionConfigs = $.executionConfigs;
        this.gke = $.gke;
        this.labels = $.labels;
        this.name = $.name;
        this.requireApproval = $.requireApproval;
        this.targetId = $.targetId;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetResponse $;

        public Builder() {
            $ = new TargetResponse();
        }

        public Builder(TargetResponse defaults) {
            $ = new TargetResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(Map<String,String> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder anthosCluster(AnthosClusterResponse anthosCluster) {
            $.anthosCluster = anthosCluster;
            return this;
        }

        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder executionConfigs(List<ExecutionConfigResponse> executionConfigs) {
            $.executionConfigs = executionConfigs;
            return this;
        }

        public Builder executionConfigs(ExecutionConfigResponse... executionConfigs) {
            return executionConfigs(List.of(executionConfigs));
        }

        public Builder gke(GkeClusterResponse gke) {
            $.gke = gke;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder requireApproval(Boolean requireApproval) {
            $.requireApproval = requireApproval;
            return this;
        }

        public Builder targetId(String targetId) {
            $.targetId = targetId;
            return this;
        }

        public Builder uid(String uid) {
            $.uid = uid;
            return this;
        }

        public Builder updateTime(String updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public TargetResponse build() {
            $.annotations = Objects.requireNonNull($.annotations, "expected parameter 'annotations' to be non-null");
            $.anthosCluster = Objects.requireNonNull($.anthosCluster, "expected parameter 'anthosCluster' to be non-null");
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.executionConfigs = Objects.requireNonNull($.executionConfigs, "expected parameter 'executionConfigs' to be non-null");
            $.gke = Objects.requireNonNull($.gke, "expected parameter 'gke' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.requireApproval = Objects.requireNonNull($.requireApproval, "expected parameter 'requireApproval' to be non-null");
            $.targetId = Objects.requireNonNull($.targetId, "expected parameter 'targetId' to be non-null");
            $.uid = Objects.requireNonNull($.uid, "expected parameter 'uid' to be non-null");
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            return $;
        }
    }

}
