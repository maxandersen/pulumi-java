// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import java.util.Objects;


/**
 * Custom response key and body map.
 * 
 */
public final class RuleGroupCustomResponseBodies extends com.pulumi.resources.InvokeArgs {

    public static final RuleGroupCustomResponseBodies Empty = new RuleGroupCustomResponseBodies();

    public RuleGroupCustomResponseBodies() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomResponseBodies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomResponseBodies defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupCustomResponseBodies build() {
            return new RuleGroupCustomResponseBodies();
        }
    }
}
