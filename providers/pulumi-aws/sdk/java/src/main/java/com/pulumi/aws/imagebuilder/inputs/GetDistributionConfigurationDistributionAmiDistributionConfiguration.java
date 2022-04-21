// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetDistributionConfigurationDistributionAmiDistributionConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetDistributionConfigurationDistributionAmiDistributionConfiguration Empty = new GetDistributionConfigurationDistributionAmiDistributionConfiguration();

    /**
     * Key-value map of tags to apply to distributed AMI.
     * 
     */
    @Import(name="amiTags", required=true)
    private Map<String,String> amiTags;

    public Map<String,String> amiTags() {
        return this.amiTags;
    }

    /**
     * Description to apply to distributed AMI.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * Amazon Resource Name (ARN) of Key Management Service (KMS) Key to encrypt AMI.
     * 
     */
    @Import(name="kmsKeyId", required=true)
    private String kmsKeyId;

    public String kmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * Nested list of EC2 launch permissions.
     * 
     */
    @Import(name="launchPermissions", required=true)
    private List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions;

    public List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions() {
        return this.launchPermissions;
    }

    /**
     * Name of the distribution configuration.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Set of target AWS Account identifiers.
     * 
     */
    @Import(name="targetAccountIds", required=true)
    private List<String> targetAccountIds;

    public List<String> targetAccountIds() {
        return this.targetAccountIds;
    }

    private GetDistributionConfigurationDistributionAmiDistributionConfiguration() {}

    private GetDistributionConfigurationDistributionAmiDistributionConfiguration(GetDistributionConfigurationDistributionAmiDistributionConfiguration $) {
        this.amiTags = $.amiTags;
        this.description = $.description;
        this.kmsKeyId = $.kmsKeyId;
        this.launchPermissions = $.launchPermissions;
        this.name = $.name;
        this.targetAccountIds = $.targetAccountIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDistributionConfigurationDistributionAmiDistributionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDistributionConfigurationDistributionAmiDistributionConfiguration $;

        public Builder() {
            $ = new GetDistributionConfigurationDistributionAmiDistributionConfiguration();
        }

        public Builder(GetDistributionConfigurationDistributionAmiDistributionConfiguration defaults) {
            $ = new GetDistributionConfigurationDistributionAmiDistributionConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder amiTags(Map<String,String> amiTags) {
            $.amiTags = amiTags;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder launchPermissions(List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions) {
            $.launchPermissions = launchPermissions;
            return this;
        }

        public Builder launchPermissions(GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission... launchPermissions) {
            return launchPermissions(List.of(launchPermissions));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder targetAccountIds(List<String> targetAccountIds) {
            $.targetAccountIds = targetAccountIds;
            return this;
        }

        public Builder targetAccountIds(String... targetAccountIds) {
            return targetAccountIds(List.of(targetAccountIds));
        }

        public GetDistributionConfigurationDistributionAmiDistributionConfiguration build() {
            $.amiTags = Objects.requireNonNull($.amiTags, "expected parameter 'amiTags' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.kmsKeyId = Objects.requireNonNull($.kmsKeyId, "expected parameter 'kmsKeyId' to be non-null");
            $.launchPermissions = Objects.requireNonNull($.launchPermissions, "expected parameter 'launchPermissions' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.targetAccountIds = Objects.requireNonNull($.targetAccountIds, "expected parameter 'targetAccountIds' to be non-null");
            return $;
        }
    }

}
