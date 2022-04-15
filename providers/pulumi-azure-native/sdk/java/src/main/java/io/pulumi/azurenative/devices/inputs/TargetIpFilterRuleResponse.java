// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The IP filter rules for a provisioning Service.
 * 
 */
public final class TargetIpFilterRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final TargetIpFilterRuleResponse Empty = new TargetIpFilterRuleResponse();

    /**
     * The desired action for requests captured by this rule.
     * 
     */
    @Import(name="action", required=true)
      private final String action;

    public String action() {
        return this.action;
    }

    /**
     * The name of the IP filter rule.
     * 
     */
    @Import(name="filterName", required=true)
      private final String filterName;

    public String filterName() {
        return this.filterName;
    }

    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    @Import(name="ipMask", required=true)
      private final String ipMask;

    public String ipMask() {
        return this.ipMask;
    }

    /**
     * Target for requests captured by this rule.
     * 
     */
    @Import(name="target")
      private final @Nullable String target;

    public Optional<String> target() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public TargetIpFilterRuleResponse(
        String action,
        String filterName,
        String ipMask,
        @Nullable String target) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.filterName = Objects.requireNonNull(filterName, "expected parameter 'filterName' to be non-null");
        this.ipMask = Objects.requireNonNull(ipMask, "expected parameter 'ipMask' to be non-null");
        this.target = target;
    }

    private TargetIpFilterRuleResponse() {
        this.action = null;
        this.filterName = null;
        this.ipMask = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetIpFilterRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String filterName;
        private String ipMask;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetIpFilterRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.ipMask = defaults.ipMask;
    	      this.target = defaults.target;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder filterName(String filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }
        public Builder ipMask(String ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }        public TargetIpFilterRuleResponse build() {
            return new TargetIpFilterRuleResponse(action, filterName, ipMask, target);
        }
    }
}
