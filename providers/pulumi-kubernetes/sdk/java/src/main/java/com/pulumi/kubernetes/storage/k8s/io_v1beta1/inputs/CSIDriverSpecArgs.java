// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs.TokenRequestArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CSIDriverSpec is the specification of a CSIDriver.
 * 
 */
public final class CSIDriverSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final CSIDriverSpecArgs Empty = new CSIDriverSpecArgs();

    /**
     * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
     * 
     */
    @Import(name="attachRequired")
      private final @Nullable Output<Boolean> attachRequired;

    public Output<Boolean> attachRequired() {
        return this.attachRequired == null ? Codegen.empty() : this.attachRequired;
    }

    /**
     * Defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details. This field is alpha-level, and is only honored by servers that enable the CSIVolumeFSGroupPolicy feature gate.
     * 
     */
    @Import(name="fsGroupPolicy")
      private final @Nullable Output<String> fsGroupPolicy;

    public Output<String> fsGroupPolicy() {
        return this.fsGroupPolicy == null ? Codegen.empty() : this.fsGroupPolicy;
    }

    /**
     * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" iff the volume is an ephemeral inline volume
     *                                 defined by a CSIVolumeSource, otherwise "false"
     * 
     * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
     * 
     */
    @Import(name="podInfoOnMount")
      private final @Nullable Output<Boolean> podInfoOnMount;

    public Output<Boolean> podInfoOnMount() {
        return this.podInfoOnMount == null ? Codegen.empty() : this.podInfoOnMount;
    }

    /**
     * RequiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.
     * 
     * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
     * 
     * This is an alpha feature and only available when the CSIServiceAccountToken feature is enabled.
     * 
     */
    @Import(name="requiresRepublish")
      private final @Nullable Output<Boolean> requiresRepublish;

    public Output<Boolean> requiresRepublish() {
        return this.requiresRepublish == null ? Codegen.empty() : this.requiresRepublish;
    }

    /**
     * If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.
     * 
     * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
     * 
     * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
     * 
     * This is an alpha field and only available when the CSIStorageCapacity feature is enabled. The default is false.
     * 
     */
    @Import(name="storageCapacity")
      private final @Nullable Output<Boolean> storageCapacity;

    public Output<Boolean> storageCapacity() {
        return this.storageCapacity == null ? Codegen.empty() : this.storageCapacity;
    }

    /**
     * TokenRequests indicates the CSI driver needs pods' service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "<audience>": {
     *     "token": <token>,
     *     "expirationTimestamp": <expiration timestamp in RFC3339>,
     *   },
     *   ...
     * }
     * 
     * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * 
     * This is an alpha feature and only available when the CSIServiceAccountToken feature is enabled.
     * 
     */
    @Import(name="tokenRequests")
      private final @Nullable Output<List<TokenRequestArgs>> tokenRequests;

    public Output<List<TokenRequestArgs>> tokenRequests() {
        return this.tokenRequests == null ? Codegen.empty() : this.tokenRequests;
    }

    /**
     * VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is "Persistent", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
     * 
     */
    @Import(name="volumeLifecycleModes")
      private final @Nullable Output<List<String>> volumeLifecycleModes;

    public Output<List<String>> volumeLifecycleModes() {
        return this.volumeLifecycleModes == null ? Codegen.empty() : this.volumeLifecycleModes;
    }

    public CSIDriverSpecArgs(
        @Nullable Output<Boolean> attachRequired,
        @Nullable Output<String> fsGroupPolicy,
        @Nullable Output<Boolean> podInfoOnMount,
        @Nullable Output<Boolean> requiresRepublish,
        @Nullable Output<Boolean> storageCapacity,
        @Nullable Output<List<TokenRequestArgs>> tokenRequests,
        @Nullable Output<List<String>> volumeLifecycleModes) {
        this.attachRequired = attachRequired;
        this.fsGroupPolicy = fsGroupPolicy;
        this.podInfoOnMount = podInfoOnMount;
        this.requiresRepublish = requiresRepublish;
        this.storageCapacity = storageCapacity;
        this.tokenRequests = tokenRequests;
        this.volumeLifecycleModes = volumeLifecycleModes;
    }

    private CSIDriverSpecArgs() {
        this.attachRequired = Codegen.empty();
        this.fsGroupPolicy = Codegen.empty();
        this.podInfoOnMount = Codegen.empty();
        this.requiresRepublish = Codegen.empty();
        this.storageCapacity = Codegen.empty();
        this.tokenRequests = Codegen.empty();
        this.volumeLifecycleModes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIDriverSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> attachRequired;
        private @Nullable Output<String> fsGroupPolicy;
        private @Nullable Output<Boolean> podInfoOnMount;
        private @Nullable Output<Boolean> requiresRepublish;
        private @Nullable Output<Boolean> storageCapacity;
        private @Nullable Output<List<TokenRequestArgs>> tokenRequests;
        private @Nullable Output<List<String>> volumeLifecycleModes;

        public Builder() {
    	      // Empty
        }

        public Builder(CSIDriverSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachRequired = defaults.attachRequired;
    	      this.fsGroupPolicy = defaults.fsGroupPolicy;
    	      this.podInfoOnMount = defaults.podInfoOnMount;
    	      this.requiresRepublish = defaults.requiresRepublish;
    	      this.storageCapacity = defaults.storageCapacity;
    	      this.tokenRequests = defaults.tokenRequests;
    	      this.volumeLifecycleModes = defaults.volumeLifecycleModes;
        }

        public Builder attachRequired(@Nullable Output<Boolean> attachRequired) {
            this.attachRequired = attachRequired;
            return this;
        }
        public Builder attachRequired(@Nullable Boolean attachRequired) {
            this.attachRequired = Codegen.ofNullable(attachRequired);
            return this;
        }
        public Builder fsGroupPolicy(@Nullable Output<String> fsGroupPolicy) {
            this.fsGroupPolicy = fsGroupPolicy;
            return this;
        }
        public Builder fsGroupPolicy(@Nullable String fsGroupPolicy) {
            this.fsGroupPolicy = Codegen.ofNullable(fsGroupPolicy);
            return this;
        }
        public Builder podInfoOnMount(@Nullable Output<Boolean> podInfoOnMount) {
            this.podInfoOnMount = podInfoOnMount;
            return this;
        }
        public Builder podInfoOnMount(@Nullable Boolean podInfoOnMount) {
            this.podInfoOnMount = Codegen.ofNullable(podInfoOnMount);
            return this;
        }
        public Builder requiresRepublish(@Nullable Output<Boolean> requiresRepublish) {
            this.requiresRepublish = requiresRepublish;
            return this;
        }
        public Builder requiresRepublish(@Nullable Boolean requiresRepublish) {
            this.requiresRepublish = Codegen.ofNullable(requiresRepublish);
            return this;
        }
        public Builder storageCapacity(@Nullable Output<Boolean> storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }
        public Builder storageCapacity(@Nullable Boolean storageCapacity) {
            this.storageCapacity = Codegen.ofNullable(storageCapacity);
            return this;
        }
        public Builder tokenRequests(@Nullable Output<List<TokenRequestArgs>> tokenRequests) {
            this.tokenRequests = tokenRequests;
            return this;
        }
        public Builder tokenRequests(@Nullable List<TokenRequestArgs> tokenRequests) {
            this.tokenRequests = Codegen.ofNullable(tokenRequests);
            return this;
        }
        public Builder tokenRequests(TokenRequestArgs... tokenRequests) {
            return tokenRequests(List.of(tokenRequests));
        }
        public Builder volumeLifecycleModes(@Nullable Output<List<String>> volumeLifecycleModes) {
            this.volumeLifecycleModes = volumeLifecycleModes;
            return this;
        }
        public Builder volumeLifecycleModes(@Nullable List<String> volumeLifecycleModes) {
            this.volumeLifecycleModes = Codegen.ofNullable(volumeLifecycleModes);
            return this;
        }
        public Builder volumeLifecycleModes(String... volumeLifecycleModes) {
            return volumeLifecycleModes(List.of(volumeLifecycleModes));
        }        public CSIDriverSpecArgs build() {
            return new CSIDriverSpecArgs(attachRequired, fsGroupPolicy, podInfoOnMount, requiresRepublish, storageCapacity, tokenRequests, volumeLifecycleModes);
        }
    }
}
