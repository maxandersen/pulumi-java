// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1.outputs.ContainerResponse;
import com.pulumi.googlenative.run_v1.outputs.LocalObjectReferenceResponse;
import com.pulumi.googlenative.run_v1.outputs.VolumeResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RevisionSpecResponse {
    /**
     * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per container instance of the Revision. Cloud Run fully managed: supported, defaults to 80 Cloud Run for Anthos: supported, defaults to 0, which means concurrency to the application is not limited, and the system decides the target concurrency for the autoscaler.
     * 
     */
    private final Integer containerConcurrency;
    /**
     * Containers holds the single container that defines the unit of execution for this Revision. In the context of a Revision, we disallow a number of fields on this Container, including: name and lifecycle. In Cloud Run, only a single container may be provided. The runtime contract is documented here: https://github.com/knative/serving/blob/main/docs/runtime-contract.md
     * 
     */
    private final List<ContainerResponse> containers;
    /**
     * Indicates whether information about services should be injected into pod&#39;s environment variables, matching the syntax of Docker links. Cloud Run fully managed: Not supported. Cloud Run for Anthos: supported, defaults to true.
     * 
     */
    private final Boolean enableServiceLinks;
    /**
     * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod Cloud Run fully managed: Not supported. Cloud Run for Anthos: supported.
     * 
     */
    private final List<LocalObjectReferenceResponse> imagePullSecrets;
    /**
     * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
     * 
     */
    private final String serviceAccountName;
    /**
     * TimeoutSeconds holds the max duration the instance is allowed for responding to a request. Cloud Run fully managed: defaults to 300 seconds (5 minutes). Maximum allowed value is 3600 seconds (1 hour). Cloud Run for Anthos: defaults to 300 seconds (5 minutes). Maximum allowed value is configurable by the cluster operator.
     * 
     */
    private final Integer timeoutSeconds;
    private final List<VolumeResponse> volumes;

    @CustomType.Constructor
    private RevisionSpecResponse(
        @CustomType.Parameter("containerConcurrency") Integer containerConcurrency,
        @CustomType.Parameter("containers") List<ContainerResponse> containers,
        @CustomType.Parameter("enableServiceLinks") Boolean enableServiceLinks,
        @CustomType.Parameter("imagePullSecrets") List<LocalObjectReferenceResponse> imagePullSecrets,
        @CustomType.Parameter("serviceAccountName") String serviceAccountName,
        @CustomType.Parameter("timeoutSeconds") Integer timeoutSeconds,
        @CustomType.Parameter("volumes") List<VolumeResponse> volumes) {
        this.containerConcurrency = containerConcurrency;
        this.containers = containers;
        this.enableServiceLinks = enableServiceLinks;
        this.imagePullSecrets = imagePullSecrets;
        this.serviceAccountName = serviceAccountName;
        this.timeoutSeconds = timeoutSeconds;
        this.volumes = volumes;
    }

    /**
     * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per container instance of the Revision. Cloud Run fully managed: supported, defaults to 80 Cloud Run for Anthos: supported, defaults to 0, which means concurrency to the application is not limited, and the system decides the target concurrency for the autoscaler.
     * 
    */
    public Integer containerConcurrency() {
        return this.containerConcurrency;
    }
    /**
     * Containers holds the single container that defines the unit of execution for this Revision. In the context of a Revision, we disallow a number of fields on this Container, including: name and lifecycle. In Cloud Run, only a single container may be provided. The runtime contract is documented here: https://github.com/knative/serving/blob/main/docs/runtime-contract.md
     * 
    */
    public List<ContainerResponse> containers() {
        return this.containers;
    }
    /**
     * Indicates whether information about services should be injected into pod&#39;s environment variables, matching the syntax of Docker links. Cloud Run fully managed: Not supported. Cloud Run for Anthos: supported, defaults to true.
     * 
    */
    public Boolean enableServiceLinks() {
        return this.enableServiceLinks;
    }
    /**
     * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod Cloud Run fully managed: Not supported. Cloud Run for Anthos: supported.
     * 
    */
    public List<LocalObjectReferenceResponse> imagePullSecrets() {
        return this.imagePullSecrets;
    }
    /**
     * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
     * 
    */
    public String serviceAccountName() {
        return this.serviceAccountName;
    }
    /**
     * TimeoutSeconds holds the max duration the instance is allowed for responding to a request. Cloud Run fully managed: defaults to 300 seconds (5 minutes). Maximum allowed value is 3600 seconds (1 hour). Cloud Run for Anthos: defaults to 300 seconds (5 minutes). Maximum allowed value is configurable by the cluster operator.
     * 
    */
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }
    public List<VolumeResponse> volumes() {
        return this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RevisionSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerConcurrency;
        private List<ContainerResponse> containers;
        private Boolean enableServiceLinks;
        private List<LocalObjectReferenceResponse> imagePullSecrets;
        private String serviceAccountName;
        private Integer timeoutSeconds;
        private List<VolumeResponse> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(RevisionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerConcurrency = defaults.containerConcurrency;
    	      this.containers = defaults.containers;
    	      this.enableServiceLinks = defaults.enableServiceLinks;
    	      this.imagePullSecrets = defaults.imagePullSecrets;
    	      this.serviceAccountName = defaults.serviceAccountName;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.volumes = defaults.volumes;
        }

        public Builder containerConcurrency(Integer containerConcurrency) {
            this.containerConcurrency = Objects.requireNonNull(containerConcurrency);
            return this;
        }
        public Builder containers(List<ContainerResponse> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }
        public Builder containers(ContainerResponse... containers) {
            return containers(List.of(containers));
        }
        public Builder enableServiceLinks(Boolean enableServiceLinks) {
            this.enableServiceLinks = Objects.requireNonNull(enableServiceLinks);
            return this;
        }
        public Builder imagePullSecrets(List<LocalObjectReferenceResponse> imagePullSecrets) {
            this.imagePullSecrets = Objects.requireNonNull(imagePullSecrets);
            return this;
        }
        public Builder imagePullSecrets(LocalObjectReferenceResponse... imagePullSecrets) {
            return imagePullSecrets(List.of(imagePullSecrets));
        }
        public Builder serviceAccountName(String serviceAccountName) {
            this.serviceAccountName = Objects.requireNonNull(serviceAccountName);
            return this;
        }
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = Objects.requireNonNull(timeoutSeconds);
            return this;
        }
        public Builder volumes(List<VolumeResponse> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }
        public Builder volumes(VolumeResponse... volumes) {
            return volumes(List.of(volumes));
        }        public RevisionSpecResponse build() {
            return new RevisionSpecResponse(containerConcurrency, containers, enableServiceLinks, imagePullSecrets, serviceAccountName, timeoutSeconds, volumes);
        }
    }
}
