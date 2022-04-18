// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.OrganizationSecurityPolicyType;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAdaptiveProtectionConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAdvancedOptionsConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAssociationArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyCloudArmorConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyDdosProtectionConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRecaptchaOptionsConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyArgs Empty = new OrganizationSecurityPolicyArgs();

    @Import(name="adaptiveProtectionConfig")
      private final @Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig;

    public Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig() {
        return this.adaptiveProtectionConfig == null ? Codegen.empty() : this.adaptiveProtectionConfig;
    }

    @Import(name="advancedOptionsConfig")
      private final @Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig;

    public Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig() {
        return this.advancedOptionsConfig == null ? Codegen.empty() : this.advancedOptionsConfig;
    }

    /**
     * A list of associations that belong to this policy.
     * 
     */
    @Import(name="associations")
      private final @Nullable Output<List<SecurityPolicyAssociationArgs>> associations;

    public Output<List<SecurityPolicyAssociationArgs>> associations() {
        return this.associations == null ? Codegen.empty() : this.associations;
    }

    @Import(name="cloudArmorConfig")
      private final @Nullable Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig;

    public Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig() {
        return this.cloudArmorConfig == null ? Codegen.empty() : this.cloudArmorConfig;
    }

    @Import(name="ddosProtectionConfig")
      private final @Nullable Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig;

    public Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig() {
        return this.ddosProtectionConfig == null ? Codegen.empty() : this.ddosProtectionConfig;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="parentId")
      private final @Nullable Output<String> parentId;

    public Output<String> parentId() {
        return this.parentId == null ? Codegen.empty() : this.parentId;
    }

    @Import(name="recaptchaOptionsConfig")
      private final @Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig;

    public Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig() {
        return this.recaptchaOptionsConfig == null ? Codegen.empty() : this.recaptchaOptionsConfig;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a default rule with action "allow" will be added.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<SecurityPolicyRuleArgs>> rules;

    public Output<List<SecurityPolicyRuleArgs>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    /**
     * The type indicates the intended use of the security policy. CLOUD_ARMOR - Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. CLOUD_ARMOR_EDGE - Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<OrganizationSecurityPolicyType> type;

    public Output<OrganizationSecurityPolicyType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public OrganizationSecurityPolicyArgs(
        @Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig,
        @Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig,
        @Nullable Output<List<SecurityPolicyAssociationArgs>> associations,
        @Nullable Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig,
        @Nullable Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> parentId,
        @Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig,
        @Nullable Output<String> requestId,
        @Nullable Output<List<SecurityPolicyRuleArgs>> rules,
        @Nullable Output<OrganizationSecurityPolicyType> type) {
        this.adaptiveProtectionConfig = adaptiveProtectionConfig;
        this.advancedOptionsConfig = advancedOptionsConfig;
        this.associations = associations;
        this.cloudArmorConfig = cloudArmorConfig;
        this.ddosProtectionConfig = ddosProtectionConfig;
        this.description = description;
        this.displayName = displayName;
        this.labels = labels;
        this.name = name;
        this.parentId = parentId;
        this.recaptchaOptionsConfig = recaptchaOptionsConfig;
        this.requestId = requestId;
        this.rules = rules;
        this.type = type;
    }

    private OrganizationSecurityPolicyArgs() {
        this.adaptiveProtectionConfig = Codegen.empty();
        this.advancedOptionsConfig = Codegen.empty();
        this.associations = Codegen.empty();
        this.cloudArmorConfig = Codegen.empty();
        this.ddosProtectionConfig = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.parentId = Codegen.empty();
        this.recaptchaOptionsConfig = Codegen.empty();
        this.requestId = Codegen.empty();
        this.rules = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig;
        private @Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig;
        private @Nullable Output<List<SecurityPolicyAssociationArgs>> associations;
        private @Nullable Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig;
        private @Nullable Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parentId;
        private @Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<SecurityPolicyRuleArgs>> rules;
        private @Nullable Output<OrganizationSecurityPolicyType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSecurityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveProtectionConfig = defaults.adaptiveProtectionConfig;
    	      this.advancedOptionsConfig = defaults.advancedOptionsConfig;
    	      this.associations = defaults.associations;
    	      this.cloudArmorConfig = defaults.cloudArmorConfig;
    	      this.ddosProtectionConfig = defaults.ddosProtectionConfig;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parentId = defaults.parentId;
    	      this.recaptchaOptionsConfig = defaults.recaptchaOptionsConfig;
    	      this.requestId = defaults.requestId;
    	      this.rules = defaults.rules;
    	      this.type = defaults.type;
        }

        public Builder adaptiveProtectionConfig(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = adaptiveProtectionConfig;
            return this;
        }
        public Builder adaptiveProtectionConfig(@Nullable SecurityPolicyAdaptiveProtectionConfigArgs adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = Codegen.ofNullable(adaptiveProtectionConfig);
            return this;
        }
        public Builder advancedOptionsConfig(@Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig) {
            this.advancedOptionsConfig = advancedOptionsConfig;
            return this;
        }
        public Builder advancedOptionsConfig(@Nullable SecurityPolicyAdvancedOptionsConfigArgs advancedOptionsConfig) {
            this.advancedOptionsConfig = Codegen.ofNullable(advancedOptionsConfig);
            return this;
        }
        public Builder associations(@Nullable Output<List<SecurityPolicyAssociationArgs>> associations) {
            this.associations = associations;
            return this;
        }
        public Builder associations(@Nullable List<SecurityPolicyAssociationArgs> associations) {
            this.associations = Codegen.ofNullable(associations);
            return this;
        }
        public Builder associations(SecurityPolicyAssociationArgs... associations) {
            return associations(List.of(associations));
        }
        public Builder cloudArmorConfig(@Nullable Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig) {
            this.cloudArmorConfig = cloudArmorConfig;
            return this;
        }
        public Builder cloudArmorConfig(@Nullable SecurityPolicyCloudArmorConfigArgs cloudArmorConfig) {
            this.cloudArmorConfig = Codegen.ofNullable(cloudArmorConfig);
            return this;
        }
        public Builder ddosProtectionConfig(@Nullable Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig) {
            this.ddosProtectionConfig = ddosProtectionConfig;
            return this;
        }
        public Builder ddosProtectionConfig(@Nullable SecurityPolicyDdosProtectionConfigArgs ddosProtectionConfig) {
            this.ddosProtectionConfig = Codegen.ofNullable(ddosProtectionConfig);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parentId(@Nullable Output<String> parentId) {
            this.parentId = parentId;
            return this;
        }
        public Builder parentId(@Nullable String parentId) {
            this.parentId = Codegen.ofNullable(parentId);
            return this;
        }
        public Builder recaptchaOptionsConfig(@Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig) {
            this.recaptchaOptionsConfig = recaptchaOptionsConfig;
            return this;
        }
        public Builder recaptchaOptionsConfig(@Nullable SecurityPolicyRecaptchaOptionsConfigArgs recaptchaOptionsConfig) {
            this.recaptchaOptionsConfig = Codegen.ofNullable(recaptchaOptionsConfig);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder rules(@Nullable Output<List<SecurityPolicyRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<SecurityPolicyRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(SecurityPolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder type(@Nullable Output<OrganizationSecurityPolicyType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable OrganizationSecurityPolicyType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public OrganizationSecurityPolicyArgs build() {
            return new OrganizationSecurityPolicyArgs(adaptiveProtectionConfig, advancedOptionsConfig, associations, cloudArmorConfig, ddosProtectionConfig, description, displayName, labels, name, parentId, recaptchaOptionsConfig, requestId, rules, type);
        }
    }
}
