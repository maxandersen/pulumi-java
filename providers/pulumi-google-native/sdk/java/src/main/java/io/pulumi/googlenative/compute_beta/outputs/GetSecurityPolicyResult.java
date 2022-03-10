// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyAdaptiveProtectionConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyAdvancedOptionsConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyAssociationResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyRecaptchaOptionsConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyRuleResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetSecurityPolicyResult {
    private final SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig;
    private final SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig;
    /**
     * A list of associations that belong to this policy.
     * 
     */
    private final List<SecurityPolicyAssociationResponse> associations;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String displayName;
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    private final String fingerprint;
    /**
     * [Output only] Type of the resource. Always compute#securityPolicyfor security policies
     * 
     */
    private final String kind;
    /**
     * A fingerprint for the labels being applied to this security policy, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    private final String labelFingerprint;
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The parent of the security policy.
     * 
     */
    private final String parent;
    private final SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig;
    /**
     * Total count of all security policy rule tuples. A security policy can not exceed a set number of tuples.
     * 
     */
    private final Integer ruleTupleCount;
    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a default rule with action "allow" will be added.
     * 
     */
    private final List<SecurityPolicyRuleResponse> rules;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * The type indicates the intended use of the security policy. CLOUD_ARMOR - Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. CLOUD_ARMOR_EDGE - Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetSecurityPolicyResult(
        @OutputCustomType.Parameter("adaptiveProtectionConfig") SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig,
        @OutputCustomType.Parameter("advancedOptionsConfig") SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig,
        @OutputCustomType.Parameter("associations") List<SecurityPolicyAssociationResponse> associations,
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("fingerprint") String fingerprint,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("labelFingerprint") String labelFingerprint,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parent") String parent,
        @OutputCustomType.Parameter("recaptchaOptionsConfig") SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig,
        @OutputCustomType.Parameter("ruleTupleCount") Integer ruleTupleCount,
        @OutputCustomType.Parameter("rules") List<SecurityPolicyRuleResponse> rules,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @OutputCustomType.Parameter("type") String type) {
        this.adaptiveProtectionConfig = adaptiveProtectionConfig;
        this.advancedOptionsConfig = advancedOptionsConfig;
        this.associations = associations;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.displayName = displayName;
        this.fingerprint = fingerprint;
        this.kind = kind;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.name = name;
        this.parent = parent;
        this.recaptchaOptionsConfig = recaptchaOptionsConfig;
        this.ruleTupleCount = ruleTupleCount;
        this.rules = rules;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.type = type;
    }

    public SecurityPolicyAdaptiveProtectionConfigResponse getAdaptiveProtectionConfig() {
        return this.adaptiveProtectionConfig;
    }
    public SecurityPolicyAdvancedOptionsConfigResponse getAdvancedOptionsConfig() {
        return this.advancedOptionsConfig;
    }
    /**
     * A list of associations that belong to this policy.
     * 
    */
    public List<SecurityPolicyAssociationResponse> getAssociations() {
        return this.associations;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the security policy.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * [Output only] Type of the resource. Always compute#securityPolicyfor security policies
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this security policy, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. To see the latest fingerprint, make get() request to the security policy.
     * 
    */
    public String getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The parent of the security policy.
     * 
    */
    public String getParent() {
        return this.parent;
    }
    public SecurityPolicyRecaptchaOptionsConfigResponse getRecaptchaOptionsConfig() {
        return this.recaptchaOptionsConfig;
    }
    /**
     * Total count of all security policy rule tuples. A security policy can not exceed a set number of tuples.
     * 
    */
    public Integer getRuleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a default rule with action "allow" will be added.
     * 
    */
    public List<SecurityPolicyRuleResponse> getRules() {
        return this.rules;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
    */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * The type indicates the intended use of the security policy. CLOUD_ARMOR - Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. CLOUD_ARMOR_EDGE - Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig;
        private SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig;
        private List<SecurityPolicyAssociationResponse> associations;
        private String creationTimestamp;
        private String description;
        private String displayName;
        private String fingerprint;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String name;
        private String parent;
        private SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig;
        private Integer ruleTupleCount;
        private List<SecurityPolicyRuleResponse> rules;
        private String selfLink;
        private String selfLinkWithId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveProtectionConfig = defaults.adaptiveProtectionConfig;
    	      this.advancedOptionsConfig = defaults.advancedOptionsConfig;
    	      this.associations = defaults.associations;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.recaptchaOptionsConfig = defaults.recaptchaOptionsConfig;
    	      this.ruleTupleCount = defaults.ruleTupleCount;
    	      this.rules = defaults.rules;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.type = defaults.type;
        }

        public Builder setAdaptiveProtectionConfig(SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = Objects.requireNonNull(adaptiveProtectionConfig);
            return this;
        }

        public Builder setAdvancedOptionsConfig(SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig) {
            this.advancedOptionsConfig = Objects.requireNonNull(advancedOptionsConfig);
            return this;
        }

        public Builder setAssociations(List<SecurityPolicyAssociationResponse> associations) {
            this.associations = Objects.requireNonNull(associations);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLabelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setRecaptchaOptionsConfig(SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig) {
            this.recaptchaOptionsConfig = Objects.requireNonNull(recaptchaOptionsConfig);
            return this;
        }

        public Builder setRuleTupleCount(Integer ruleTupleCount) {
            this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
            return this;
        }

        public Builder setRules(List<SecurityPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSecurityPolicyResult build() {
            return new GetSecurityPolicyResult(adaptiveProtectionConfig, advancedOptionsConfig, associations, creationTimestamp, description, displayName, fingerprint, kind, labelFingerprint, labels, name, parent, recaptchaOptionsConfig, ruleTupleCount, rules, selfLink, selfLinkWithId, type);
        }
    }
}
