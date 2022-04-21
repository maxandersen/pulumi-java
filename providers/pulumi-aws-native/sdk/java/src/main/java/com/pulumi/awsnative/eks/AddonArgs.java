// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks;

import com.pulumi.awsnative.eks.enums.AddonResolveConflicts;
import com.pulumi.awsnative.eks.inputs.AddonTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AddonArgs extends com.pulumi.resources.ResourceArgs {

    public static final AddonArgs Empty = new AddonArgs();

    /**
     * Name of Addon
     * 
     */
    @Import(name="addonName")
    private @Nullable Output<String> addonName;

    public Optional<Output<String>> addonName() {
        return Optional.ofNullable(this.addonName);
    }

    /**
     * Version of Addon
     * 
     */
    @Import(name="addonVersion")
    private @Nullable Output<String> addonVersion;

    public Optional<Output<String>> addonVersion() {
        return Optional.ofNullable(this.addonVersion);
    }

    /**
     * Name of Cluster
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Resolve parameter value conflicts
     * 
     */
    @Import(name="resolveConflicts")
    private @Nullable Output<AddonResolveConflicts> resolveConflicts;

    public Optional<Output<AddonResolveConflicts>> resolveConflicts() {
        return Optional.ofNullable(this.resolveConflicts);
    }

    /**
     * IAM role to bind to the add-on&#39;s service account
     * 
     */
    @Import(name="serviceAccountRoleArn")
    private @Nullable Output<String> serviceAccountRoleArn;

    public Optional<Output<String>> serviceAccountRoleArn() {
        return Optional.ofNullable(this.serviceAccountRoleArn);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<AddonTagArgs>> tags;

    public Optional<Output<List<AddonTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AddonArgs() {}

    private AddonArgs(AddonArgs $) {
        this.addonName = $.addonName;
        this.addonVersion = $.addonVersion;
        this.clusterName = $.clusterName;
        this.resolveConflicts = $.resolveConflicts;
        this.serviceAccountRoleArn = $.serviceAccountRoleArn;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddonArgs $;

        public Builder() {
            $ = new AddonArgs();
        }

        public Builder(AddonArgs defaults) {
            $ = new AddonArgs(Objects.requireNonNull(defaults));
        }

        public Builder addonName(@Nullable Output<String> addonName) {
            $.addonName = addonName;
            return this;
        }

        public Builder addonName(String addonName) {
            return addonName(Output.of(addonName));
        }

        public Builder addonVersion(@Nullable Output<String> addonVersion) {
            $.addonVersion = addonVersion;
            return this;
        }

        public Builder addonVersion(String addonVersion) {
            return addonVersion(Output.of(addonVersion));
        }

        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder resolveConflicts(@Nullable Output<AddonResolveConflicts> resolveConflicts) {
            $.resolveConflicts = resolveConflicts;
            return this;
        }

        public Builder resolveConflicts(AddonResolveConflicts resolveConflicts) {
            return resolveConflicts(Output.of(resolveConflicts));
        }

        public Builder serviceAccountRoleArn(@Nullable Output<String> serviceAccountRoleArn) {
            $.serviceAccountRoleArn = serviceAccountRoleArn;
            return this;
        }

        public Builder serviceAccountRoleArn(String serviceAccountRoleArn) {
            return serviceAccountRoleArn(Output.of(serviceAccountRoleArn));
        }

        public Builder tags(@Nullable Output<List<AddonTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<AddonTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(AddonTagArgs... tags) {
            return tags(List.of(tags));
        }

        public AddonArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            return $;
        }
    }

}
