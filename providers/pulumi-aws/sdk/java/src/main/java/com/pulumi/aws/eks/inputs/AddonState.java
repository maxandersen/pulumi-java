// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AddonState extends com.pulumi.resources.ResourceArgs {

    public static final AddonState Empty = new AddonState();

    /**
     * Name of the EKS add-on. The name must match one of
     * the names returned by [list-addon](https://docs.aws.amazon.com/cli/latest/reference/eks/list-addons.html).
     * 
     */
    @Import(name="addonName")
      private final @Nullable Output<String> addonName;

    public Output<String> addonName() {
        return this.addonName == null ? Codegen.empty() : this.addonName;
    }

    /**
     * The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    @Import(name="addonVersion")
      private final @Nullable Output<String> addonVersion;

    public Output<String> addonVersion() {
        return this.addonVersion == null ? Codegen.empty() : this.addonVersion;
    }

    /**
     * Amazon Resource Name (ARN) of the EKS add-on.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName == null ? Codegen.empty() : this.clusterName;
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     * 
     */
    @Import(name="createdAt")
      private final @Nullable Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt == null ? Codegen.empty() : this.createdAt;
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     * 
     */
    @Import(name="modifiedAt")
      private final @Nullable Output<String> modifiedAt;

    public Output<String> modifiedAt() {
        return this.modifiedAt == null ? Codegen.empty() : this.modifiedAt;
    }

    /**
     * Define how to resolve parameter value conflicts
     * when migrating an existing add-on to an Amazon EKS add-on or when applying
     * version updates to the add-on. Valid values are `NONE` and `OVERWRITE`.
     * 
     */
    @Import(name="resolveConflicts")
      private final @Nullable Output<String> resolveConflicts;

    public Output<String> resolveConflicts() {
        return this.resolveConflicts == null ? Codegen.empty() : this.resolveConflicts;
    }

    /**
     * The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on&#39;s service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don&#39;t specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     * 
     */
    @Import(name="serviceAccountRoleArn")
      private final @Nullable Output<String> serviceAccountRoleArn;

    public Output<String> serviceAccountRoleArn() {
        return this.serviceAccountRoleArn == null ? Codegen.empty() : this.serviceAccountRoleArn;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * (Optional) Key-value map of resource tags, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public AddonState(
        @Nullable Output<String> addonName,
        @Nullable Output<String> addonVersion,
        @Nullable Output<String> arn,
        @Nullable Output<String> clusterName,
        @Nullable Output<String> createdAt,
        @Nullable Output<String> modifiedAt,
        @Nullable Output<String> resolveConflicts,
        @Nullable Output<String> serviceAccountRoleArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.addonName = addonName;
        this.addonVersion = addonVersion;
        this.arn = arn;
        this.clusterName = clusterName;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.resolveConflicts = resolveConflicts;
        this.serviceAccountRoleArn = serviceAccountRoleArn;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private AddonState() {
        this.addonName = Codegen.empty();
        this.addonVersion = Codegen.empty();
        this.arn = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.createdAt = Codegen.empty();
        this.modifiedAt = Codegen.empty();
        this.resolveConflicts = Codegen.empty();
        this.serviceAccountRoleArn = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddonState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> addonName;
        private @Nullable Output<String> addonVersion;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<String> createdAt;
        private @Nullable Output<String> modifiedAt;
        private @Nullable Output<String> resolveConflicts;
        private @Nullable Output<String> serviceAccountRoleArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(AddonState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.addonVersion = defaults.addonVersion;
    	      this.arn = defaults.arn;
    	      this.clusterName = defaults.clusterName;
    	      this.createdAt = defaults.createdAt;
    	      this.modifiedAt = defaults.modifiedAt;
    	      this.resolveConflicts = defaults.resolveConflicts;
    	      this.serviceAccountRoleArn = defaults.serviceAccountRoleArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder addonName(@Nullable Output<String> addonName) {
            this.addonName = addonName;
            return this;
        }
        public Builder addonName(@Nullable String addonName) {
            this.addonName = Codegen.ofNullable(addonName);
            return this;
        }
        public Builder addonVersion(@Nullable Output<String> addonVersion) {
            this.addonVersion = addonVersion;
            return this;
        }
        public Builder addonVersion(@Nullable String addonVersion) {
            this.addonVersion = Codegen.ofNullable(addonVersion);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Codegen.ofNullable(clusterName);
            return this;
        }
        public Builder createdAt(@Nullable Output<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = Codegen.ofNullable(createdAt);
            return this;
        }
        public Builder modifiedAt(@Nullable Output<String> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public Builder modifiedAt(@Nullable String modifiedAt) {
            this.modifiedAt = Codegen.ofNullable(modifiedAt);
            return this;
        }
        public Builder resolveConflicts(@Nullable Output<String> resolveConflicts) {
            this.resolveConflicts = resolveConflicts;
            return this;
        }
        public Builder resolveConflicts(@Nullable String resolveConflicts) {
            this.resolveConflicts = Codegen.ofNullable(resolveConflicts);
            return this;
        }
        public Builder serviceAccountRoleArn(@Nullable Output<String> serviceAccountRoleArn) {
            this.serviceAccountRoleArn = serviceAccountRoleArn;
            return this;
        }
        public Builder serviceAccountRoleArn(@Nullable String serviceAccountRoleArn) {
            this.serviceAccountRoleArn = Codegen.ofNullable(serviceAccountRoleArn);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public AddonState build() {
            return new AddonState(addonName, addonVersion, arn, clusterName, createdAt, modifiedAt, resolveConflicts, serviceAccountRoleArn, tags, tagsAll);
        }
    }
}
