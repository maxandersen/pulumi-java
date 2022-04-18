// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2ContainerResponse;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2RevisionScalingResponse;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2VolumeResponse;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2VpcAccessResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * RevisionTemplate describes the data a revision should have when created from a template.
 * 
 */
public final class GoogleCloudRunOpV2RevisionTemplateResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2RevisionTemplateResponse Empty = new GoogleCloudRunOpV2RevisionTemplateResponse();

    /**
     * KRM-style annotations for the resource.
     * 
     */
    @Import(name="annotations", required=true)
      private final Map<String,String> annotations;

    public Map<String,String> annotations() {
        return this.annotations;
    }

    /**
     * Enables Confidential Cloud Run in Revisions created using this template.
     * 
     */
    @Import(name="confidential", required=true)
      private final Boolean confidential;

    public Boolean confidential() {
        return this.confidential;
    }

    /**
     * Sets the maximum number of requests that each serving instance can receive.
     * 
     */
    @Import(name="containerConcurrency", required=true)
      private final Integer containerConcurrency;

    public Integer containerConcurrency() {
        return this.containerConcurrency;
    }

    /**
     * Holds the single container that defines the unit of execution for this Revision.
     * 
     */
    @Import(name="containers", required=true)
      private final List<GoogleCloudRunOpV2ContainerResponse> containers;

    public List<GoogleCloudRunOpV2ContainerResponse> containers() {
        return this.containers;
    }

    /**
     * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    @Import(name="encryptionKey", required=true)
      private final String encryptionKey;

    public String encryptionKey() {
        return this.encryptionKey;
    }

    /**
     * The sandbox environment to host this Revision.
     * 
     */
    @Import(name="executionEnvironment", required=true)
      private final String executionEnvironment;

    public String executionEnvironment() {
        return this.executionEnvironment;
    }

    /**
     * KRM-style labels for the resource.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    @Import(name="revision", required=true)
      private final String revision;

    public String revision() {
        return this.revision;
    }

    /**
     * Scaling settings for this Revision.
     * 
     */
    @Import(name="scaling", required=true)
      private final GoogleCloudRunOpV2RevisionScalingResponse scaling;

    public GoogleCloudRunOpV2RevisionScalingResponse scaling() {
        return this.scaling;
    }

    /**
     * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
     * 
     */
    @Import(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * Max allowed time for an instance to respond to a request.
     * 
     */
    @Import(name="timeout", required=true)
      private final String timeout;

    public String timeout() {
        return this.timeout;
    }

    /**
     * A list of Volumes to make available to containers.
     * 
     */
    @Import(name="volumes", required=true)
      private final List<GoogleCloudRunOpV2VolumeResponse> volumes;

    public List<GoogleCloudRunOpV2VolumeResponse> volumes() {
        return this.volumes;
    }

    /**
     * VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    @Import(name="vpcAccess", required=true)
      private final GoogleCloudRunOpV2VpcAccessResponse vpcAccess;

    public GoogleCloudRunOpV2VpcAccessResponse vpcAccess() {
        return this.vpcAccess;
    }

    public GoogleCloudRunOpV2RevisionTemplateResponse(
        Map<String,String> annotations,
        Boolean confidential,
        Integer containerConcurrency,
        List<GoogleCloudRunOpV2ContainerResponse> containers,
        String encryptionKey,
        String executionEnvironment,
        Map<String,String> labels,
        String revision,
        GoogleCloudRunOpV2RevisionScalingResponse scaling,
        String serviceAccount,
        String timeout,
        List<GoogleCloudRunOpV2VolumeResponse> volumes,
        GoogleCloudRunOpV2VpcAccessResponse vpcAccess) {
        this.annotations = Objects.requireNonNull(annotations, "expected parameter 'annotations' to be non-null");
        this.confidential = Objects.requireNonNull(confidential, "expected parameter 'confidential' to be non-null");
        this.containerConcurrency = Objects.requireNonNull(containerConcurrency, "expected parameter 'containerConcurrency' to be non-null");
        this.containers = Objects.requireNonNull(containers, "expected parameter 'containers' to be non-null");
        this.encryptionKey = Objects.requireNonNull(encryptionKey, "expected parameter 'encryptionKey' to be non-null");
        this.executionEnvironment = Objects.requireNonNull(executionEnvironment, "expected parameter 'executionEnvironment' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.revision = Objects.requireNonNull(revision, "expected parameter 'revision' to be non-null");
        this.scaling = Objects.requireNonNull(scaling, "expected parameter 'scaling' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.timeout = Objects.requireNonNull(timeout, "expected parameter 'timeout' to be non-null");
        this.volumes = Objects.requireNonNull(volumes, "expected parameter 'volumes' to be non-null");
        this.vpcAccess = Objects.requireNonNull(vpcAccess, "expected parameter 'vpcAccess' to be non-null");
    }

    private GoogleCloudRunOpV2RevisionTemplateResponse() {
        this.annotations = Map.of();
        this.confidential = null;
        this.containerConcurrency = null;
        this.containers = List.of();
        this.encryptionKey = null;
        this.executionEnvironment = null;
        this.labels = Map.of();
        this.revision = null;
        this.scaling = null;
        this.serviceAccount = null;
        this.timeout = null;
        this.volumes = List.of();
        this.vpcAccess = null;
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
