// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetResolverRuleResult {
    /**
     * The ARN (Amazon Resource Name) for the resolver rule.
     * 
     */
    private final String arn;
    private final String domainName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * 
     */
    private final String ownerId;
    private final String resolverEndpointId;
    private final String resolverRuleId;
    private final String ruleType;
    /**
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    private final String shareStatus;
    /**
     * A map of tags assigned to the resolver rule.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetResolverRuleResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("ownerId") String ownerId,
        @CustomType.Parameter("resolverEndpointId") String resolverEndpointId,
        @CustomType.Parameter("resolverRuleId") String resolverRuleId,
        @CustomType.Parameter("ruleType") String ruleType,
        @CustomType.Parameter("shareStatus") String shareStatus,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.domainName = domainName;
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.resolverEndpointId = resolverEndpointId;
        this.resolverRuleId = resolverRuleId;
        this.ruleType = ruleType;
        this.shareStatus = shareStatus;
        this.tags = tags;
    }

    /**
     * The ARN (Amazon Resource Name) for the resolver rule.
     * 
    */
    public String arn() {
        return this.arn;
    }
    public String domainName() {
        return this.domainName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * 
    */
    public String ownerId() {
        return this.ownerId;
    }
    public String resolverEndpointId() {
        return this.resolverEndpointId;
    }
    public String resolverRuleId() {
        return this.resolverRuleId;
    }
    public String ruleType() {
        return this.ruleType;
    }
    /**
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
    */
    public String shareStatus() {
        return this.shareStatus;
    }
    /**
     * A map of tags assigned to the resolver rule.
     * 
    */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String domainName;
        private String id;
        private String name;
        private String ownerId;
        private String resolverEndpointId;
        private String resolverRuleId;
        private String ruleType;
        private String shareStatus;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.domainName = defaults.domainName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.ownerId = defaults.ownerId;
    	      this.resolverEndpointId = defaults.resolverEndpointId;
    	      this.resolverRuleId = defaults.resolverRuleId;
    	      this.ruleType = defaults.ruleType;
    	      this.shareStatus = defaults.shareStatus;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        public Builder resolverEndpointId(String resolverEndpointId) {
            this.resolverEndpointId = Objects.requireNonNull(resolverEndpointId);
            return this;
        }
        public Builder resolverRuleId(String resolverRuleId) {
            this.resolverRuleId = Objects.requireNonNull(resolverRuleId);
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder shareStatus(String shareStatus) {
            this.shareStatus = Objects.requireNonNull(shareStatus);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetResolverRuleResult build() {
            return new GetResolverRuleResult(arn, domainName, id, name, ownerId, resolverEndpointId, resolverRuleId, ruleType, shareStatus, tags);
        }
    }
}
