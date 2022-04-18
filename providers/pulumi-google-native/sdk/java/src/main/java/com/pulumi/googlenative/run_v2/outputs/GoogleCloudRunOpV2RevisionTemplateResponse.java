// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2ContainerResponse;
import com.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2RevisionScalingResponse;
import com.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2VolumeResponse;
import com.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2VpcAccessResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudRunOpV2RevisionTemplateResponse {
    /**
     * KRM-style annotations for the resource.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * Enables Confidential Cloud Run in Revisions created using this template.
     * 
     */
    private final Boolean confidential;
    /**
     * Sets the maximum number of requests that each serving instance can receive.
     * 
     */
    private final Integer containerConcurrency;
    /**
     * Holds the single container that defines the unit of execution for this Revision.
     * 
     */
    private final List<GoogleCloudRunOpV2ContainerResponse> containers;
    /**
     * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    private final String encryptionKey;
    /**
     * The sandbox environment to host this Revision.
     * 
     */
    private final String executionEnvironment;
    /**
     * KRM-style labels for the resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    private final String revision;
    /**
     * Scaling settings for this Revision.
     * 
     */
    private final GoogleCloudRunOpV2RevisionScalingResponse scaling;
    /**
     * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
     * 
     */
    private final String serviceAccount;
    /**
     * Max allowed time for an instance to respond to a request.
     * 
     */
    private final String timeout;
    /**
     * A list of Volumes to make available to containers.
     * 
     */
    private final List<GoogleCloudRunOpV2VolumeResponse> volumes;
    /**
     * VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    private final GoogleCloudRunOpV2VpcAccessResponse vpcAccess;

    @CustomType.Constructor
    private GoogleCloudRunOpV2RevisionTemplateResponse(
        @CustomType.Parameter("annotations") Map<String,String> annotations,
        @CustomType.Parameter("confidential") Boolean confidential,
        @CustomType.Parameter("containerConcurrency") Integer containerConcurrency,
        @CustomType.Parameter("containers") List<GoogleCloudRunOpV2ContainerResponse> containers,
        @CustomType.Parameter("encryptionKey") String encryptionKey,
        @CustomType.Parameter("executionEnvironment") String executionEnvironment,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("revision") String revision,
        @CustomType.Parameter("scaling") GoogleCloudRunOpV2RevisionScalingResponse scaling,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("timeout") String timeout,
        @CustomType.Parameter("volumes") List<GoogleCloudRunOpV2VolumeResponse> volumes,
        @CustomType.Parameter("vpcAccess") GoogleCloudRunOpV2VpcAccessResponse vpcAccess) {
        this.annotations = annotations;
        this.confidential = confidential;
        this.containerConcurrency = containerConcurrency;
        this.containers = containers;
        this.encryptionKey = encryptionKey;
        this.executionEnvironment = executionEnvironment;
        this.labels = labels;
        this.revision = revision;
        this.scaling = scaling;
        this.serviceAccount = serviceAccount;
        this.timeout = timeout;
        this.volumes = volumes;
        this.vpcAccess = vpcAccess;
    }

    /**
     * KRM-style annotations for the resource.
     * 
    */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * Enables Confidential Cloud Run in Revisions created using this template.
     * 
    */
    public Boolean confidential() {
        return this.confidential;
    }
    /**
     * Sets the maximum number of requests that each serving instance can receive.
     * 
    */
    public Integer containerConcurrency() {
        return this.containerConcurrency;
    }
    /**
     * Holds the single container that defines the unit of execution for this Revision.
     * 
    */
    public List<GoogleCloudRunOpV2ContainerResponse> containers() {
        return this.containers;
    }
    /**
     * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
    */
    public String encryptionKey() {
        return this.encryptionKey;
    }
    /**
     * The sandbox environment to host this Revision.
     * 
    */
    public String executionEnvironment() {
        return this.executionEnvironment;
    }
    /**
     * KRM-style labels for the resource.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
    */
    public String revision() {
        return this.revision;
    }
    /**
     * Scaling settings for this Revision.
     * 
    */
    public GoogleCloudRunOpV2RevisionScalingResponse scaling() {
        return this.scaling;
    }
    /**
     * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
     * 
    */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * Max allowed time for an instance to respond to a request.
     * 
    */
    public String timeout() {
        return this.timeout;
    }
    /**
     * A list of Volumes to make available to containers.
     * 
    */
    public List<GoogleCloudRunOpV2VolumeResponse> volumes() {
        return this.volumes;
    }
    /**
     * VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
    */
    public GoogleCloudRunOpV2VpcAccessResponse vpcAccess() {
        return this.vpcAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2RevisionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private Boolean confidential;
        private Integer containerConcurrency;
        private List<GoogleCloudRunOpV2ContainerResponse> containers;
        private String encryptionKey;
        private String executionEnvironment;
        private Map<String,String> labels;
        private String revision;
        private GoogleCloudRunOpV2RevisionScalingResponse scaling;
        private String serviceAccount;
        private String timeout;
        private List<GoogleCloudRunOpV2VolumeResponse> volumes;
        private GoogleCloudRunOpV2VpcAccessResponse vpcAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2RevisionTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.confidential = defaults.confidential;
    	      this.containerConcurrency = defaults.containerConcurrency;
    	      this.containers = defaults.containers;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.executionEnvironment = defaults.executionEnvironment;
    	      this.labels = defaults.labels;
    	      this.revision = defaults.revision;
    	      this.scaling = defaults.scaling;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.timeout = defaults.timeout;
    	      this.volumes = defaults.volumes;
    	      this.vpcAccess = defaults.vpcAccess;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder confidential(Boolean confidential) {
            this.confidential = Objects.requireNonNull(confidential);
            return this;
        }
        public Builder containerConcurrency(Integer containerConcurrency) {
            this.containerConcurrency = Objects.requireNonNull(containerConcurrency);
            return this;
        }
        public Builder containers(List<GoogleCloudRunOpV2ContainerResponse> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }
        public Builder containers(GoogleCloudRunOpV2ContainerResponse... containers) {
            return containers(List.of(containers));
        }
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }
        public Builder executionEnvironment(String executionEnvironment) {
            this.executionEnvironment = Objects.requireNonNull(executionEnvironment);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder revision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder scaling(GoogleCloudRunOpV2RevisionScalingResponse scaling) {
            this.scaling = Objects.requireNonNull(scaling);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder volumes(List<GoogleCloudRunOpV2VolumeResponse> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }
        public Builder volumes(GoogleCloudRunOpV2VolumeResponse... volumes) {
            return volumes(List.of(volumes));
        }
        public Builder vpcAccess(GoogleCloudRunOpV2VpcAccessResponse vpcAccess) {
            this.vpcAccess = Objects.requireNonNull(vpcAccess);
            return this;
        }        public GoogleCloudRunOpV2RevisionTemplateResponse build() {
            return new GoogleCloudRunOpV2RevisionTemplateResponse(annotations, confidential, containerConcurrency, containers, encryptionKey, executionEnvironment, labels, revision, scaling, serviceAccount, timeout, volumes, vpcAccess);
        }
    }
}
