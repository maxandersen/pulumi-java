// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.assuredworkloads.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.assuredworkloads.inputs.WorkloadKmsSettingsGetArgs;
import com.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceGetArgs;
import com.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceSettingGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadState extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadState Empty = new WorkloadState();

    /**
     * Required. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, &#39;billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    @Import(name="billingAccount")
    private @Nullable Output<String> billingAccount;

    public Optional<Output<String>> billingAccount() {
        return Optional.ofNullable(this.billingAccount);
    }

    /**
     * Required. Immutable. Compliance Regime associated with this workload. Possible values: COMPLIANCE_REGIME_UNSPECIFIED, IL4, CJIS, FEDRAMP_HIGH, FEDRAMP_MODERATE, US_REGIONAL_ACCESS
     * 
     */
    @Import(name="complianceRegime")
    private @Nullable Output<String> complianceRegime;

    public Optional<Output<String>> complianceRegime() {
        return Optional.ofNullable(this.complianceRegime);
    }

    /**
     * Output only. Immutable. The Workload creation timestamp.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     * 
     */
    @Import(name="kmsSettings")
    private @Nullable Output<WorkloadKmsSettingsGetArgs> kmsSettings;

    public Optional<Output<WorkloadKmsSettingsGetArgs>> kmsSettings() {
        return Optional.ofNullable(this.kmsSettings);
    }

    /**
     * Optional. Labels applied to the workload.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Output only. The resource name of the workload.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The organization for the resource
     * 
     */
    @Import(name="organization")
    private @Nullable Output<String> organization;

    public Optional<Output<String>> organization() {
        return Optional.ofNullable(this.organization);
    }

    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either an organization or a folder. Must be the same or a child of the Workload parent. If not specified all resources are created under the Workload parent. Formats: folders/{folder_id}, organizations/{organization_id}
     * 
     */
    @Import(name="provisionedResourcesParent")
    private @Nullable Output<String> provisionedResourcesParent;

    public Optional<Output<String>> provisionedResourcesParent() {
        return Optional.ofNullable(this.provisionedResourcesParent);
    }

    /**
     * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    @Import(name="resourceSettings")
    private @Nullable Output<List<WorkloadResourceSettingGetArgs>> resourceSettings;

    public Optional<Output<List<WorkloadResourceSettingGetArgs>>> resourceSettings() {
        return Optional.ofNullable(this.resourceSettings);
    }

    /**
     * Output only. The resources associated with this workload. These resources will be created when creating the workload. If
     * any of the projects already exist, the workload creation will fail. Always read only.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<WorkloadResourceGetArgs>> resources;

    public Optional<Output<List<WorkloadResourceGetArgs>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    private WorkloadState() {}

    private WorkloadState(WorkloadState $) {
        this.billingAccount = $.billingAccount;
        this.complianceRegime = $.complianceRegime;
        this.createTime = $.createTime;
        this.displayName = $.displayName;
        this.kmsSettings = $.kmsSettings;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.organization = $.organization;
        this.provisionedResourcesParent = $.provisionedResourcesParent;
        this.resourceSettings = $.resourceSettings;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadState $;

        public Builder() {
            $ = new WorkloadState();
        }

        public Builder(WorkloadState defaults) {
            $ = new WorkloadState(Objects.requireNonNull(defaults));
        }

        public Builder billingAccount(@Nullable Output<String> billingAccount) {
            $.billingAccount = billingAccount;
            return this;
        }

        public Builder billingAccount(String billingAccount) {
            return billingAccount(Output.of(billingAccount));
        }

        public Builder complianceRegime(@Nullable Output<String> complianceRegime) {
            $.complianceRegime = complianceRegime;
            return this;
        }

        public Builder complianceRegime(String complianceRegime) {
            return complianceRegime(Output.of(complianceRegime));
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder kmsSettings(@Nullable Output<WorkloadKmsSettingsGetArgs> kmsSettings) {
            $.kmsSettings = kmsSettings;
            return this;
        }

        public Builder kmsSettings(WorkloadKmsSettingsGetArgs kmsSettings) {
            return kmsSettings(Output.of(kmsSettings));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder organization(@Nullable Output<String> organization) {
            $.organization = organization;
            return this;
        }

        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        public Builder provisionedResourcesParent(@Nullable Output<String> provisionedResourcesParent) {
            $.provisionedResourcesParent = provisionedResourcesParent;
            return this;
        }

        public Builder provisionedResourcesParent(String provisionedResourcesParent) {
            return provisionedResourcesParent(Output.of(provisionedResourcesParent));
        }

        public Builder resourceSettings(@Nullable Output<List<WorkloadResourceSettingGetArgs>> resourceSettings) {
            $.resourceSettings = resourceSettings;
            return this;
        }

        public Builder resourceSettings(List<WorkloadResourceSettingGetArgs> resourceSettings) {
            return resourceSettings(Output.of(resourceSettings));
        }

        public Builder resourceSettings(WorkloadResourceSettingGetArgs... resourceSettings) {
            return resourceSettings(List.of(resourceSettings));
        }

        public Builder resources(@Nullable Output<List<WorkloadResourceGetArgs>> resources) {
            $.resources = resources;
            return this;
        }

        public Builder resources(List<WorkloadResourceGetArgs> resources) {
            return resources(Output.of(resources));
        }

        public Builder resources(WorkloadResourceGetArgs... resources) {
            return resources(List.of(resources));
        }

        public WorkloadState build() {
            return $;
        }
    }

}
