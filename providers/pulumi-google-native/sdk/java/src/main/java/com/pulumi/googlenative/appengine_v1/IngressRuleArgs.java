// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.appengine_v1.enums.IngressRuleAction;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IngressRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressRuleArgs Empty = new IngressRuleArgs();

    /**
     * The action to take on matched requests.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<IngressRuleAction> action;

    public Output<IngressRuleAction> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    @Import(name="appId", required=true)
      private final Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    /**
     * An optional string description of this rule. This field has a maximum length of 400 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the user.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32.
     * 
     */
    @Import(name="sourceRange")
      private final @Nullable Output<String> sourceRange;

    public Output<String> sourceRange() {
        return this.sourceRange == null ? Codegen.empty() : this.sourceRange;
    }

    public IngressRuleArgs(
        @Nullable Output<IngressRuleAction> action,
        Output<String> appId,
        @Nullable Output<String> description,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> sourceRange) {
        this.action = action;
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.description = description;
        this.priority = priority;
        this.sourceRange = sourceRange;
    }

    private IngressRuleArgs() {
        this.action = Codegen.empty();
        this.appId = Codegen.empty();
        this.description = Codegen.empty();
        this.priority = Codegen.empty();
        this.sourceRange = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IngressRuleAction> action;
        private Output<String> appId;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> sourceRange;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.appId = defaults.appId;
    	      this.description = defaults.description;
    	      this.priority = defaults.priority;
    	      this.sourceRange = defaults.sourceRange;
        }

        public Builder action(@Nullable Output<IngressRuleAction> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable IngressRuleAction action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder appId(Output<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder appId(String appId) {
            this.appId = Output.of(Objects.requireNonNull(appId));
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
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder sourceRange(@Nullable Output<String> sourceRange) {
            this.sourceRange = sourceRange;
            return this;
        }
        public Builder sourceRange(@Nullable String sourceRange) {
            this.sourceRange = Codegen.ofNullable(sourceRange);
            return this;
        }        public IngressRuleArgs build() {
            return new IngressRuleArgs(action, appId, description, priority, sourceRange);
        }
    }
}
