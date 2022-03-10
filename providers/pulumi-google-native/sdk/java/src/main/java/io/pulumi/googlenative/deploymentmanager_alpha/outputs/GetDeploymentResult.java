// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.CredentialResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.DeploymentLabelEntryResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.DeploymentOutputEntryResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.DeploymentUpdateResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.OperationResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.TargetConfigurationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDeploymentResult {
    /**
     * User provided default credential for the deployment.
     * 
     */
    private final CredentialResponse credential;
    /**
     * An optional user-provided description of the deployment.
     * 
     */
    private final String description;
    /**
     * Provides a fingerprint to use in requests to modify a deployment, such as `update()`, `stop()`, and `cancelPreview()` requests. A fingerprint is a randomly generated value that must be provided with `update()`, `stop()`, and `cancelPreview()` requests to perform optimistic locking. This ensures optimistic concurrency so that only one request happens at a time. The fingerprint is initially generated by Deployment Manager and changes after every request to modify data. To get the latest fingerprint value, perform a `get()` request to a deployment.
     * 
     */
    private final String fingerprint;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String insertTime;
    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    private final List<DeploymentLabelEntryResponse> labels;
    /**
     * URL of the manifest representing the last manifest that was successfully deployed. If no manifest has been successfully deployed, this field will be absent.
     * 
     */
    private final String manifest;
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The Operation that most recently ran, or is currently running, on this deployment.
     * 
     */
    private final OperationResponse operation;
    /**
     * List of outputs from the last manifest that deployed successfully.
     * 
     */
    private final List<DeploymentOutputEntryResponse> outputs;
    /**
     * Server defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * [Input Only] The parameters that define your deployment, including the deployment configuration and relevant templates.
     * 
     */
    private final TargetConfigurationResponse target;
    /**
     * If Deployment Manager is currently updating or previewing an update to this deployment, the updated configuration appears here.
     * 
     */
    private final DeploymentUpdateResponse update;
    /**
     * Update timestamp in RFC3339 text format.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor
    private GetDeploymentResult(
        @OutputCustomType.Parameter("credential") CredentialResponse credential,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("fingerprint") String fingerprint,
        @OutputCustomType.Parameter("insertTime") String insertTime,
        @OutputCustomType.Parameter("labels") List<DeploymentLabelEntryResponse> labels,
        @OutputCustomType.Parameter("manifest") String manifest,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("operation") OperationResponse operation,
        @OutputCustomType.Parameter("outputs") List<DeploymentOutputEntryResponse> outputs,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("target") TargetConfigurationResponse target,
        @OutputCustomType.Parameter("update") DeploymentUpdateResponse update,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.credential = credential;
        this.description = description;
        this.fingerprint = fingerprint;
        this.insertTime = insertTime;
        this.labels = labels;
        this.manifest = manifest;
        this.name = name;
        this.operation = operation;
        this.outputs = outputs;
        this.selfLink = selfLink;
        this.target = target;
        this.update = update;
        this.updateTime = updateTime;
    }

    /**
     * User provided default credential for the deployment.
     * 
    */
    public CredentialResponse getCredential() {
        return this.credential;
    }
    /**
     * An optional user-provided description of the deployment.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Provides a fingerprint to use in requests to modify a deployment, such as `update()`, `stop()`, and `cancelPreview()` requests. A fingerprint is a randomly generated value that must be provided with `update()`, `stop()`, and `cancelPreview()` requests to perform optimistic locking. This ensures optimistic concurrency so that only one request happens at a time. The fingerprint is initially generated by Deployment Manager and changes after every request to modify data. To get the latest fingerprint value, perform a `get()` request to a deployment.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getInsertTime() {
        return this.insertTime;
    }
    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
    */
    public List<DeploymentLabelEntryResponse> getLabels() {
        return this.labels;
    }
    /**
     * URL of the manifest representing the last manifest that was successfully deployed. If no manifest has been successfully deployed, this field will be absent.
     * 
    */
    public String getManifest() {
        return this.manifest;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Operation that most recently ran, or is currently running, on this deployment.
     * 
    */
    public OperationResponse getOperation() {
        return this.operation;
    }
    /**
     * List of outputs from the last manifest that deployed successfully.
     * 
    */
    public List<DeploymentOutputEntryResponse> getOutputs() {
        return this.outputs;
    }
    /**
     * Server defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * [Input Only] The parameters that define your deployment, including the deployment configuration and relevant templates.
     * 
    */
    public TargetConfigurationResponse getTarget() {
        return this.target;
    }
    /**
     * If Deployment Manager is currently updating or previewing an update to this deployment, the updated configuration appears here.
     * 
    */
    public DeploymentUpdateResponse getUpdate() {
        return this.update;
    }
    /**
     * Update timestamp in RFC3339 text format.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CredentialResponse credential;
        private String description;
        private String fingerprint;
        private String insertTime;
        private List<DeploymentLabelEntryResponse> labels;
        private String manifest;
        private String name;
        private OperationResponse operation;
        private List<DeploymentOutputEntryResponse> outputs;
        private String selfLink;
        private TargetConfigurationResponse target;
        private DeploymentUpdateResponse update;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.insertTime = defaults.insertTime;
    	      this.labels = defaults.labels;
    	      this.manifest = defaults.manifest;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.outputs = defaults.outputs;
    	      this.selfLink = defaults.selfLink;
    	      this.target = defaults.target;
    	      this.update = defaults.update;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCredential(CredentialResponse credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setInsertTime(String insertTime) {
            this.insertTime = Objects.requireNonNull(insertTime);
            return this;
        }

        public Builder setLabels(List<DeploymentLabelEntryResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setManifest(String manifest) {
            this.manifest = Objects.requireNonNull(manifest);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperation(OperationResponse operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setOutputs(List<DeploymentOutputEntryResponse> outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setTarget(TargetConfigurationResponse target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setUpdate(DeploymentUpdateResponse update) {
            this.update = Objects.requireNonNull(update);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetDeploymentResult build() {
            return new GetDeploymentResult(credential, description, fingerprint, insertTime, labels, manifest, name, operation, outputs, selfLink, target, update, updateTime);
        }
    }
}
