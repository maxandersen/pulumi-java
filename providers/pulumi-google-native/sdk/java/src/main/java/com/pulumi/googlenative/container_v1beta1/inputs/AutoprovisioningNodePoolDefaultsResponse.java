// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.NodeManagementResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.ShieldedInstanceConfigResponse;
import com.pulumi.googlenative.container_v1beta1.inputs.UpgradeSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
 * 
 */
public final class AutoprovisioningNodePoolDefaultsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoprovisioningNodePoolDefaultsResponse Empty = new AutoprovisioningNodePoolDefaultsResponse();

    /**
     *  The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
     */
    @Import(name="bootDiskKmsKey", required=true)
      private final String bootDiskKmsKey;

    public String bootDiskKmsKey() {
        return this.bootDiskKmsKey;
    }

    /**
     * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB.
     * 
     */
    @Import(name="diskSizeGb", required=true)
      private final Integer diskSizeGb;

    public Integer diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Type of the disk attached to each node (e.g. &#39;pd-standard&#39;, &#39;pd-ssd&#39; or &#39;pd-balanced&#39;) If unspecified, the default disk type is &#39;pd-standard&#39;
     * 
     */
    @Import(name="diskType", required=true)
      private final String diskType;

    public String diskType() {
        return this.diskType;
    }

    /**
     * The image type to use for NAP created node.
     * 
     */
    @Import(name="imageType", required=true)
      private final String imageType;

    public String imageType() {
        return this.imageType;
    }

    /**
     * NodeManagement configuration for this NodePool.
     * 
     */
    @Import(name="management", required=true)
      private final NodeManagementResponse management;

    public NodeManagementResponse management() {
        return this.management;
    }

    /**
     * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as `minCpuPlatform: &#34;Intel Haswell&#34;` or `minCpuPlatform: &#34;Intel Sandy Bridge&#34;`. For more information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform) To unset the min cpu platform field pass &#34;automatic&#34; as field value.
     * 
     */
    @Import(name="minCpuPlatform", required=true)
      private final String minCpuPlatform;

    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }

    /**
     * The set of Google API scopes to be made available on all of the node VMs under the &#34;default&#34; service account. The following scopes are recommended, but not required, and by default are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in which case their required scopes will be added.
     * 
     */
    @Import(name="oauthScopes", required=true)
      private final List<String> oauthScopes;

    public List<String> oauthScopes() {
        return this.oauthScopes;
    }

    /**
     * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the &#34;default&#34; service account is used.
     * 
     */
    @Import(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * Shielded Instance options.
     * 
     */
    @Import(name="shieldedInstanceConfig", required=true)
      private final ShieldedInstanceConfigResponse shieldedInstanceConfig;

    public ShieldedInstanceConfigResponse shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }

    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    @Import(name="upgradeSettings", required=true)
      private final UpgradeSettingsResponse upgradeSettings;

    public UpgradeSettingsResponse upgradeSettings() {
        return this.upgradeSettings;
    }

    public AutoprovisioningNodePoolDefaultsResponse(
        String bootDiskKmsKey,
        Integer diskSizeGb,
        String diskType,
        String imageType,
        NodeManagementResponse management,
        String minCpuPlatform,
        List<String> oauthScopes,
        String serviceAccount,
        ShieldedInstanceConfigResponse shieldedInstanceConfig,
        UpgradeSettingsResponse upgradeSettings) {
        this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey, "expected parameter 'bootDiskKmsKey' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.imageType = Objects.requireNonNull(imageType, "expected parameter 'imageType' to be non-null");
        this.management = Objects.requireNonNull(management, "expected parameter 'management' to be non-null");
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
        this.oauthScopes = Objects.requireNonNull(oauthScopes, "expected parameter 'oauthScopes' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig, "expected parameter 'shieldedInstanceConfig' to be non-null");
        this.upgradeSettings = Objects.requireNonNull(upgradeSettings, "expected parameter 'upgradeSettings' to be non-null");
    }

    private AutoprovisioningNodePoolDefaultsResponse() {
        this.bootDiskKmsKey = null;
        this.diskSizeGb = null;
        this.diskType = null;
        this.imageType = null;
        this.management = null;
        this.minCpuPlatform = null;
        this.oauthScopes = List.of();
        this.serviceAccount = null;
        this.shieldedInstanceConfig = null;
        this.upgradeSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoprovisioningNodePoolDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootDiskKmsKey;
        private Integer diskSizeGb;
        private String diskType;
        private String imageType;
        private NodeManagementResponse management;
        private String minCpuPlatform;
        private List<String> oauthScopes;
        private String serviceAccount;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private UpgradeSettingsResponse upgradeSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoprovisioningNodePoolDefaultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.imageType = defaults.imageType;
    	      this.management = defaults.management;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.upgradeSettings = defaults.upgradeSettings;
        }

        public Builder bootDiskKmsKey(String bootDiskKmsKey) {
            this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey);
            return this;
        }
        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder imageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }
        public Builder management(NodeManagementResponse management) {
            this.management = Objects.requireNonNull(management);
            return this;
        }
        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }
        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder shieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }
        public Builder upgradeSettings(UpgradeSettingsResponse upgradeSettings) {
            this.upgradeSettings = Objects.requireNonNull(upgradeSettings);
            return this;
        }        public AutoprovisioningNodePoolDefaultsResponse build() {
            return new AutoprovisioningNodePoolDefaultsResponse(bootDiskKmsKey, diskSizeGb, diskType, imageType, management, minCpuPlatform, oauthScopes, serviceAccount, shieldedInstanceConfig, upgradeSettings);
        }
    }
}
